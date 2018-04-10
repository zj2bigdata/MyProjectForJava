package com.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.dao.ShopMapper;
import com.pojo.Shop;
import com.utils.MybatisUtils;

public class ShopService {
	//本地缓存
	public List<Shop> cach1(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			ShopMapper mapper=s.getMapper(ShopMapper.class);
			//首次会查询数据库
			 List<Shop> list=mapper.cache();
			 //System.out.println("再次查找");
			 //s.commit();
			 //再次查询会从本地一级缓存查找
			 //list=mapper.cache();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	
	//本地缓存
		public List<Shop> cach2(){
			SqlSession s=null;
			try {
				s=MybatisUtils.getSsf();
				ShopMapper mapper=s.getMapper(ShopMapper.class);
				
				return mapper.cache();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return null;	
		}
	
	
		public boolean update(){
			SqlSession s=null;
			try {
				s=MybatisUtils.getSsf();
				ShopMapper mapper=s.getMapper(ShopMapper.class);
				mapper.update();
				 s.commit();
				 //再次查询会从本地一级缓存查找
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return false;	
		}
}
