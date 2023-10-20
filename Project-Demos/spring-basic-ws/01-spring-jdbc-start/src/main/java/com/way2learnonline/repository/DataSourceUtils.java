package com.way2learnonline.repository;

import java.sql.Connection;
import javax.sql.DataSource;

public class DataSourceUtils {
	
	//private static Map<String, Connection> map= new HashMap<String, Connection>();
	
	private static  ThreadLocal<Connection> threadLocal= new ThreadLocal<Connection>();
	
	
	public static Connection getConnection(DataSource dataSource){
		
		Connection connection=threadLocal.get();
		//Connection connection=	map.get(Thread.currentThread().getId());
		if(connection==null){
			//Get New Connection
			//map.put(Thread.currentThread().getId()+"",connection);
			threadLocal.set(connection);
		}
		
		return connection;
	}

}
