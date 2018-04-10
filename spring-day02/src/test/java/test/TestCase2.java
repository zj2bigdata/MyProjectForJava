package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.SmeBean;

import ioc2.A;

public class TestCase2 {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc2.xml");
		A a1=ac.getBean("a1",A.class);
		a1.excute();
	}
	@Test
	public void test02(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("annotation.xml");
		SmeBean sb1=ac.getBean("sb1",SmeBean.class);
	}
	@Test
	//≤‚ ‘◊˜”√”Ú
	public void test03(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("annotation.xml");
		SmeBean sb1=ac.getBean("sb1",SmeBean.class);
		SmeBean sb2=ac.getBean("sb1",SmeBean.class);
		System.out.println(sb1==sb2);
	}
	
}
