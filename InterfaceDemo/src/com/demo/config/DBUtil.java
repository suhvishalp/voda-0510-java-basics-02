package com.demo.config;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBUtil {

	private BasicDataSource dataSource;
	private Connection connection;
	
	public DBUtil() {
		this.dataSource = new BasicDataSource();
		this.dataSource.setUsername("root");
		this.dataSource.setPassword("root123123");
		this.dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
	}

	public BasicDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}
	
	public void closeConnection(Connection conn) throws SQLException {
		if(conn!=null)
			conn.close();
	}
	
	
}
