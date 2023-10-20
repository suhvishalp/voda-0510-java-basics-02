package com.way2learnonline.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.way2learnonline.utils.CacheUtil;




public class CachingAdvice implements MethodInterceptor {
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=invocation.getMethod().getName();
		
		Object[] params=invocation.getArguments();
		
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
			System.out.println("Cache Miss!!! hitting db");
			 returnValue=invocation.proceed();
			CacheUtil.cache.put(key, returnValue);						
		}else{
			System.out.println("Cache Hit !!! . Returning from cache ");
		}
		
		return returnValue;
	}

}

