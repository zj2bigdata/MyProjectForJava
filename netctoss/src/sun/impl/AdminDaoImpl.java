package sun.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import sun.dao.AdminDao;
import sun.entity.Admin;
import sun.utils.DBUtils;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin findByCode(String code) {
			Connection con=null;
		try {
			con=DBUtils.getConnection();
			Admin ad=new Admin();
			String sql="select * from admin_info where admin_code=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,code);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
					ad.setId(rs.getInt("ID"));
					ad.setAdminCode(rs.getString("ADMIN_CODE"));
					ad.setPassword(rs.getString("PASSWORD"));
					ad.setName(rs.getString("NAME"));
					ad.setEmail(rs.getString("EMAIL"));
					ad.setTelephone(rs.getString("TELEPHONE"));
					ad.setEnrollDate(rs.getTimestamp("ENROLLDATE"));
				return ad;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("查询管理员失败!",e);
		}finally{
			DBUtils.closeConnection(con);
		}
		return null;
	}
	
	public static void main(String[] args) {
		AdminDaoImpl adi=new AdminDaoImpl();
		Admin ad=adi.findByCode("zj");
		System.out.println(ad.getPassword());
	}
}
