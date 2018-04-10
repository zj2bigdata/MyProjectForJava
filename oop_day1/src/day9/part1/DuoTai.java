package day9.part1;

//多态:方法的重写和重载；继承或实现；父类引用指向子类对象
//教练和运动员案例

//1.定义人类
abstract class Person1{
	 private String name;
	 private int age;
	 public Person1(){}
	 public Person1(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 public abstract void eat();
	 public abstract void sleep();
}
//定义接口可以实现运动员各自的运动特长
interface character{
	public abstract  void sport();
}
//教练类
class Coaches extends Person1{
	public Coaches(){}
	public Coaches(String name,int age){
		super(name,age);
	}
	 public void eat(){};
	 public void sleep(){};
	 public void sport(){System.out.println("教导运动员！");};
}
//运动员类
class Sporter extends Person1 implements character{
	String sport;
	public Sporter(){}
	public Sporter(String name,int age,String sport){
		super(name,age);
		this.sport=sport;
	}
	 public void eat(){};
	 public void sleep(){};
	 public  void sport(){System.out.println("我擅长:"+sport);};
}
public class DuoTai {
	public static void main(String[] args) {
		//定义张教练
		Person1 z=new Coaches("张鉴",18);
		z.eat();
		z.sleep();
		Coaches z1=(Coaches)z;
		z1.sport();
		//定义孙学员
		Sporter s=new Sporter("孙杨",18,"游泳");
		s.eat();
		s.sleep();
		s.sport();
	}
}
