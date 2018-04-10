package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc2.Restaurant;
import some.SomeBean;
import value.SpelBean;
import value.ValueBean;

public class TestCase3 {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc2.xml");
		Restaurant rest=ac.getBean("rest",Restaurant.class);
		System.out.println(rest);
	}
	@Test
	public void test02(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb1=ac.getBean("vb1",ValueBean.class);
		System.out.println(vb1);
	}
	@Test
	public void test03(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb2=ac.getBean("vb2",ValueBean.class);
		System.out.println(vb2);
	}
	@Test
	//²âÊÔ¶ÁÈ¡propertiesÎÄ¼þ
	public void test04(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		System.out.println(ac.getBean("config"));
	}
	@Test
	public void test05(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("some.xml");
		SomeBean sb1=ac.getBean("sb1",SomeBean.class);
		System.out.println(sb1);
	}
	@Test
	public void test06(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		SpelBean sp1=ac.getBean("sp1",SpelBean.class);
		System.out.println(sp1);
	}
}
