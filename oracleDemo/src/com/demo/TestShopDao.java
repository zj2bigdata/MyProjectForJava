package com.demo;

import java.util.List;
import java.util.Map;

import com.dao.ShopDao;
import com.pojo.Shop;

public class TestShopDao {
	public static void main(String[] args) {
		//����ɾ��
		ShopDao sd=new ShopDao();
		List<Map<String, String>> map=sd.qureyAllM();
		for(Map<String,String> m:map){
			System.out.println(m);
		}
		//System.out.println(sd.chekName("6"));
//		System.out.println(sd.deleteShops("10","11","12"));;
		
//		//ģ����ѯ
//		ShopDao sd=new ShopDao();
//		List<Shop>list=sd.qureyLike("KTV");
//		for(Shop s:list){
//			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
//		}
//		Shop s=new Shop("10","1","1","1"); 
//		System.out.println(sd.addShop(s)?"�����ɹ�":"����ʧ��");
//		Shop s=new Shop("10","2","2","2");
//		System.out.println(sd.updateShop(s)?"�޸ĳɹ�":"�޸�ʧ��");
//		Shop s=new Shop("10","","","");
//		System.out.println(sd.deleteShop(s)?"ɾ���ɹ�":"ɾ��ʧ��");
		//Shop s=sd.qureySingle("9");
		//System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
//		System.out.println("shop�б�����:"+sd.countShop());
	}
}
