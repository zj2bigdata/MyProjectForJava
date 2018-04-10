package sun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.service.StudentService;

public class TestAop {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		StudentService ss=ac.getBean("studentService",StudentService.class);
		ss.launch();
	}
}
