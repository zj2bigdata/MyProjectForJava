package cn.tedu.jdbc.day03;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

//结果集元数据
public class Demo01 {
	static BasicDataSource bds=null;
	static Properties pro=null;
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=getConnection();
			String sql="delete from shop where shopid=?";
			ps=con.prepareStatement(sql);
			boolean f=con.getAutoCommit();
			System.out.println(f);
			con.setAutoCommit(false);
			int[] is={51,1};
			for(int i:is){
				ps.setInt(1,i);
				ps.executeUpdate();
			}
			System.out.println("即将提交");
			con.commit();
			con.setAutoCommit(f);
		} catch (Exception e) {
			try {
				System.out.println("即将回滚");
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close(con, bds);
		}
	}
	
	//获取Connection 对象
	public static Connection getConnection(){
		try {
			bds=new BasicDataSource();
			pro=new Properties();
			InputStream in=Demo01.class.getClassLoader().getResourceAsStream("db.properties");
			pro.load(in);
			String driver=pro.getProperty("jdbc.DRIVER");
			String url=pro.getProperty("jdbc.URL");
			String user=pro.getProperty("jdbc.USERNAME");
			String pwd=pro.getProperty("jdbc.PASSWORD");
			int initialSize=Integer.parseInt(pro.getProperty("jdbc.initialSize"));
			int maxActive=Integer.parseInt(pro.getProperty("jdbc.maxActive"));
			bds.setDriverClassName(driver);
			bds.setUrl(url);
			bds.setUsername(user);
			bds.setPassword(pwd);
			bds.setInitialSize(initialSize);
			bds.setMaxActive(maxActive);
			in.close();
			return bds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//关闭所有资源
	public static void close(Connection con,BasicDataSource bds){
		try {
			if(con!=null){
				con.close();
				bds.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
