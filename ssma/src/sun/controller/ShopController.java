package sun.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.pojo.Shop;
import sun.service.ShopDaoService;

@Controller
public class ShopController {

	@Resource
	private ShopDaoService shopDaoService;
	
	@RequestMapping("/queryShops")
	@ResponseBody
	public List<Shop> findAll(){
		return shopDaoService.findAll();
	}
	
	@RequestMapping("/insertShop")
	@ResponseBody
	public String addShop( Shop shop) {
		return "{\"result\":"+shopDaoService.addShop(shop)+"}";
	}
	
	@RequestMapping("/deleteShop/{shopId}")
	@ResponseBody
	public String deleteShop(@PathVariable String shopId) {
		return "{\"result\":"+shopDaoService.deleteShop(shopId)+"}";
	}
	
	@RequestMapping("/findById/{shopId}")
	@ResponseBody
	public Shop findById(@PathVariable String shopId) {
		return shopDaoService.findById(shopId);
	}
	
	@RequestMapping("/updateShop")
	@ResponseBody
	public String updateShop(Shop shop) {
		return "{\"result\":"+shopDaoService.updateShop(shop)+"}";
	}
}
