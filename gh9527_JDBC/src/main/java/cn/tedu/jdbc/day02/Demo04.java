package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo04 {

	public static void main(String[] args) {
		//insert();
		//update();
		select();
	}
	
	public static void insert(){
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="insert into users(id,name,sex,sal) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,12);
			ps.setString(2,"jawo");
			ps.setString(3,"ÄÐ");
			ps.setInt(4,5000);
			int i=ps.executeUpdate();
			System.out.println(i);
			ps.setInt(1,13);
			ps.setString(2,"josh");
			ps.setString(3,"ÄÐ");
			ps.setInt(4,2000);
			i=ps.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeConnection(con);
		}
	}
	
	public static void update(){
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="update users set name=?,sex=?,sal=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,"lancy");
			ps.setString(2,"Å®");
			ps.setInt(3,3000);
			ps.setInt(4,13);
			int i=ps.executeUpdate();
			System.out.println(i);
			ps.setString(1,"lucy");
			ps.setString(2,"Å®");
			ps.setInt(3,3000);
			ps.setInt(4,12);
			i=ps.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void select(){
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="select * from users where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,10);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("name")+"--"+rs.getString("sex")+"--"+rs.getString("sal"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeConnection(con);
		}
	}

}
