package com.woniu.aop;

import java.awt.List;
import java.util.Arrays;
import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/*
 *为解决改变数据库数据，而redis内存中数据没变而做的的切面 
 * 
 */
//@Component
//@Aspect
public class RedisAspect2 {
	//@Autowired
	private JedisPool pool;
	//只要执行了增删改，就立即获取得到执行了操作的类名，然后获取所有的键值，
	//看哪个键值以得到的类名为开头，然后清空其内存中的数据
	//@Around("execution(* com.woniu.service.*.*update*(..)) or execution(* com.woniu.service.*.*save*(..)) or execution(* com.woniu.service.*.*delete*(..))")
	public Object f1(ProceedingJoinPoint pjp) {
		ObjectMapper om= new ObjectMapper();
		Object obj = null;
		
		Jedis jedis = pool.getResource();
		
		//获取目标对象
		Object target = pjp.getTarget();
		StringBuffer key = new StringBuffer("");
		key.append(target.getClass().getSimpleName());
		String k = key.toString();
		
		
		//遍历所有的键，判断哪个建中包含了 save，update或delete所操作的类名
		Set<String> keys = jedis.keys("*");
		for (String str : keys) {
			if(str.indexOf(k)!=-1) {
				//删除找到的键
				jedis.del(str);
			}
		}	
		//放行
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jedis.close();
		}	
		return obj;
	}
}
