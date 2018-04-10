package cn.tedu.jdbc.day01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private static   String DRIVER;
	private static   String URL;
	private static   String USERNAME;
	private static   String PASSWORD;
	
	static{
		try {
			Properties cfg=new Properties();
			InputStream inStream=Demo05.class.getClassLoader()
					.getResourceAsStream("db.properties");
			cfg.load(inStream);
			DRIVER=cfg.getProperty("jdbc.DRIVER");
			URL=cfg.getProperty("jdbc.URL");
			USERNAME=cfg.getProperty("jdbc.USERNAME");
			PASSWORD=cfg.getProperty("jdbc.PASSWORD");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(DRIVER);
			 con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeCon(Connection c){
		try {
			if(c!=null){
				c.close();
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
