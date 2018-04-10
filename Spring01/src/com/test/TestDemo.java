package com.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.CollectionArray;
import com.pojo.Shop;
import com.service.ShopService;
public class TestDemo {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("springConfig/spring.xml");
	@Test
	public void test01(){
		Shop s=ac.getBean("shop",Shop.class);//spring3.0之后
		//Shop s=(Shop)ac.getBean("shop");spring3.0之前
		//Shop s2=ac.getBean("shop",Shop.class);
		System.out.println(s);
	}
	@Test
	public void test02(){
		ShopService ss=ac.getBean("ss",ShopService.class);//spring3.0之后
		ss.addShop();
	}
	@Test
	public void test03(){
		CollectionArray ca=ac.getBean("CollectionArray",CollectionArray.class);
		System.out.println(ca);
	}
}
