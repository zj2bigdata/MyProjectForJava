package yj04_1207;

//静态变量-静态代码块-静态方法-实例变量-实例代码块-构造方法
public class StaticDemo2 {
	public StaticDemo2(){
		System.out.println("构造方法1");
		}
	{
		System.out.println("普通代码块2");
		}
	static{
		System.out.println("静态代码块3");
		}
	
	public static void main(String[] args) {
		new StaticDemo2();//静态代码块3 普通代码块2 构造方法1
		System.out.println("--------------------------------------");
		new StaticDemo2();//普通代码块2 构造方法1 (静态代码块只会被执行一次,JVM虚拟机加载类时执行一次)
		
	}
}
