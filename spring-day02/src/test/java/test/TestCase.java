package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import ioc.A;
import scope.ExampleBean;
import scope.MessageBean;
import scope.ScopeBean;

public class TestCase {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("scope.xml");
		ScopeBean sb1=ac.getBean("s1",ScopeBean.class);
		ScopeBean sb2=ac.getBean("s1",ScopeBean.class);
		System.out.println(sb1==sb2);
	}
	@Test
	//测试生命周期
	public void test02(){
		//启动spring容器
		//ApplicationContext:接口
		//ClassPathXmlApplicationContext:实现了上述接口的具体类
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("scope.xml");
		//获取对象
		MessageBean mb=ac.getBean("mb1",MessageBean.class);
		mb.sendMsg();
		//关闭容器
		ac.close();
	}
	
	@Test
	public void test03(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("scope.xml");
	}
	@Test
	public void test04(){
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("example.xml");
		ExampleBean eb=ac.getBean("ex1",ExampleBean.class);
		ac.close();
	}
	@Test
	//测试set方式注入
	public void test05(){
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		A a=ac.getBean("a1",A.class);
		a.excute();
	}

}
