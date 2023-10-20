package com.way2learnonline.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.way2learnonline.utils.CacheUtil;

	

	
	// TODO -1 Configure this class as bean using annotation
	//TODO-2 Configure this class as an aspect using annotation
	public class CachingAspect {
		

		
		// TODO-3 configure this method as around advice which should be executed for all methods of CustomerDaoImpl
		// Remember that return type of method annotated with @Around should be Object and the method must take Proceeding joinpoint as argument.
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
