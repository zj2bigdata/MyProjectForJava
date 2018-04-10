package yj04.part1;

import yj04.part2.Student;

public class Test {
//object类是所有类的父类（所有类会默认继承）
//this和super无法在static(静态)方法和语句块中使用
	public static void main(String[] args) {
		//Person p=new Person(); //调用默认无参构造
		//p.setAge(166); //调用Person公有的设置年龄方法(setter)
		//System.out.println(p.getAge()); //调用Person公有的获取年龄方法返回int类型的值(getter)
		
		Student s=new Student();
//		s.setAge(18);
		//System.out.println(s.age);不能访问父类私有属性
		//System.out.println(s.name);不能访问默认修饰符属性(不同包)
//		System.out.println(s.getAge());
//		System.out.println(s.weight);
//		System.out.println(s.height);
		s.print();
	}
}
