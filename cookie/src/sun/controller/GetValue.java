package sun.controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetValue extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ckis=req.getCookies();
		if(ckis!=null){
			for(Cookie c:ckis){
				String gv=URLDecoder.decode(c.getValue(),"utf-8");
				System.out.println(c.getName()+"--"+gv);
			}
		}
	}

}
