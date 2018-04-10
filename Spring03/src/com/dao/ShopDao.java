package com.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class ShopDao extends JdbcDaoSupport {
	/*
	 * init()�����൱����spring��xml������������Щ
	 * <bean id="shopDao" class="com.dao.ShopDao">
			<property name="dataSource" ref="dataSource"/>
		</bean>
	 * */
	@Resource
	public void init(DataSource dataSource){
		this.setDataSource(dataSource);
	}
	public List<Map<String,Object>> queryAll(){
		return this.getJdbcTemplate().queryForList("select * from shop");
	}
	public void delete(Integer id){
		this.getJdbcTemplate().update("delete from shop where shopid =?",id);
	}
}
