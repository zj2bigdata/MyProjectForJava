package com.test;

import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import com.pojo.Shop;
import com.service.ShopService; 

public class Test01 {
	private static ShopService sm=new ShopService();
	//利用一级缓存查询所有数据
	@Test
	public void testQureyAll(){
		List<Shop> list=sm.cach1();
		for(Shop s:list){
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
		}
	}
	
	@Test
	//二级缓存
	public void testQureyAll2(){
		List<Shop> list=sm.cach2();
		sm.update();
		list=sm.cach2();
		System.out.println(list.size());
	}
	
	@Test
	public void test(){
		InputStream in = Test01.class.getResourceAsStream("resources/log4j.properties");
		PropertyConfigurator.configure(in);
		Logger log  = Logger.getLogger(Test01.class);
	}
	
	
	
}
