package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Shop;
import com.service.ShopService;

public class TestDemo {
	private ApplicationContext context=new ClassPathXmlApplicationContext("config/Spring.xml");
	@Test
	public void queryAll(){
		ShopService ss=context.getBean("shopService",ShopService.class);
		List<Shop> list=ss.queryAll();
		System.out.println(list.size());
	}
	@Test
	public void delete(){
		ShopService ss=context.getBean("shopService",ShopService.class);
		ss.delete("10","1");
	}
}
