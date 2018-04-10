package sun.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import oracle.net.aso.l;
import sun.impl.LineDaoImpl;
import sun.pojo.Line;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static LineDaoImpl ldi;
	
	@Override
	public void init() throws ServletException {
		String springPath=this.getServletContext().getInitParameter("springPath");
		ApplicationContext context=new ClassPathXmlApplicationContext(springPath);
		ldi=context.getBean("lineDaoImpl",LineDaoImpl.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this.getServletConfig().getInitParameter("encoding"));
		String path=req.getServletPath();
		String json="";
		if("/find.line".equals(path)){
			json=ldi.findAll();
		}else if("/add.line".equals(path)){
			String lineName=req.getParameter("lineName");
			String days=req.getParameter("days");
			String price=req.getParameter("price");
			String vehicle=req.getParameter("vehicle");
			String hotel=req.getParameter("hotel");
			String hasMeal=req.getParameter("hasMeal");
			Line l=new Line();
			l.setLineName(lineName);
			l.setDays(days);
			l.setPrice(price);
			l.setVehicle(vehicle);
			l.setHotel(hotel);
			l.setHasMeal(hasMeal);
			json=ldi.addLine(l);
		}else if("/toUpdate.line".equals(path)){
			String lineID=req.getParameter("lineID");
			json=ldi.findById(lineID);	
		}else if("/update.line".equals(path)){
			Line l=new Line();
			l.setLineID(req.getParameter("lineID"));
			l.setLineName(req.getParameter("lineName"));
			l.setDays(req.getParameter("days"));
			l.setPrice(req.getParameter("price"));
			l.setVehicle(req.getParameter("vehicle"));
			l.setHotel(req.getParameter("hotel"));
			l.setHasMeal(req.getParameter("hasMeal"));
			json=ldi.updateLine(l);
		}else if("/delete.line".equals(path)){
			String lineId=req.getParameter("lineID");
			json=ldi.deleteLine(lineId);
		}
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.println(json);
		out.flush();
		out.close();
	}
	
	
}
