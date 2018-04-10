package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShopDaoImpl;
import com.pojo.Shop;
@Service
public class ShopService {
	@Resource
	private ShopDaoImpl shopDaoImpl;

	public List<Shop> getShopList(){
		return shopDaoImpl.queryAll();
	}
}
