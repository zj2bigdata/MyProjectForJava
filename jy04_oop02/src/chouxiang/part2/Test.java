package chouxiang.part2;

//多态(三要素)：1.类的继承 2.方法重写 3.父类引用指向子类对象
public class Test {
	public static void main(String[] args) {
		//Person1 p1=new Person1();//抽象类无法实例化
		Person1 p2=new Student1();//父类引用指向子类对象
		p2.love();
	}
}
