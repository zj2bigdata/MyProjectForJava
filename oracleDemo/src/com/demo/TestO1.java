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
		
		//1.��������
		Class.forName(driver);
		//2.��ȡ���ݿ����Ӷ���
		Connection con=DriverManager.getConnection(url, userName, password);
		//3.��ȡԤ����Ự����
		PreparedStatement ps=con.prepareStatement("select * from shop");
		//4.ִ��Ԥ������󣬻�ȡ���������
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			String sid=rs.getString("shopid");//��ȡ����shopid��
			String sname=rs.getString("shopname");//��ȡ����shopname��
			String saddress=rs.getString("shopaddress");//��ȡ����shopaddress��
			String scontact=rs.getString("contact");//��ȡ����contact��
			System.out.println(sid+"\t"+sname+"\t"+saddress+"\t"+scontact);
		}
		//5.�ر���Դ
		rs.close();
		ps.close();
		con.close();
		
	}

}
