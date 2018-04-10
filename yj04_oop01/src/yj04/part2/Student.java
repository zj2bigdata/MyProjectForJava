package yj04.part2;

import yj04.part1.Person;
//通过继承子类可以继承父类中所有属性
//但是无法访问父类中私有属性和方法
//不同包中的默认修饰的属性和方法也无法访问
//构造函数中如需要调用父类或当前类的构造函数时，必须将其放在首行
public class Student extends Person {
	public Student(){
		super("ssss");//显示调用父类构造函数(带形式参数的)
	}
	
	public Student(int age){
		this();
	}
	
	public Student(String name){
		this(18);
	}
	
//	public int weight =66;
	
	public void print(){
		System.out.println(super.weight);//super表示父类
		System.out.println(this.weight);//如果当前类没有weight属性，则会从父类查找该属性
	}
}
