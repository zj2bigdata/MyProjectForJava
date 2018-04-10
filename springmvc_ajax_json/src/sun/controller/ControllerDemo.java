package sun.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.pojo.Shop;

@Controller
public class ControllerDemo {
	//响应字符串
	@RequestMapping("/responseString")
	@ResponseBody
	public String service01(@RequestParam Map<String,String> map){
		System.out.println("map:"+map);
		return "{\"result\":true}";
	}
	//响应实体
	@RequestMapping("/responseString2")
	@ResponseBody
	public Shop service02(){
		Shop shop=new Shop();
		shop.setShopId("1");
		shop.setShopName("wode");
		shop.setShopAddress("nide");
		shop.setContact("12313123");
		return shop;
	}
	//响应map集合
	@RequestMapping("/responseString3")
	@ResponseBody
	public List<Map<String,String>> service03(){
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		Map<String,String> map1=new HashMap<String, String>();
		map1.put("id","1");
		map1.put("name","zj");
		Map<String,String> map2=new HashMap<String, String>();
		map2.put("id","2");
		map2.put("name","ww");
		list.add(map1);
		list.add(map2);
		return list;
	}
	
	//请求map集合
		@RequestMapping("/responseString4")
		public String service04(@RequestBody Map<String,String> map){
			System.out.println(map);
			return "";
		}
	

}
