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
	private Connection con;//���ض����ݿ�����ӣ��Ự������������������ִ�� SQL ��䲢���ؽ����
	private PreparedStatement ps;//��ʾԤ����� SQL ���Ķ���
	private ResultSet rs;//��ʾ���ݿ����������ݱ�ͨ��ͨ��ִ�в�ѯ���ݿ���������
	private CallableStatement cs;//����ִ�� SQL �洢���̵Ľӿڡ�
	
	//��ѯ SELECT ������ FROM ������
	public List<Shop> qureyAll(){
		String sql="select * from shop";
		List<Shop> list=new ArrayList<Shop>();
		try {
			//2.��ȡ���ݿ����Ӷ���
			con=DBUtils.getConnection();
			//3.��ȡԤ����Ự����  
			//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			//4.ִ��Ԥ������󣬻�ȡ���������
			rs=ps.executeQuery();//select���ʹ�ø÷���
			while(rs.next()){
				String sid=rs.getString("shopid");//��ȡ����shopid��
				String sname=rs.getString("shopname");//��ȡ����shopname��
				String saddress=rs.getString("shopaddress");//��ȡ����shopaddress��
				String scontact=rs.getString("contact");//��ȡ����contact��
				Shop s=new Shop(sid,sname,saddress,scontact);//ʵ����Shop����
				list.add(s);//��Ӷ���List����
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
	
	//��ѯ SELECT ������ FROM ������(����map<String,String>)
		public List<Map<String,String>> qureyAllM(){
			String sql="select * from shop";
			List<Map<String,String>> list=new ArrayList<Map<String,String>>();
			try {
				//2.��ȡ���ݿ����Ӷ���
				con=DBUtils.getConnection();
				//3.��ȡԤ����Ự����  
				//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
				//prepareStatement(String sql)throws SQLException
				ps=con.prepareStatement(sql);
				//4.ִ��Ԥ������󣬻�ȡ���������
				rs=ps.executeQuery();//select���ʹ�ø÷���
				while(rs.next()){
					String sid=rs.getString("shopid");//��ȡ����shopid��
					String sname=rs.getString("shopname");//��ȡ����shopname��
					String saddress=rs.getString("shopaddress");//��ȡ����shopaddress��
					String scontact=rs.getString("contact");//��ȡ����contact��
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
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return list;
		}
	
	//���ݹؼ���ģ����ѯ
	public List<Shop> qureyLike(String shopName){
		String sql="select * from shop where shopname like ?";
		List<Shop> list=new ArrayList<Shop>();
		try {
			//2.��ȡ���ݿ����Ӷ���
			con=DBUtils.getConnection();
			//3.��ȡԤ����Ự����  
			//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			ps.setString(1,"%"+shopName+"%");
			//4.ִ��Ԥ������󣬻�ȡ���������
			rs=ps.executeQuery();//select���ʹ�ø÷���
			while(rs.next()){
				String sid=rs.getString("shopid");//��ȡ����shopid��
				String sname=rs.getString("shopname");//��ȡ����shopname��
				String saddress=rs.getString("shopaddress");//��ȡ����shopaddress��
				String scontact=rs.getString("contact");//��ȡ����contact��
				Shop s=new Shop(sid,sname,saddress,scontact);//ʵ����Shop����
				list.add(s);//��Ӷ���List����
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
	//�鿴������¼
	public Shop qureySingle(String shopid){
		String sql="select * from shop where shopid =?";
		try {
			//2.��ȡ���ݿ����Ӷ���
			con=DBUtils.getConnection();
			//3.��ȡԤ����Ự����  
			//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(sql);
			ps.setString(1,shopid);//����sql�����ĵ�һ���ʺŵ�ֵ
			//4.ִ��Ԥ������󣬻�ȡ���������
			rs=ps.executeQuery();//select���ʹ�ø÷���
			if(rs.next()){
				String sname=rs.getString("shopname");//��ȡ����shopname��
				String saddress=rs.getString("shopaddress");//��ȡ����shopaddress��
				String scontact=rs.getString("contact");//��ȡ����contact��
				Shop s=new Shop(shopid,sname,saddress,scontact);//ʵ����Shop����
				return s;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return null;
	}
	//���� INSERT INTO ������ VALUES (ֵ1, ֵ2,....)
	public boolean addShop(Shop shop){
		String sql="insert into shop values(?,?,?,?)";//����
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,shop.getShopId());
			ps.setString(2,shop.getShopName());
			ps.setString(3,shop.getShopAddress());
			ps.setString(4,shop.getContact());
			int row=ps.executeUpdate();//���ڲ���,����int����
			if(row>0){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return false;	
	}
	//���� UPDATE ������ SET ������ = ��ֵ WHERE ������ = ĳֵ
		public boolean updateShop(Shop shop){
			String sql="update shop set shopname=?,shopaddress=?,contact=? where shopid=?";//����
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,shop.getShopName());
				ps.setString(2,shop.getShopAddress());
				ps.setString(3,shop.getContact());
				ps.setString(4,shop.getShopId());
				int row=ps.executeUpdate();//���ڲ���,����int����
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		//ɾ�� DELETE FROM ������ WHERE ������ = ֵ
		public boolean deleteShop(Shop shop){
			String sql="delete from shop where shopid=?";//����
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,shop.getShopId());
				int row=ps.executeUpdate();//���ڲ���,����int����
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		//����ɾ��
		public boolean deleteShops(String... shopid){
			String sql="delete from shop where shopid=?";//����
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
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
		
		//������������������count��
		public int countShop(){
			String sql=" select count(*) from shop";//����
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()){
					//�� Java ��������� int ����ʽ������ ResultSet ����ĵ�ǰ����ָ���е�ֵ��
					return rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return 0;	
		}
		//��ѯָ��shopid���̵���
		public String chekName(String shopid){
			
			try {
				con=DBUtils.getConnection();
				//����һ�� CallableStatement �������������ݿ�洢����
				cs=con.prepareCall("call pro_name(?,?)");
				//��ָ����������Ϊ���� Java String ֵ���ڽ���ֵ���͸����ݿ�ʱ������������ת����һ�� SQL VARCHAR �� LONGVARCHAR ֵ
				cs.setString(1,shopid);
				//��˳��λ�� parameterIndex �� OUT ����ע��Ϊ JDBC ���� sqlType
				cs.registerOutParameter(2,Types.VARCHAR);
				//�ڴ˼̳� ���� PreparedStatement ��cs������ִ�� SQL ��䣬�����������κ������ SQL ���
				cs.execute();
				return cs.getString(2);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.�ر���Դ
				DBUtils.close(rs, cs, con);
			}
			return null;	
		}
}
