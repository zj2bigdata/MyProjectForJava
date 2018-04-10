package smp.customerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import smp.customer.Customer;
import smp.utils.DBUtils;

public class CustomerDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//获取数据
	public List<Customer> queryAll(){
		List<Customer> list=new ArrayList<Customer>();
		String sql="select * from cst";
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				String loginname=rs.getString("loginname");
				String loginpwd=rs.getString("loginpwd");
				Customer c=new Customer(loginname,loginpwd);
				list.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
	

	//插入数据
	public boolean insert(Customer c){
		String sql="insert into cst values(seq_customer_customerid.nextval,?,?)";
		try {
			//插入前判断customer中是否有该用户
			//将用户输入的值插入customer表中
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,c.getLoginname());
			ps.setString(2,c.getLoginpwd());
			int row=ps.executeUpdate();
			if(row!=0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.close(rs, ps, con);
		}
		return false;
	}
}
