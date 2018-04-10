package com.dao;

import java.util.List;
import com.pojo.Shop;

public  interface ShopMapper {
	List<Shop> cache();
	boolean update();
}
