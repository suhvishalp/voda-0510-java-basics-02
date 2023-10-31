package com.way2learnonline.aspects;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.way2learnonline.utils.CacheUtil;

public class CachingInvokationHandler implements InvocationHandler {

	
	private Object target;
	
	public CachingInvokationHandler(Object target) {
		this.target = target;
	}
	
	
						//targetobject   //doSomething 	//["Vishal", "DD", "EE"]
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String key = method.getName(); 			//doSomething
		
		if(args!=null && args.length > 0) {
			key += "(";
			for(Object arg : args) {
				key += arg;
			}
			key += ")";
		}
		System.out.println(key);
		Object returnValue =  CacheUtil.cache.get(key);
		
		if(returnValue==null) {
			System.out.println("Cache Missed! - no values found in the cache ");
			returnValue = method.invoke(target, method);
			CacheUtil.cache.put(key, returnValue);
		}
		
		return returnValue;
	}

}


//map<K,V>

	//doSomething