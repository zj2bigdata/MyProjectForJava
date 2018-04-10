package sun.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.entity.Admin;
import sun.entity.Cost;
import sun.impl.AdminDaoImpl;
import sun.impl.CostDaoImpl;

public class MainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String p=req.getServletPath();
		if("/findCost.do".equals(p)){
			findCost(req,res);
		}else if("/toAddCost.do".equals(p)){
			toAddCost(req,res);
		}else if("/addCost.do".equals(p)){
			addCost(req,res);
		}else if("/toUpdateCost.do".equals(p)){
			toUpdateCost(req,res);
		}else if("/updateCost.do".equals(p)){
			updateCost(req,res);
		}else if("/deleteCost.do".equals(p)){
			deleteCost(req,res);
		}else if("/toLogin.do".equals(p)){
			toLogin(req,res);
		}else if("/toIndex.do".equals(p)){
			toIndex(req,res);
		}
		else if("/login.do".equals(p)){
			login(req,res);
		}
		else{
			throw new RuntimeException("���޴�ҳ!");
		}
	}
	//�˻���¼
	protected void toLogin(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
	}
	//�˻���¼��֤
		protected void login(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String adminCode=req.getParameter("adminCode");
			String password=req.getParameter("password");
			AdminDaoImpl adi=new AdminDaoImpl();
			Admin ad=adi.findByCode(adminCode);
			if(ad ==null){
				//�޴��˺�
				req.setAttribute("error","�޴��˺�!");
				req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
			}else if(!ad.getPassword().equals(password)){
				//�������
				req.setAttribute("error","�������!");
				req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
			}else{
				//��֤�ɹ�
				Cookie cki=new Cookie("adminCode",adminCode);
				res.addCookie(cki);
				res.sendRedirect("toIndex.do");
			}
		}
		
	//��ת��ҳ
	protected void toIndex(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/main/index.jsp").forward(req, res);
	}
	//�����ײ�
	protected void toAddCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/cost/add.jsp").forward(req, res);
	}
	//�����ʷ�����
	protected void addCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		Cost c=new Cost();
		String name=req.getParameter("name");
		String baseDuration=req.getParameter("baseDuration");
		String baseCost=req.getParameter("baseCost");
		String unitCost=req.getParameter("unitCost");
		String descr=req.getParameter("descr");
		String costType=req.getParameter("costType");
		c.setName(name);
		if(baseDuration!=null&&!baseDuration.equals("")){
			c.setBaseDuration(Integer.parseInt(baseDuration));
		}
		if(baseCost!=null&&!baseCost.equals("")){
			c.setBaseCost(Double.parseDouble(baseCost));
		}
		if(unitCost!=null&&!unitCost.equals("")){
			c.setUnitCost(Double.parseDouble(unitCost));
		}
		if(descr!=null&&!descr.equals("")){
			c.setDescr(descr);
		}
		c.setCostType(costType);
		CostDaoImpl cdi=new CostDaoImpl();
		cdi.addCost(c);
		//�ض���
		res.sendRedirect("findCost.do");
	}
	//�޸��ײ�
	protected void toUpdateCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		Cost cost=new CostDaoImpl().findById(id);
		cost.setCostId(Integer.parseInt(id));
		req.setAttribute("cost",cost);
		req.getRequestDispatcher("WEB-INF/cost/update.jsp").forward(req, res);
	}
	//�޸��ײ�����
		protected void updateCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			Cost c=new Cost();
			String costId=req.getParameter("costId");
			String name=req.getParameter("name");
			String baseDuration=req.getParameter("baseDuration");
			String baseCost=req.getParameter("baseCost");
			String unitCost=req.getParameter("unitCost");
			String descr=req.getParameter("descr");
			String costType=req.getParameter("costType");
			c.setCostId(Integer.parseInt(costId));
			c.setName(name);
			if(baseDuration!=null&&!baseDuration.equals("")){
				c.setBaseDuration(Integer.parseInt(baseDuration));
			}
			if(baseCost!=null&&!baseCost.equals("")){
				c.setBaseCost(Double.parseDouble(baseCost));
			}
			if(unitCost!=null&&!unitCost.equals("")){
				c.setUnitCost(Double.parseDouble(unitCost));
			}
			if(descr!=null&&!descr.equals("")){
				c.setDescr(descr);
			}
			c.setCostType(costType);
			CostDaoImpl cdi=new CostDaoImpl();
			cdi.updateCost(c);
			//�ض���
			res.sendRedirect("findCost.do");
		}
	//��ѯ�ʷ�
	protected void findCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//��ѯ�����ʷ�
		CostDaoImpl  cdi=new CostDaoImpl();
		List<Cost> list=cdi.findAll();
		//ת����JSP
		req.setAttribute("costs",list);
		req.getRequestDispatcher("WEB-INF/cost/find.jsp").forward(req,res);
	}
	//ɾ���ײ�
	protected void deleteCost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		System.out.println(id);
		CostDaoImpl cdi=new CostDaoImpl();
		cdi.deleteCost(id);
		res.sendRedirect("findCost.do");
	}
	
}
