package com.dao;

import java.util.List;
import java.util.Map;

import com.pojo.Shop;
import com.pojo.ShopAndProduct;

public  interface ShopMapper {
	List<Shop> queryIfByBase(String s);
	List<Shop> queryIfByPojo(Shop s);
	List<Shop> findActiveShopLike(Shop s);
	List<Shop> findWhere(Shop s);
	List<Shop> findByList(List<String> ids);
	List<Shop> findByArray(int[] ids);
	List<Shop> findByMap(Map<String,String[]> map);
	void getNameByPro(Map<String,String> map);
	List<ShopAndProduct> getSap();
}
