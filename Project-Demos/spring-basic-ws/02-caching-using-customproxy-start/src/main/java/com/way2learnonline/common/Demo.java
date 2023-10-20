package com.way2learnonline.common;

import java.lang.reflect.Proxy;
import com.way2learnonline.dao.CustomerDao;
import com.way2learnonline.dao.CustomerDaoImpl;



public class Demo {

	public static void main(String[] args) throws Exception {
		CustomerDaoImpl target= new CustomerDaoImpl();
		
		
		CachingInvocationHandler handler=
				new CachingInvocationHandler(target);
		
		CustomerDao customerDao=(CustomerDao)
				Proxy.newProxyInstance(
						target.getClass().getClassLoader(),
						target.getClass().getInterfaces(),
						handler);
		
		 customerDao.getAllCustomers();
	}

}
