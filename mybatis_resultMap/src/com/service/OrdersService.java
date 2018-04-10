package com.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.dao.OrdersMapper;
import com.pojo.Orders;
import com.utils.MybatisUtils;

public class OrdersService {
	//��ѯ�˿Ͷ�Ӧ������¼
	public List<Orders> many2One(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			OrdersMapper mapper=s.getMapper(OrdersMapper.class);
			return mapper.many2One();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	

}
