package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ÓÃ»§Ãû:");
		String name=sc.nextLine();
		System.out.print("ÃÜÂë:");
		String pwd=sc.nextLine();
		if(login(name,pwd)){
			System.out.println("»¶Ó­");
		}else{
			System.out.println("¹öµ°");
		}
	}
	//×Ö·û´Ü×¢Èë·çÏÕ
	public static boolean login(String name,String pwd){
		String sql="select count(*) as c from tb where name=\'"+name+"\'"+"and pwd="+"\'"+pwd+"\'";
		System.out.println(sql);
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("c")>=1){
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
