package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02 {
	public static void main(String[] args) {
			String sql="select 'hello'  from dual";
			Connection con=null;
		try {
			con=DBUtils.getConnection();
			Statement ste=con.createStatement();
			ResultSet rs=ste.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
			ste.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtils.closeConnection(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
