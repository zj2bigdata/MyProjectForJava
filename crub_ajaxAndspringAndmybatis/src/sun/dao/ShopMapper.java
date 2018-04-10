package sun.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import sun.pojo.Shop;

@Repository
public interface ShopMapper {
	List<Shop> findAll();
	void addShop(Shop c);
	void updateShop(Shop c);
	Shop findById(String id);
	void deleteShop(String id);
}
