package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�û���:");
		String name=sc.nextLine();
		System.out.print("����:");
		String pwd=sc.nextLine();
		if(login(name,pwd)){
			System.out.println("��ӭ");
		}else{
			System.out.println("����");
		}
	}
	//�ַ���ע�����
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
