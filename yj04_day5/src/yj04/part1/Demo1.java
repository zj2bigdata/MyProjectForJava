package yj04.part1;

//面向对象的基础
public class Demo1 {
	public static void main(String[] args) {
		//将一个类转变成一个真实的人
		//引用一个人(Person)这个类  p1(给这个实例取名) =
		//new 创建一个实际的人(实例化对象) 再次引用Person(表示哪个类的实际类型)
		//由一个类生成一个对象的过程叫作实例化过程
		//Person是抽象的人的类型，是一个实体模型，不可感知.
		//p1是一个对象，是一个对象，是由人类实例化对象后得到的对象，是可以感知的，有自己的独特属性和方法
		Person p1=new Person();
		//实例化后可以使用该对象.操作符来调用这个类中属性和方法
		p1.name="胡歌";
		p1.age=33;
		p1.gender='男';
		p1.job="演员";
		p1.conuntry="中国";
		p1.hoby="学习";
		p1.address="上海";
		
		
		//通过.调用该对象方法
		p1.skill("演戏");
		p1.work();
		p1.eat();
		p1.sleep();
			
		System.out.println("----------------------------------------");
		//实例化People类
		People pe1=new People();
		pe1.age=18;
		pe1.height=1.70f;
		System.out.println("修改前:");
		pe1.printAge();
		pe1.printHeight();
		System.out.println("修改后:");
		pe1.changeHeight(1.8f);
		pe1.changeAge(22);
		pe1.printAge();
		pe1.printHeight();
		
	}
}
