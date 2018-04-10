package com.test;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import com.pojo.Shop;
import com.service.ShopService; 

public class Test01 {
	private static ShopService sm=new ShopService();
	//查询所有数据
	@Test
	public void testQureyAll(){
		List<Shop> list=sm.queryAll();
		for(Shop s:list){
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
		}
	}
	//查询数据用map
	@Test
	public void testQureyAllMap(){
		List<Map<String,Object>> list=sm.queryAllMap();
		for(Map<String,Object> m:list){
			System.out.println(m.get("SHOPNAME"));
		}
	}
	//模糊查询
	@Test
	public void testQureyLike(){
		List<Shop> list=sm.qureyLike("一");
		for(Shop s:list){
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
		}
	}
	//通过id模糊查询
	@Test
	public void testQureyLikeId(){
		Shop s=sm.queryLikeID("2");
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
	}
	//查询模糊记录条数
	@Test
	public void queryCount(){
		int list=sm.queryCount("一");
		System.out.println("查询条数:"+list);
	}
	//插入数据
	@Test
	public void testInsertSingle(){
		Shop shop=new Shop();
		shop.setShopName("家d乐");
		shop.setShopAddress("上海路");
		shop.setContact("1368887231");
		System.out.println(sm.insertSingle(shop));
		System.out.println(shop.getShopId());
	}
	//跟新数据
	@Test
	public void updateSingle(){
		Shop shop=new Shop("10","家里","我的d大叔","123213123");
		System.out.println(sm.updateSingle(shop));
	}
	@Test
	public void deleteSingle(){
		System.out.println(sm.deleteSingle("30"));
	}
	//复杂sql语句(课上作业,多表查询显示)
	@Test
	public void testQureyAllCustomer(){
		List<Map<String,Object>> list=sm.queryCustomer();
		for(Map<String,Object> m:list){
			System.out.println(m.get("PRODUCTDESC"));
		}
	}
	
	@Test
	public void queryIfByPojo(){
		Shop shop=new Shop("2","一","江汉","139");//
		List<Shop> si=sm.queryIfByPojo(shop);
		System.out.println(si);
	}
	
}
