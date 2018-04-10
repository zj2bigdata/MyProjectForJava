package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp.BasicDataSource;

public class Demo01 {

	public static void main(String[] args) {
		//�������ӳض���
		BasicDataSource bds=new BasicDataSource();
		//���ñ������(���ݿ�)
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		bds.setUsername("scott");
		bds.setPassword("q7658648");
		//�������ӳصĹ���������Բ���
		bds.setInitialSize(2);
		bds.setMaxActive(30);
		//ʹ�����ӳص����ݿ�����
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
