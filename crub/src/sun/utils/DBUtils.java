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
			//��ʼ������
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
		//getConnection�����ӳ��л�ȡ�ظ�������,������ӳ�����,��ȴ�
		//�����ӹ黹���ȡ
		try {
			Connection con=bds.getConnection();
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection(Connection con){
		//���ù������ӹ黹�����ӳ�
		try {
			if(con!=null){
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
