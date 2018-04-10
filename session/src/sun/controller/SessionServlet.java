package sun.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String user=req.getParameter("user");
		String pwd=req.getParameter("pwd");
		HttpSession hs=req.getSession();
		Object u=hs.getAttribute("user");
		Object p=hs.getAttribute("pwd");
		if(u!=null&&p!=null){
			if("zj".equals(u)&&"123".equals(p)){
				resp.sendRedirect("index.html");
			}else{
				hs.removeAttribute("user");
				hs.removeAttribute("pwd");
				resp.sendRedirect("login.html");
			}
		}else{
			hs.setAttribute("user",user);
			hs.setAttribute("pwd",pwd);
			resp.sendRedirect("login.html");
		}
		
	}
	
	
	
}
