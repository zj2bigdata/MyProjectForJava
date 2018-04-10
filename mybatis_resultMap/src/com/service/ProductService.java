package com.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dao.ProductMapper;
import com.pojo.Product;
import com.utils.MybatisUtils;

public class ProductService {
	public List<Product> many2One(){
		SqlSession s=null;
		try {
			s=MybatisUtils.getSsf();
			ProductMapper mapper=s.getMapper(ProductMapper.class);
			return mapper.many2One();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(s);
		}
		return null;	
	}
}
