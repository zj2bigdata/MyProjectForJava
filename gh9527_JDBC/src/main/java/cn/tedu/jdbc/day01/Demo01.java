package cn.tedu.jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@gh9527:1521:orcl", "yj", "123");
		System.out.println(con.getClass());
		Statement ste=con.createStatement();
		String sql="create table Teacher(id number(2),name varchar2(8),job varchar2(10))";
		System.out.println(ste.execute(sql)?"�н���������ɹ�":"�޽����Ҳ�Ǵ����ɹ�");//����ʧ�ܻ����쳣
		con.close();
	}

}
