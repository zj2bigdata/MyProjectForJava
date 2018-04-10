package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp.BasicDataSource;

public class Demo01 {

	public static void main(String[] args) {
		//建立连接池对象
		BasicDataSource bds=new BasicDataSource();
		//设置必须参数(数据库)
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		bds.setUsername("scott");
		bds.setPassword("q7658648");
		//设置连接池的管理参数策略参数
		bds.setInitialSize(2);
		bds.setMaxActive(30);
		//使用连接池的数据库连接
		Connection con=null;
		try {
			con=bds.getConnection();
			String sql="select 'hello'  from dual";
			Statement ste=con.createStatement();
			ResultSet rs=ste.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
