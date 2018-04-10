package sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import sun.pojo.Users;

@Controller
public class HelloController {
		@RequestMapping("/toLogin.mvc")
		public String toLogin(){
			System.out.println("toLogin()");
			return "login";
		}
		@RequestMapping("/login.mvc")
		public String login(Users u,ModelMap mm){
			System.out.println("login()");
			mm.addAttribute("user",u);
			System.out.println(u.getUserName()+"--"+u.getPassword());
			return "redirect:toIndex.mvc";
		}
		@RequestMapping("/toIndex.mvc")
		public String toIndex(){
			return "hello";
		}
}
