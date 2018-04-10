package yj04.part2;

import yj04.part1.Father;

public class Demo4 extends Father {
	public static void main(String[] args) {
		Father fa=new Father();
		fa.name="小头爸爸";
		//fa.house="我的海景房";protectd也只能被同一包的类访问
		//fa.passport="马尔代夫";默认修饰的只能被同一包的类访问
		//fa.money=50;不能访问私有的
		
		Demo4 de=new Demo4();
		de.house="继承过来的海景房";//该属性作为Father的子类，是可以访问父类中被protected修饰的属性
		
		/*
		 * 总结访问修饰符       
		 * 修饰符				  public      protected      default     private
		 * 同一个类			  true			true          true         true
		 * 同一个包中的类		  true          true          true         false
		 * 不同包的子类   		  true          true          false        false
		 * 不同包且不是子类		  true          false         false        false
		 * 访问修饰符范围大小：public > protected > default > private
		 * */
	}
}
