package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestO1 {

	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userName="meitao";
		String password="q7658648";
		
		//1.加载驱动
		Class.forName(driver);
		//2.获取数据库链接对象
		Connection con=DriverManager.getConnection(url, userName, password);
		//3.获取预处理会话对象
		PreparedStatement ps=con.prepareStatement("select * from shop");
		//4.执行预处理对象，获取结果集对象
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			String sid=rs.getString("shopid");//获取表中shopid列
			String sname=rs.getString("shopname");//获取表中shopname列
			String saddress=rs.getString("shopaddress");//获取表中shopaddress列
			String scontact=rs.getString("contact");//获取表中contact列
			System.out.println(sid+"\t"+sname+"\t"+saddress+"\t"+scontact);
		}
		//5.关闭资源
		rs.close();
		ps.close();
		con.close();
		
	}

}
