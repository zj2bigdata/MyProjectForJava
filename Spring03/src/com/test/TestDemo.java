package com.test;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.ShopService;

public class TestDemo {
	ApplicationContext context=new ClassPathXmlApplicationContext("config/applicationContext.xml");
	@Test
	public void queryAll(){
		ShopService ss=context.getBean("shopService",ShopService.class);
		List<Map<String,Object>> list=ss.queryAll();
		for(Map map:list){
			System.out.println(map);
		}
	}
	
	@Test
	public void delete(){
		ShopService ss=context.getBean("shopService",ShopService.class);
		ss.delete(10,1);
	}
}
