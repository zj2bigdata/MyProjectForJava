package com.test;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import com.pojo.Shop;
import com.service.ShopService; 

public class Test01 {
	private static ShopService sm=new ShopService();
	//��ѯ��������
	@Test
	public void testQureyAll(){
		List<Shop> list=sm.queryAll();
		for(Shop s:list){
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
		}
	}
	//��ѯ������map
	@Test
	public void testQureyAllMap(){
		List<Map<String,Object>> list=sm.queryAllMap();
		for(Map<String,Object> m:list){
			System.out.println(m.get("SHOPNAME"));
		}
	}
	//ģ����ѯ
	@Test
	public void testQureyLike(){
		List<Shop> list=sm.qureyLike("һ");
		for(Shop s:list){
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
		}
	}
	//ͨ��idģ����ѯ
	@Test
	public void testQureyLikeId(){
		Shop s=sm.queryLikeID("2");
			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
	}
	//��ѯģ����¼����
	@Test
	public void queryCount(){
		int list=sm.queryCount("һ");
		System.out.println("��ѯ����:"+list);
	}
	//��������
	@Test
	public void testInsertSingle(){
		Shop shop=new Shop();
		shop.setShopName("��d��");
		shop.setShopAddress("�Ϻ�·");
		shop.setContact("1368887231");
		System.out.println(sm.insertSingle(shop));
		System.out.println(shop.getShopId());
	}
	//��������
	@Test
	public void updateSingle(){
		Shop shop=new Shop("10","����","�ҵ�d����","123213123");
		System.out.println(sm.updateSingle(shop));
	}
	@Test
	public void deleteSingle(){
		System.out.println(sm.deleteSingle("30"));
	}
	//����sql���(������ҵ,����ѯ��ʾ)
	@Test
	public void testQureyAllCustomer(){
		List<Map<String,Object>> list=sm.queryCustomer();
		for(Map<String,Object> m:list){
			System.out.println(m.get("PRODUCTDESC"));
		}
	}
	
	@Test
	public void queryIfByPojo(){
		Shop shop=new Shop("2","һ","����","139");//
		List<Shop> si=sm.queryIfByPojo(shop);
		System.out.println(si);
	}
	
}
