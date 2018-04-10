package sun.dao;

import java.util.List;
import sun.pojo.Shop;

public interface ShopMapper {
	List<Shop> findAll();
	boolean addShop(Shop s);
	boolean updateShop(Shop s);
	Shop findById(String id);
	boolean deleteShop(String id);
}
