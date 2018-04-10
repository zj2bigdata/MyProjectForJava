package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.pojo.Shop;
@Repository
public interface ShopMapper {
	List<Shop> queryAll();
	void delete(String shopIds);
}
