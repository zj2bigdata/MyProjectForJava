package yj04.part1;

/*
 * 方法的创建，方法的调用，行参和实参
 * 
 * 构造方法
 * 
 * 方法重载
 * 
 * 访问修饰符
 * 
 * 
 * */
public class Demo1 {
	public static void main(String[] args) {
		Hero liu=new Hero();
		//.操作符访问属性
		liu.name="刘备";
		liu.life=500;
		liu.skill="仁德";
		//通过.方法名操作方法
		liu.say();
		
		Hero guan=new Hero();
		//.操作符访问属性
		guan.name="关羽";
		guan.life=600;
		guan.skill="武圣";
		//通过.方法名操作方法
		guan.say();
		
		Hero zhang=new Hero();
		//.操作符访问属性
		zhang.name="张飞";
		zhang.life=800;
		zhang.skill="咆哮";
		//通过.方法名操作方法
		zhang.say();
		
		System.out.println("----kill----");
		//调用方法时传递的参数类型必须与形参的类型相同
		liu.kill("曹操");
		guan.kill("吕蒙");
		zhang.kill("孙权");
		
		System.out.println("----getMoney----");
		//调用方法时传递的参数类型必须与形参的类型相同
		double money1=liu.getMoney("曹操",10);
		double money2=guan.getMoney("吕蒙",6);
		double money3=zhang.getMoney("孙权",8);
		System.out.println("刘备获得"+money1);
		System.out.println("关羽获得"+money2);
		System.out.println("张飞获得"+money3);
	}
}
