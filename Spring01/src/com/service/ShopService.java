package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShopDao;
@Service("ss")
public class ShopService {
	@Resource
	private ShopDao sd;
	
//	public void setSd(ShopDao sd) {
//		this.sd = sd;
//	}

	public void addShop(){
		sd.add();
	}
}
