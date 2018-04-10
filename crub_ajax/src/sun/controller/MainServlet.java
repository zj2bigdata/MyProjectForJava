package sun.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Shop;

import sun.impl.ShopDaoImpl;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static ShopDaoImpl sdi=new ShopDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=req.getServletPath();
		String json="";
		if("/find.shop".equals(path)){
			json=sdi.findAll();
		}else if("/add.shop".equals(path)){
			String shopName=req.getParameter("shopName");
			String shopAddress=req.getParameter("shopAddress");
			String contact=req.getParameter("contact");
			Shop s=new Shop();
			s.setShopName(shopName);
			s.setShopAddress(shopAddress);
			s.setContact(contact);
			json=sdi.addShop(s);
		}else if("/toUpdate.shop".equals(path)){
			String shopId=req.getParameter("shopId");
			json=sdi.findById(shopId);	
		}else if("/update.shop".equals(path)){
			Shop s=new Shop();
			s.setShopId(req.getParameter("shopId"));
			s.setShopName(req.getParameter("shopName"));
			s.setShopAddress(req.getParameter("shopAddress"));
			s.setContact(req.getParameter("contact"));
			json=sdi.updateShop(s);
		}else if("/delete.shop".equals(path)){
			String shopId=req.getParameter("shopId");
			json=sdi.deleteShop(shopId);
		}
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.println(json);
		out.flush();
		out.close();
	}
	
	
}
