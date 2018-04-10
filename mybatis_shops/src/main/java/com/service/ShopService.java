package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dao.ShopMapper;
import com.pojo.Shop;
import com.pojo.ShopAndProduct;
import com.utils.MybatisUtils;

public class ShopService {
	public List<Shop> queryIfByBase(String s){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.queryIfByBase(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;	
		
	}
	
	public List<Shop> queryIfByPojo(Shop s){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.queryIfByPojo(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;	
		
	}
	
	public List<Shop> findActiveShopLike(Shop s){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.findActiveShopLike(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;	
	}
	
	public List<Shop> findWhere(Shop s){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.findWhere(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;	
		
	}
	
	public List<Shop> findByList(List<String> ids){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.findByList(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;
	}
	
	public List<Shop> findByArray(int[] ids){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.findByArray(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;
	}
	
	public List<Shop> findByMap(Map<String,String[]> map){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.findByMap(map);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;
	}
	public void getNameByPro(String s){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			Map<String,String> map=new HashMap<String, String>();
			map.put("shopId",s);
			sm.getNameByPro(map);
			System.out.println(map.get("shopName"));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
	}
	
	public List<ShopAndProduct> getSap(){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			ShopMapper sm=ss.getMapper(ShopMapper.class);
			return sm.getSap();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(ss);
		}
		return null;
	}
}
