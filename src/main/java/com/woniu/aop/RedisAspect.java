package com.woniu.aop;

import java.awt.List;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/*
 * find的切面
 * */
@Component
@Aspect
public class RedisAspect {
	@Autowired
	private JedisPool pool;
	
	
	
	@Around("execution(* com.woniu.service.*.*find*(..))")
	public Object f1(ProceedingJoinPoint pjp) {
		ObjectMapper om= new ObjectMapper();
		Object obj = null;
		Jedis jedis = null;
		//获取目标对象
		Object target = pjp.getTarget();
		StringBuffer key = new StringBuffer("");
		key.append(target.getClass().getSimpleName());
		key.append("-");
		key.append(pjp.getSignature().getName());
		key.append("-");
		key.append(Arrays.toString(pjp.getArgs()));
		String k = key.toString();
		try {
			jedis = pool.getResource();
			Boolean flage = jedis.exists(k);
			if(flage) {
				String json = jedis.get(k);
				obj = om.readValue(json,Object.class);
				System.out.println("从redis中获得数据");
			}else {
				//放行
				obj = pjp.proceed();
				String json = om.writeValueAsString(obj);
				jedis.set(k, json);
				//设置键值存活时间为1小时
				jedis.expire(k,3600);
				System.out.println("从数据库中获得数据");
				
			}
		
		} catch (Throwable e) {
			e.printStackTrace();
		}finally {
			jedis.close();
		}
		return obj;
	}
}
