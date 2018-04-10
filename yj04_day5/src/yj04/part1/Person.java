package yj04.part1;


//人类(抽象),自定义类
public class Person {
	//人的共有特征抽取出来放到一个类中作为属性
	//马云，成龙，威尔斯密斯，安倍经三，把他们共有属性和行为抽取出来放到一个类中，这个过程叫做抽象过程
	public String name;//姓名
	public int age;//年龄
	public char gender;//性别
	public String job;//工作
	public String conuntry;//国籍
	public String address;//地址
	public String hoby;//爱好
	
	//抽取人的共有行为放到一个类中作为方法
	//演讲
	public void skill(String skill){
		System.out.println(name+"会"+skill+"!");//系统类
	}
	//工作
	public void work(){
		System.out.println(name+"需要工作!");
	}
	//吃饭
	public void eat(){
		System.out.println(name+"需要吃饭!");
	}
	//睡觉
	public void sleep(){
		System.out.println(name+"需要睡觉!");
	}
	public int income(int money){
		return money/12;
	}
}