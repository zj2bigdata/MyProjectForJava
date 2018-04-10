package yj04.part1;

public class Father {
	//public 称为公开公有的共有的，最高的访问级别，类的public成员所有类的成员都可以访问;
	public String name;//姓名
	//private 私有的，不对外公开，类的private成员只能被该类的成员访问，访问级别最低
	private double money;//私房钱
	//protected 受保护的，类的protected成员只能被该类的成员以及其子类成员访问。
	//还可以被同一个包中其他类的成员访问
	protected String house;//房子
	//默认，类的成员什么修饰符都没有，又叫包修饰符，只有类本身成员和当前包下类的成员可以访问。
	String passport;//护照
	public static void main(String[] args) {
		Father fa=new Father();
		fa.money=50;//私有属性只能被当前类所访问
	}
}
