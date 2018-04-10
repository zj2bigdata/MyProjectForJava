package com.demo;

import java.util.List;
import java.util.Map;

import com.dao.ShopDao;
import com.pojo.Shop;

public class TestShopDao {
	public static void main(String[] args) {
		//批量删除
		ShopDao sd=new ShopDao();
		List<Map<String, String>> map=sd.qureyAllM();
		for(Map<String,String> m:map){
			System.out.println(m);
		}
		//System.out.println(sd.chekName("6"));
//		System.out.println(sd.deleteShops("10","11","12"));;
		
//		//模糊查询
//		ShopDao sd=new ShopDao();
//		List<Shop>list=sd.qureyLike("KTV");
//		for(Shop s:list){
//			System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
//		}
//		Shop s=new Shop("10","1","1","1"); 
//		System.out.println(sd.addShop(s)?"新增成功":"新增失败");
//		Shop s=new Shop("10","2","2","2");
//		System.out.println(sd.updateShop(s)?"修改成功":"修改失败");
//		Shop s=new Shop("10","","","");
//		System.out.println(sd.deleteShop(s)?"删除成功":"删除失败");
		//Shop s=sd.qureySingle("9");
		//System.out.println(s.getShopId()+"\t"+s.getShopName()+"\t"+s.getShopAddress()+"\t"+s.getContact());
//		System.out.println("shop列表条数:"+sd.countShop());
	}
}
