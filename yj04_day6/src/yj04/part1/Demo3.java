package yj04.part1;

//方法重载
public class Demo3 {
	public static void main(String[] args) {
		//常用syso输出语句中就能体现出重载
//		System.out.println("hello");
//		System.out.println(123);
//		System.out.println(false);
		Demo3 de=new Demo3();
		de.palyGame();
		de.palyGame("dad",19.00);
		palyGame("英雄联盟");
	
	}
	public void palyGame(){
		System.out.println("我喜欢王者荣耀");
	}
	//重载体现在一个类中，重载的方法,方法名相同，参数的个数和类型不同，就构成了重载
	public static void palyGame(String name){
		System.out.println("我也喜欢英雄联盟");
	}
	//重载成功，因为满足参数个数不同原则
	public void palyGame(String name,double price){
		System.out.println("我也喜欢");
	}
	//满足了参数类型不一样
	public void palyGame(double price,String area){
		System.out.println("我也喜欢");
	}
	//只在于参数个数和类型，与返回值类型无关
//	public String playGame(double price,String area){
//		return "area";
//	}
}
