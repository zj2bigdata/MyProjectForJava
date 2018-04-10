package sun.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String user=req.getParameter("user");
		String pwd=req.getParameter("pwd");
		Integer auto=Integer.parseInt(req.getParameter("auto"));
		
		String nUser=URLEncoder.encode(user,"utf-8");
		Cookie cki=new Cookie("user",nUser);
		if(auto!=null){
			cki.setMaxAge(auto);
		}
		resp.addCookie(cki);
		resp.sendRedirect("co");
	}

		
}
