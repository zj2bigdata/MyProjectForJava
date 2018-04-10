package sun.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Shop;

import sun.dao.ShopDao;
import sun.utils.DBUtils;
import sun.utils.DataUtils;

public class ShopDaoImpl implements ShopDao{

	@Override
	public String findAll() {
		Connection con=null;
		try {
			List<Shop> shops=new ArrayList<Shop>();
			con=DBUtils.getConnection();
			String sql="select * from shop";
			Statement ste=con.createStatement();
			ResultSet rs=ste.executeQuery(sql);
			while(rs.next()){
				Shop shop=new Shop();
				shop.setShopId(rs.getString("shopid"));
				shop.setShopName(rs.getString("shopname"));
				shop.setShopAddress(rs.getString("shopaddress"));
				shop.setContact(rs.getString("contact"));
				shops.add(shop);
			}
			return DataUtils.listToJson(shops);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("²éÑ¯Ê§°Ü",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}

	@Override
	public void addShop(Shop s) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="insert into shop values(SQE_SHOP.nextval,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,s.getShopName());
			ps.setString(2,s.getShopAddress());
			ps.setString(3,s.getContact());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ôö¼ÓÊ§°Ü!",e);
		}finally{
			DBUtils.closeConnection(con);
		}
		
	}
	
	@Override
	public void updateShop(Shop s) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="update shop set shopname=?,shopaddress=?,contact=? where shopid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,s.getShopName());
			ps.setString(2,s.getShopAddress());
			ps.setString(3,s.getContact());
			ps.setString(4,s.getShopId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("ÐÞ¸ÄÊ§°Ü!",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}

	@Override
	public String findById(String id) {
		Connection con=null;
		try {
			Shop shop=new Shop();
			con=DBUtils.getConnection();
			String sql="select * from shop where shopid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				shop.setShopId(id);
				shop.setShopName(rs.getString("shopname"));
				shop.setShopAddress(rs.getString("shopaddress"));
				shop.setContact(rs.getString("contact"));
			}
			return DataUtils.pojoToJson(shop);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("²éÑ¯×Ô·ÑÊ§°Ü",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}
	

	@Override
	public void deleteShop(String id) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="delete from shop where shopid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("É¾³ýÊ§°Ü",e);
		}finally{
			DBUtils.closeConnection(con);
		}
		
	}
	
}
