package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DBUtils {
	private static final String DRIVER="oracle.jdbc.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USERNAME="meitao";
	private static final String PASSWORD="q7658648";
	
	//防止在外部实例化
	private DBUtils() {}
	////获取数据库链接对象
	public static final Connection getConnection(){
		try {
			Class.forName(DRIVER);
			//public class DriverManager 管理一组 JDBC 驱动程序的基本服务。
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//关闭资源
	public static final void close(ResultSet rs,PreparedStatement ps,Connection con){
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
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
