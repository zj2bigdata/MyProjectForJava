package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.pojo.Shop;
import com.utils.DBUtils;

public class ShopDaoImpl implements IShopDao{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	@Override
	public List<Shop> queryAll() {
		try {
			List<Shop> list=new ArrayList<Shop>();
			con=DBUtils.getConnection();
			ps=con.prepareStatement("select * from shop");
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(new Shop(
						rs.getString("shopid"),rs.getString("shopname"),rs.getString("shopaddress"),rs.getString("contact")));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtils.close(con,ps,rs);
		}
		return null;
	}
	
	
}
