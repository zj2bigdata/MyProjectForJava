package fanshe_1212;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		//实例化私有类Student
		Class c=Class.forName("fanshe_1212.Student");
		Constructor sc=c.getDeclaredConstructor();
		sc.setAccessible(true);////值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查。
		Object student=sc.newInstance();//使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
//		System.out.println(student);
//		//访问共有属性name
//		Field fi=c.getDeclaredField("name");
//		fi.set(student, "yo");
//		System.out.println(fi.get(student));
//		//访问私有属性age
//		Field fi2=c.getDeclaredField("age");
//		fi2.setAccessible(true);
//		fi2.set(student, 18);
//		System.out.println(fi2.get(student));
		
//		Method[] mi=c.getMethods();//获取公共方法，包含父类的公共方法
//		for(Method con:mi){
//			System.out.println(con.getName());
//		}
//		Method[] mi=c.getDeclaredMethods();//返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
//		for(Method con:mi){
//			System.out.println(con.getName());
//		}
		Method mi=c.getDeclaredMethod("say", String.class);
		mi.setAccessible(true);
		Object hello=mi.invoke(student, "hellow world!");//对带有指定参数的指定对象调用由此 Method 对象表示的基础方法。
		System.out.println(hello);
		
//		Class c1=s.getClass();
//		Class<Student> c2=Student.class;
//		System.out.println("--------------获取类名-------------------");
//		Class clazz=Class.forName("java.lang.String");
//		String name=clazz.getName();
//		System.out.println(name);
//		System.out.println("-------------------获取包名-------------------------");
//		Package pk=clazz.getPackage();//获取包对象
//		String pname=pk.getName();
//		System.out.println(pname);
//		System.out.println("----------------------获取父类名---------------------------------");
//		Class superClazz=clazz.getSuperclass();
//		String superName=superClazz.getName();
//		System.out.println(superName);
		
	}
}
