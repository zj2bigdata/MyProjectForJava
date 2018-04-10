package cn.tedu.jdbc.day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03 {
	public static void main(String[] args) {
		Thread t1=new TestDataBsic(6000);
		Thread t2=new TestDataBsic(10000);
		Thread t3=new TestDataBsic(1000);
		t1.start();
		t2.start();
		t3.start();
	}
}
class TestDataBsic extends Thread{
	private long time;
	public TestDataBsic(long time){
		this.time =time;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName());
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			Statement ste=con.createStatement();
			ResultSet rs=ste.executeQuery("select 'hello' as text from dual");
			while(rs.next()){
				System.out.println(rs.getString("text"));
			}
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
