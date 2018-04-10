package sun.utils;

import java.util.List;

import com.pojo.Shop;

public final class DataUtils {

	private DataUtils() {}
	
	public static final String pojoToJson(Shop shop) {
		
		String shopId = shop.getShopId();
		String shopName = shop.getShopName();
		String shopAddress = shop.getShopAddress();
		String contact = shop.getContact();
		
		StringBuilder json = new StringBuilder();
		json.append("{\"shopId\":\"").append(shopId).append("\",");
		json.append("\"shopName\":\"").append(shopName).append("\",");
		json.append("\"shopAddress\":\"").append(shopAddress).append("\",");
		json.append("\"contact\":\"").append(contact).append("\"}");
		
		return json.toString();
	}

	public static final String listToJson(List<Shop> list) {
		
		StringBuilder json = new StringBuilder();
		
		for(Shop shop : list) {
			if(json.length() != 0) {
				json.append(",");
			}
			
			String str = pojoToJson(shop);
			json.append(str);
		}
		
		return "[" + json + "]";
	}
}