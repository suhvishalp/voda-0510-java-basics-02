package com.way2learnonline;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

import com.way2learnonline.aspects.CachingInvokationHandler;

@Component()
public class CachingProxyBean extends AbstractFactoryBean<Object> {
	
	private Object target;
	
	public CachingProxyBean(Object target) {
		this.target = target;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return this.getClass();
	}

	@Override
	protected Object createInstance() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("proxy created");
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new CachingInvokationHandler(target));
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	

}
