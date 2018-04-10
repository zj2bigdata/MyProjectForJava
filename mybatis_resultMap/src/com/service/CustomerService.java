package com.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.dao.CustomerMapper;
import com.pojo.Customer;
import com.utils.MybatisUtils;

public class CustomerService {
	//查询顾客对应订单记录
	public List<Customer> one2Many(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			CustomerMapper mapper=s.getMapper(CustomerMapper.class);
			return mapper.one2Many();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
	public List<Customer> many2Many(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			CustomerMapper mapper=s.getMapper(CustomerMapper.class);
			return mapper.many2Many();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
}
