package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
	public static void main(String[] args) {
		//启动spring容器
		ApplicationContext ac=new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		//System.out.println(ac);
		//获得对象
		Student stu=ac.getBean("stu1",Student.class);
		System.out.println(stu);
		Date date1=ac.getBean("date1",Date.class);
		System.out.println(date1);
		Calendar cal1=ac.getBean("cal1",Calendar.class);
		System.out.println(cal1);
		Date time1=ac.getBean("time1",Date.class);
		System.out.println(time1);
	}
}
