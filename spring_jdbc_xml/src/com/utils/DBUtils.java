package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public final class DBUtils {
	private static BasicDataSource bds=null;
	static{
		InputStream in=null;
		try {
			bds=new BasicDataSource();
			Properties pro=new Properties();
			in=DBUtils.class.getClassLoader().getResourceAsStream("springConfig/db.properties");
			pro.load(in);
			bds.setDriverClassName(pro.getProperty("jdbc.DRIVER"));
			bds.setUrl(pro.getProperty("jdbc.URL"));
			bds.setUsername(pro.getProperty("jdbc.USERNAME"));
			bds.setPassword(pro.getProperty("jdbc.PASSWORD"));
			bds.setInitialSize(Integer.parseInt(pro.getProperty("jdbc.initialSize")));
			bds.setMaxActive(Integer.parseInt(pro.getProperty("jdbc.maxActive")));
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static final Connection getConnection(){
		try {
			return bds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//¹Ø±Õ×ÊÔ´
	public static final void close(Connection con,PreparedStatement ps,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
			bds.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
