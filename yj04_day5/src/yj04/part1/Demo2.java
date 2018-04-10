package yj04.part1;


public class Demo2 {
	public static void main(String[] args) {
		//案例
		//创建一个动物类(animal)
		//属性:种类，叫声，栖息地，名字，性别
		//行为:吼叫，捕食，睡觉，冬眠
		//创建测试类(带主方法的类)，实例化三个以上动物，并调用属性和行为
		
		//实例化狗
		Animal a1=new Animal();
		a1.type="狗";
		a1.name="金毛";
		a1.gender="公";
		a1.cry="汪";
		a1.place="地球";
		a1.bushi("骨头");
		a1.sleep();
		a1.crying();
		a1.hibernation("不需要");
		System.out.println("------------");
		//实例化猫
		Animal a2=new Animal();
		a1.type="猫";
		a1.name="波斯喵";
		a1.gender="公";
		a1.cry="喵";
		a1.place="地球";
		a1.bushi("鱼头");
		a1.sleep();
		a1.crying();
		a1.hibernation("不需要");
		System.out.println("------------");
		//实例化蛇
		Animal a3=new Animal();
		a1.type="蛇";
		a1.name="金蝰蛇";
		a1.gender="母";
		a1.cry="咝";
		a1.place="中国东北";
		a1.bushi("老鼠，兔子等");
		a1.sleep();
		a1.crying();
		a1.hibernation("需要");
		
		System.out.println("------------");
		Student s1=new Student();
		s1.name="孙悟空";
		s1.age=18;
		s1.say();
		//调用是无需写上参数类型，一定要写上该类型所对应的变量值(实参).
		s1.changeAge(100);//100为实参
		System.out.println(s1.eating("油条"));
		System.out.println(s1.coke("恐龙蛋","隔夜饭"));
	}
}
