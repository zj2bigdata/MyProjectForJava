package cn.tedu.jdbc.day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		Connection con=DBUtils.getConnection();
		Statement ste=con.createStatement();
		String sql="select ename,empno from emp";
		ResultSet rs=ste.executeQuery(sql);
		int empno=0;
		String ename=null;
		while(rs.next()){
			empno=rs.getInt("empno");
			ename=rs.getString("ename");
			System.out.println(empno+"--"+ename);
		}
		con.close();
	}
}
