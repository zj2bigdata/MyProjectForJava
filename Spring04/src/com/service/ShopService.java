package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ShopMapper;
import com.pojo.Shop;
@Service
@Transactional
public class ShopService {
	@Resource
	private ShopMapper shopMapper;

	public void setShopMapper(ShopMapper shopMapper) {
		this.shopMapper = shopMapper;
	}
	@Transactional(readOnly=true)
	public List<Shop> queryAll(){
		return shopMapper.queryAll();
	}
	public void delete(String... shopIds){
		for(String i:shopIds){
			shopMapper.delete(i);
		}
	}
}
