package yj04_1207;

public class Demo {
	public static void main(String[] args) {
		String s1="1";
		String s2="4";
		System.out.println(s1+s2);
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		//printf(5);//自动装箱，自动拆箱是指基本数据类型与其对用的包装类间的自动转换
		float f=5;
		printf(f);
	}
	public static void printf(Float f){
		System.out.println(f);
	}
}
