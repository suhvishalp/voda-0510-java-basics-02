package com.way2learnonline.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.way2learnonline.utils.CacheUtil;

	
	@Component
	@Aspect
	public class CachingAspect {
		
		@Pointcut("execution(* com.way2learnonline.dao.CustomerDaoImpl.*(..))")
		public void mypointcut(){}
		
		@Before("mypointcut()")
		public void logBefore(){
			
		}	
		
		@Around("mypointcut()")
		public Object doCaching(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
			
			String key=proceedingJoinPoint.getSignature().getName();
			Object[] params=proceedingJoinPoint.getArgs();		
			if(params!=null &&params.length>0){
				key+="(";
				for(Object param:params){
					key+=param;
				}
				key+=")";
			}
			Object returnValue=CacheUtil.cache.get(key);
			if(returnValue==null){
				System.out.println("Cache Miss!!!");
				 returnValue=proceedingJoinPoint.proceed();
				 
				CacheUtil.cache.put(key, returnValue);						
			}else{
				System.out.println("Cache Hit !!! . Returning from cache ");
			}
			
			return returnValue;
			
		}
	
	}
