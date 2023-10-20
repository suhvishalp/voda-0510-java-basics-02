package com.way2learnonline.utils;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.way2learnonline.common.CachingInvocationHandler;

 public class CachingProxyFactoryBean extends AbstractFactoryBean<Object> {	
	
	private Object target;
	
	@Override
	protected Object createInstance() throws Exception {	
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
							target.getClass().getInterfaces(),
							new CachingInvocationHandler(target));			
	}
	
	
	
	

	@Override
	public Class<?> getObjectType() {
		
		return this.getClass();
	}

	

	

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	

}
