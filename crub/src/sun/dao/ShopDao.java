package sun.dao;

import java.util.List;

import com.pojo.Shop;


public interface ShopDao {
	String findAll();
	void addShop(Shop c);
	void updateShop(Shop c);
	String findById(String id);
	void deleteShop(String id);
}
