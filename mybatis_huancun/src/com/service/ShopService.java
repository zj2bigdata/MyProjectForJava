package com.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.dao.ShopMapper;
import com.pojo.Shop;
import com.utils.MybatisUtils;

public class ShopService {
	//���ػ���
	public List<Shop> cach1(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			ShopMapper mapper=s.getMapper(ShopMapper.class);
			//�״λ��ѯ���ݿ�
			 List<Shop> list=mapper.cache();
			 //System.out.println("�ٴβ���");
			 //s.commit();
			 //�ٴβ�ѯ��ӱ���һ���������
			 //list=mapper.cache();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	
	//���ػ���
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
				 //�ٴβ�ѯ��ӱ���һ���������
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(s);
			}
			return false;	
		}
}
