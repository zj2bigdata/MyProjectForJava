package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.pojo.Shop;
import com.utils.MybatisUtils;

public class ShopMapper {
	//��ѯ
	public List<Shop> qureyAll(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.selectList("queryAll");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	public List<Map<String,Object>> queryAllMap(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.selectList("queryAllMap");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	//ģ����ѯ
	public List<Shop> qureyLike(String shopName){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.selectList("queryLike",shopName);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	//id��ѯ
	public Shop queryLikeID(String shopId){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.selectOne("queryLikeID", shopId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	//��ѯ��¼����
	public int queryCount(String shopName){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.selectOne("queryCount", shopName);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return -1;	
	}
	
	//����
	public int insertSingle(Shop shop){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			int i=s.insert("insertSingle", shop);
			s.commit(false);
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return -1;
	}
	//����
	public int updateSingle(Shop shop){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			int i=s.update("updateSingle",shop);
			s.commit();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return -1;
	}
	//ɾ��
	public int deleteSingle(String shopId){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			int i=s.delete("deleteSingle",shopId);
			s.commit();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return -1;
	}
	//ʹ��sql��ǩ��ѯ
	public List<Shop> querySingleShop(String place){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			Shop sh=new Shop();
			sh.setShopAddress(place);
			sh.setShopName("wode");
			return s.selectList("querySingleShop",sh);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	//ʹ��sql��ǩ����
	public boolean updateSingleShop(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			Shop sh=new Shop();
			sh.setShopName("wode");
			boolean f=s.update("updateSingleShop", sh)!=0;
			s.commit();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		
		return false;
		
	}
}
