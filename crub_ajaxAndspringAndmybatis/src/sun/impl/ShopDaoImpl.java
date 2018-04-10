package sun.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.dao.ShopMapper;
import sun.pojo.Shop;
import sun.utils.DataUtils;

@Service
@Transactional
public class ShopDaoImpl {
	@Resource
	private ShopMapper shopMapper;
	public void setShopMapper(ShopMapper shopMapper) {
		this.shopMapper = shopMapper;
	}
	@Transactional(readOnly=true)
	public String findAll() {
		List<Shop> list=shopMapper.findAll();
		return DataUtils.listToJson(list);
	}

	public String addShop(Shop s) {
		shopMapper.addShop(s);
		return "{\"result\":"+true+"}";
	}
	

	public String updateShop(Shop s) {
		shopMapper.updateShop(s);
		return "{\"result\":"+true+"}";
	}

	public String findById(String id) {
		Shop shop=shopMapper.findById(id);
		return DataUtils.pojoToJson(shop);
	}
	

	public String deleteShop(String id) {
		shopMapper.deleteShop(id);
		return "{\"result\":"+true+"}";
	}
	
}
