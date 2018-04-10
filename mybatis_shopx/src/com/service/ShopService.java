package com.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;

import com.dao.ShopMapper;
import com.pojo.Shop;
import com.utils.MybatisUtils;

public class ShopService {
	//��ѯ���м�¼
	public List<Shop> queryAll(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			ShopMapper mapper=s.getMapper(ShopMapper.class);
			return mapper.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	//��map��ѯ��¼
	public List<Map<String,Object>> queryAllMap(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			return s.getMapper(ShopMapper.class).queryAllMap();
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
			ShopMapper mapper=s.getMapper(ShopMapper.class);
			return mapper.queryLike(shopName);
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
				return s.getMapper(ShopMapper.class).queryLikeID(shopId);
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
				return s.getMapper(ShopMapper.class).queryCount(shopName);
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
				int i=s.getMapper(ShopMapper.class).insertSingle(shop);
				s.commit();
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
				int i=s.getMapper(ShopMapper.class).updateSingle(shop);
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
				int i=s.getMapper(ShopMapper.class).deleteSingle(shopId);
				s.commit();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return -1;
		}
		//����sql���
		public List<Map<String,Object>> queryCustomer(){
			SqlSession s=null;
			try {
				s=MybatisUtils.getSsf();
				ShopMapper mapper=s.getMapper(ShopMapper.class);
				return mapper.queryCustomer();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return null;	
		}
		
		public List<Shop> queryIfByPojo(Shop shop){
			SqlSession s=null;
			try {
				s=MybatisUtils.getSsf();
				ShopMapper mapper=s.getMapper(ShopMapper.class);
				return mapper.queryIfByPojo(shop);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return null;	
		}
}
