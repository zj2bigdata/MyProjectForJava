package sun.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.dao.ShopMapper;
import sun.pojo.Shop;

@Service
@Transactional
public class ShopDaoService {
	@Resource
	private ShopMapper shopMapper;
	public void setShopMapper(ShopMapper shopMapper) {
		this.shopMapper = shopMapper;
	}
	@Transactional(readOnly=true)
	public List<Shop> findAll(int start,int end) {
		return shopMapper.findAll(start,end);
	}
	@Transactional(readOnly=true)
	public int findSize(){
		return shopMapper.findSize().size();
	}

	public boolean addShop(Shop s) {
		return shopMapper.addShop(s);
	}
	

	public boolean updateShop(Shop s) {
		return shopMapper.updateShop(s);
	}
	
	@Transactional(readOnly=true)
	public Shop findById(String id) {
		return shopMapper.findById(id);
	}
	

	public boolean deleteShop(String id) {
		return shopMapper.deleteShop(id);
	}
	
}
