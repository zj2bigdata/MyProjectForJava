package sun.dao;

import com.pojo.Shop;


public interface ShopDao {
	String findAll();
	String addShop(Shop c);
	String updateShop(Shop c);
	String findById(String id);
	String deleteShop(String id);
}
