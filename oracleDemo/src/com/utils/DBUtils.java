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
	
	//��ֹ���ⲿʵ����
	private DBUtils() {}
	////��ȡ���ݿ����Ӷ���
	public static final Connection getConnection(){
		try {
			Class.forName(DRIVER);
			//public class DriverManager ����һ�� JDBC ��������Ļ�������
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//�ر���Դ
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
