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
	//������������
	public void test02(){
		//����spring����
		//ApplicationContext:�ӿ�
		//ClassPathXmlApplicationContext:ʵ���������ӿڵľ�����
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("scope.xml");
		//��ȡ����
		MessageBean mb=ac.getBean("mb1",MessageBean.class);
		mb.sendMsg();
		//�ر�����
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
	//����set��ʽע��
	public void test05(){
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		A a=ac.getBean("a1",A.class);
		a.excute();
	}

}
