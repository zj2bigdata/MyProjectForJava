package com.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class MybatisUtils {
	private static final SqlSessionFactory ssf=buildSessionFactory();
	private MybatisUtils(){}
	
	private static final SqlSessionFactory buildSessionFactory(){
		
		InputStream inputStream=null;
		try {
			String resource = "resources/mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory;
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(inputStream!=null)
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static final SqlSession getSsf() {
		return ssf.openSession();
	}
	
	public static final void closeSession(SqlSession s){
		s.close();
	}
	
}
