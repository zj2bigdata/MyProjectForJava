package cn.tedu.jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Ö´ÐÐDML
public class Demo02 {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@gh9527:1521:orcl","yj","123");
		Statement ste=con.createStatement();
		String sql="update student set name='ÄãºÃ' where stuid=1";
		int i=ste.executeUpdate(sql);
		System.out.println(i);
		con.close();
	}
}
