package sun.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/service01")
	public ModelAndView service01(){
		System.out.println("service01");
		ModelAndView mav=new ModelAndView("service05");
		mav.addObject("result","service01");
		return mav;
	}
	@RequestMapping("/service02")
	public void service02(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		System.out.println("service02");
		req.setAttribute("result","service02");
		req.getRequestDispatcher("jsp/service.jsp").forward(req, res);
	}
	
	@RequestMapping("/service03")
	public String service03(Model model) {
		System.out.println("service03");
		model.addAttribute("result","service03");
		return "jsp/service.jsp";
	}
	//重定向
	@RequestMapping("/service04")
	public String service04(HttpSession hs) {
		System.out.println("service04");
		hs.setAttribute("result","service04");
		return "redirect:jsp/service.jsp";
	}
	
	//重定向
		@RequestMapping("/service05")
		public String service05(HttpServletRequest req) {
			System.out.println("service05");
			req.setAttribute("result","service05");
			return "forward:jsp/service.jsp";  
		}
}
