package com.dao;

import java.util.List;
import java.util.Map;
import com.pojo.Shop;

public  interface ShopMapper {
	List<Shop> queryAll();
	List<Shop> queryLike(String shopName);
	List<Map<String,Object>> queryAllMap();
	Shop queryLikeID(String shopId);
	int queryCount(String shopName);
	int insertSingle(Shop shop);
	int updateSingle(Shop shop);
	int deleteSingle(String shopId);
	List<Map<String,Object>> queryCustomer();
	List<Shop> queryIfByPojo(Shop s);
}
