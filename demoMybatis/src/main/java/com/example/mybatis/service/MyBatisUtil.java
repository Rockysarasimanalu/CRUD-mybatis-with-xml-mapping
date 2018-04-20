package com.example.mybatis.service;

import java.io.IOException;
import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory sqlsessionfactory;
	
	private MyBatisUtil() {
		
	}
	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		}catch(IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		sqlsessionfactory = new SqlSessionFactoryBuilder().build(reader);
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlsessionfactory;
	}
}
