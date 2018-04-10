package yj04.part1;

//测试访问修饰符
public class Demo4 {
	public static void main(String[] args) {
		Father fa=new Father();
		fa.name="小头爸爸";
		fa.house="我的海景房";
		fa.passport="马尔代夫";
		//fa.money=50;不能访问私有的
	}
}
