 package sun.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public final class DBUtils {
	private static String driver;
	private static String url;
	private static String userName;
	private static String password;
	private static int initialSize;
	private static int maxActive;
	private static BasicDataSource bds;
	static{
		bds=new BasicDataSource();
		Properties pro=new Properties();
		try {
			InputStream in=DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
			pro.load(in);
			//初始化参数
			driver=pro.getProperty("jdbc.DRIVER");
			url=pro.getProperty("jdbc.URL");
			userName=pro.getProperty("jdbc.USERNAME");
			password=pro.getProperty("jdbc.PASSWORD");
			initialSize=Integer.parseInt(pro.getProperty("jdbc.initialSize"));
			maxActive=Integer.parseInt(pro.getProperty("jdbc.maxActive"));
			bds.setDriverClassName(driver);
			bds.setUrl(url);
			bds.setUsername(userName);
			bds.setPassword(password);
			bds.setInitialSize(initialSize);
			bds.setMaxActive(maxActive);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		//getConnection从连接池中获取重复的连接,如果连接池满了,则等待
		//有链接归还则获取
		try {
			Connection con=bds.getConnection();
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection(Connection con){
		//将用过的链接归还到连接池
		try {
			if(con!=null){
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
