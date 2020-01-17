package com.woniu.aop;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.woniu.annotation.Function;

@Component
@Aspect
public class LogAspect {
	@Around("execution(* com.woniu.controller.*.*(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		//放行方法
		Object result = pjp.proceed();
		//得到操作时间
		Date date=new Date();
		String formatdate = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(date);
		//获得request对象
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		//获得当前登录的用户
		Subject subject = SecurityUtils.getSubject();
		Object principal = subject.getPrincipal();
		//得到ip地址
		String ip = request.getRemoteHost();
		//得到所有被切面拦截的方法
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = signature.getMethod();
		if(method.isAnnotationPresent(Function.class)) {
			Function function = method.getAnnotation(Function.class);
			String operator=function.value();
			Signature signature2 = pjp.getSignature();
			//打印日志
			System.out.println("操作时间："+formatdate+",操作人："+principal+",操作方法："+operator+",操作ip："+ip);
		}
		return result;
	}
}
