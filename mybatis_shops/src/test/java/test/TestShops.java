package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.pojo.Shop;
import com.pojo.ShopAndProduct;
import com.service.ShopService;

public class TestShops {
	public static ShopService ss=new ShopService();
	@Test
	public void findAll(){
		List<Shop> s=ss.queryIfByBase("一");
		System.out.println(s);
	}
	
	@Test
	public void queryIfByPojo(){
		Shop shop=new Shop("2","一","江汉","139");//
		List<Shop> si=ss.queryIfByPojo(shop);
		System.out.println(si);
	}
	
	@Test
	public void findActiveShopLike(){
		Shop shop=new Shop("2","一","江汉","139");
		List<Shop> si=ss.findActiveShopLike(shop);
		System.out.println(si);
	}
	
	@Test
	public void findWhere(){
		Shop shop=new Shop("2","一","江汉","139");
		List<Shop> si=ss.findWhere(shop);
		System.out.println(si);
	}
	
	@Test
	public void FindByList(){
		List<String> ids=new ArrayList<String>();
		ids.add("1");
		ids.add("2");
		ids.add("3");
		List<Shop> si=ss.findByList(ids);
		System.out.println(si);
	}
	@Test
	public void FindByArray(){
		int[] ids=new int[]{1,2,3};
		List<Shop> si=ss.findByArray(ids);
		System.out.println(si);
	}
	@Test
	public void FindByMap(){
		Map<String,String[]> map=new HashMap<String,String[]>();
		String[] ids=new String[]{"1","2","3"};
		map.put("ids",ids);
		List<Shop> si=ss.findByMap(map);
		System.out.println(si.size());
	}
	@Test
	public void getNameByPro(){
	
		ss.getNameByPro("3");
	}
	
	@Test
	public void getSap(){
		List<ShopAndProduct> list=ss.getSap();
		System.out.println(list.size());
	}
}
