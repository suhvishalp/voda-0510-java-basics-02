package com.way2learnonline.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.way2learnonline.utils.CacheUtil;



 public class CachingInvocationHandler implements InvocationHandler {
	
	private Object target;
 
	public CachingInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] params)
			throws Throwable {	
		
		String key = method.getReturnType().getName()+method.getName();//+"(";
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
			returnValue=method.invoke(target, params);
			CacheUtil.cache.put(key, returnValue);
		}else{
			System.out.println("Cache Hit !!! . Returning from cache ");
		}				
		return returnValue;
	}

}
