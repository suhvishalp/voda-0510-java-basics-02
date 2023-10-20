package com.way2learnonline.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import com.way2learnonline.utils.CacheUtil;

public class CachingAspect {
	
	
	public CachingAspect() {
		System.out.println("CachingAspect.CachingAspect()");
	}
	
	public void doBefore(){
		System.out.println("CachingAspect.doBefore()");
	}
	
	public void doAfter(){
		System.out.println("CachingAspect.doAfter()");
	}
	
	

	

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
		System.out.println(key);
		
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
