package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pojo.Shop;
import com.utils.DBUtils;

public class ShopDao {
	private Connection con;//与特定数据库的连接（会话）。在连接上下文中执行 SQL 语句并返回结果。
	private PreparedStatement ps;//表示预编译的 SQL 语句的对象
	private ResultSet rs;//表示数据库结果集的数据表，通常通过执行查询数据库的语句生成
	private CallableStatement cs;//用于执行 SQL 存储过程的接口。
	
	//查询 SELECT 列名称 FROM 表名称
	public List<Shop> qureyAll(){
		String sql="select * from shop";
		List<Shop> list=new ArrayList<Shop>();
		try {
			//2.获取数据库链接对象
			con=DBUtils.getConnection();
			//3.获取预处理会话对象  
			//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			//4.执行预处理对象，获取结果集对象
			rs=ps.executeQuery();//select语句使用该方法
			while(rs.next()){
				String sid=rs.getString("shopid");//获取表中shopid列
				String sname=rs.getString("shopname");//获取表中shopname列
				String saddress=rs.getString("shopaddress");//获取表中shopaddress列
				String scontact=rs.getString("contact");//获取表中contact列
				Shop s=new Shop(sid,sname,saddress,scontact);//实例化Shop对象
				list.add(s);//添加对象到List数组
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
	
	//查询 SELECT 列名称 FROM 表名称(利用map<String,String>)
		public List<Map<String,String>> qureyAllM(){
			String sql="select * from shop";
			List<Map<String,String>> list=new ArrayList<Map<String,String>>();
			try {
				//2.获取数据库链接对象
				con=DBUtils.getConnection();
				//3.获取预处理会话对象  
				//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
				//prepareStatement(String sql)throws SQLException
				ps=con.prepareStatement(sql);
				//4.执行预处理对象，获取结果集对象
				rs=ps.executeQuery();//select语句使用该方法
				while(rs.next()){
					String sid=rs.getString("shopid");//获取表中shopid列
					String sname=rs.getString("shopname");//获取表中shopname列
					String saddress=rs.getString("shopaddress");//获取表中shopaddress列
					String scontact=rs.getString("contact");//获取表中contact列
					Map<String,String> map=new HashMap<String, String>();
					map.put("sid", sid);
					map.put("sname", sname);
					map.put("saddress", saddress);
					map.put("scontact", scontact);
					list.add(map);
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return list;
		}
	
	//根据关键字模糊查询
	public List<Shop> qureyLike(String shopName){
		String sql="select * from shop where shopname like ?";
		List<Shop> list=new ArrayList<Shop>();
		try {
			//2.获取数据库链接对象
			con=DBUtils.getConnection();
			//3.获取预处理会话对象  
			//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			ps.setString(1,"%"+shopName+"%");
			//4.执行预处理对象，获取结果集对象
			rs=ps.executeQuery();//select语句使用该方法
			while(rs.next()){
				String sid=rs.getString("shopid");//获取表中shopid列
				String sname=rs.getString("shopname");//获取表中shopname列
				String saddress=rs.getString("shopaddress");//获取表中shopaddress列
				String scontact=rs.getString("contact");//获取表中contact列
				Shop s=new Shop(sid,sname,saddress,scontact);//实例化Shop对象
				list.add(s);//添加对象到List数组
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
	//查看单条记录
	public Shop qureySingle(String shopid){
		String sql="select * from shop where shopid =?";
		try {
			//2.获取数据库链接对象
			con=DBUtils.getConnection();
			//3.获取预处理会话对象  
			//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			ps.setString(1,shopid);//设置sql语句里的第一个问号的值
			//4.执行预处理对象，获取结果集对象
			rs=ps.executeQuery();//select语句使用该方法
			if(rs.next()){
				String sname=rs.getString("shopname");//获取表中shopname列
				String saddress=rs.getString("shopaddress");//获取表中shopaddress列
				String scontact=rs.getString("contact");//获取表中contact列
				Shop s=new Shop(shopid,sname,saddress,scontact);//实例化Shop对象
				return s;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return null;
	}
	//新增 INSERT INTO 表名称 VALUES (值1, 值2,....)
	public boolean addShop(Shop shop){
		String sql="insert into shop values(?,?,?,?)";//插入
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,shop.getShopId());
			ps.setString(2,shop.getShopName());
			ps.setString(3,shop.getShopAddress());
			ps.setString(4,shop.getContact());
			int row=ps.executeUpdate();//用于插入,返回int类型
			if(row>0){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return false;	
	}
	//跟新 UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
		public boolean updateShop(Shop shop){
			String sql="update shop set shopname=?,shopaddress=?,contact=? where shopid=?";//插入
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,shop.getShopName());
				ps.setString(2,shop.getShopAddress());
				ps.setString(3,shop.getContact());
				ps.setString(4,shop.getShopId());
				int row=ps.executeUpdate();//用于插入,返回int类型
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		//删除 DELETE FROM 表名称 WHERE 列名称 = 值
		public boolean deleteShop(Shop shop){
			String sql="delete from shop where shopid=?";//插入
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,shop.getShopId());
				int row=ps.executeUpdate();//用于插入,返回int类型
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		//批量删除
		public boolean deleteShops(String... shopid){
			String sql="delete from shop where shopid=?";//插入
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				for(String sid:shopid){
					ps.setString(1,sid);
					ps.addBatch();
				}
				ps.executeBatch();
					return true;
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		
		//检索表中数据条数（count）
		public int countShop(){
			String sql=" select count(*) from shop";//插入
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()){
					//以 Java 编程语言中 int 的形式检索此 ResultSet 对象的当前行中指定列的值。
					return rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return 0;	
		}
		//查询指定shopid的商店名
		public String chekName(String shopid){
			
			try {
				con=DBUtils.getConnection();
				//创建一个 CallableStatement 对象来调用数据库存储过程
				cs=con.prepareCall("call pro_name(?,?)");
				//将指定参数设置为给定 Java String 值。在将此值发送给数据库时，驱动程序将它转换成一个 SQL VARCHAR 或 LONGVARCHAR 值
				cs.setString(1,shopid);
				//按顺序位置 parameterIndex 将 OUT 参数注册为 JDBC 类型 sqlType
				cs.registerOutParameter(2,Types.VARCHAR);
				//在此继承 父类 PreparedStatement 的cs对象中执行 SQL 语句，该语句可以是任何种类的 SQL 语句
				cs.execute();
				return cs.getString(2);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, cs, con);
			}
			return null;	
		}
}
