package com.service;

import java.util.List;

import com.dao.ShopDaoImpl;
import com.pojo.Shop;

public class ShopService {
	private ShopDaoImpl sdi;
	
	public void setSdi(ShopDaoImpl sdi) {
		this.sdi = sdi;
	}

	public List<Shop> getShopList(){
		return sdi.queryAll();
	}
}
