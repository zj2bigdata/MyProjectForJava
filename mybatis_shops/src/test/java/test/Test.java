package test;

import java.util.List;

import com.pojo.Shop;
import com.service.ShopService;

public class Test {
	public static void main(String[] args) {
			ShopService ss=new ShopService();
			Shop shop=new Shop("2","Ò»","½­ºº","139");//
			List<Shop> si=ss.queryIfByPojo(shop);
			System.out.println(si);
		
	}
}
