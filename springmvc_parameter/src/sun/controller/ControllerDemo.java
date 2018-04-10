package sun.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sun.pojo.Shop;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/service01")
	public String service01(int shopId){
		System.out.println("service01:"+shopId);
		return "service";
	}
	@RequestMapping("/service02")
	public String service02(@RequestParam("shopId") String id){
		System.out.println("service02:"+id);
		return "service";
	}
	@RequestMapping("/service03")
	public String service03(String[] shopId){
		System.out.println("service03:"+shopId.length);
		return "service";
	}
	
	@RequestMapping("/service04")
	public String service04(Shop shop){
		System.out.println("service04:"+shop.toString());
		return "service";
	}
	
	@RequestMapping("/service05")
	public String service05(Shop shop){
		System.out.println("service05:"+shop.toString());
		return "service";
	}
	
	@RequestMapping("/service06")
	public String service06(@RequestParam Map<String,String> map){
		System.out.println("service06:"+map);
		return "/html/service.html";
	}

}
