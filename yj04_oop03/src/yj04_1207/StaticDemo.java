package yj04_1207;
/*
 * 静态变量是指被static修饰
 * 属于某个类，被所有实例共享
 * 通过类名访问
 * 静态代码块只会被执行一次
 * */
public class StaticDemo {
		static int sum;//static 数据类型 变量名
		int sum5=5;
		static{System.out.println("静态代码块");}
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			StaticDemo s=new StaticDemo();
			s.sum++;
			System.out.println(s.sum);
		}
		System.out.println(sum);//静态方法里可以访问类中静态成员变量
		//System.out.println(sum5);//静态方法里无法可以访问类中非静态成员变量
	}
}
