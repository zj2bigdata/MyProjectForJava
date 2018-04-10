package cn.tedu.jdbc.day01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		Properties cfg=new Properties();
		InputStream inStream=Demo05.class.getClassLoader()
				.getResourceAsStream("db.properties");
		cfg.load(inStream);
		System.out.println(cfg.getProperty("jdbc.DRIVER"));
		System.out.println(cfg.size());
		System.out.println(cfg.isEmpty());
	}
}
