package sun.controller;

import java.io.IOException;

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
		if("/find.shop".equals(path)){
			String shops=sdi.findAll();
			req.setAttribute("shops",shops);
			req.getRequestDispatcher("shopShow.jsp").forward(req, resp);
		}else if("/add.shop".equals(path)){
			String shopName=req.getParameter("shopName");
			String shopAddress=req.getParameter("shopAddress");
			String contact=req.getParameter("contact");
			Shop s=new Shop();
			s.setShopName(shopName);
			s.setShopAddress(shopAddress);
			s.setContact(contact);
			sdi.addShop(s);
			resp.sendRedirect("find.shop");
		}else if("/toUpdate.shop".equals(path)){
			String shopId=req.getParameter("shopId");
			String shop=sdi.findById(shopId);
			req.setAttribute("shop",shop);
			req.getRequestDispatcher("shopUpdate.jsp").forward(req, resp);
		}else if("/update.shop".equals(path)){
			Shop s=new Shop();
			s.setShopId(req.getParameter("shopId"));
			s.setShopName(req.getParameter("shopName"));
			s.setShopAddress(req.getParameter("shopAddress"));
			s.setContact(req.getParameter("contact"));
			System.out.println(s.getShopName()+s.getShopId());
			sdi.updateShop(s);
			resp.sendRedirect("find.shop");
		}else if("/delete.shop".equals(path)){
			String shopId=req.getParameter("shopId");
			sdi.deleteShop(shopId);
			resp.sendRedirect("find.shop");
		}
	}
	
	
}
