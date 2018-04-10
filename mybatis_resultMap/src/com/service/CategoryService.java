package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.CategoryMapper;
import com.pojo.Category;
import com.utils.MybatisUtils;

public class CategoryService {
	public List<Category> many2Many(){
		SqlSession ss=null;
		try {
			ss=MybatisUtils.getSsf();
			CategoryMapper mapper=ss.getMapper(CategoryMapper.class);
			return mapper.many2Many();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ss!=null){
				MybatisUtils.closeSession(ss);
			}
		}
		return null;
		
	}
}
