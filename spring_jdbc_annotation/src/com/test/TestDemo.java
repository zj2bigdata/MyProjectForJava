package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Shop;
import com.service.ShopService;


public class TestDemo {
	ApplicationContext ac=new ClassPathXmlApplicationContext("springConfig/spring.xml");
	@Test
	public void test01(){
		ShopService ss=ac.getBean("shopService",ShopService.class);
		List<Shop> list=ss.getShopList();
		System.out.println(list.size());
	}
	
}
