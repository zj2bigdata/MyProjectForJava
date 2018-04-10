package yj04.part1;

//关系运算符
//<,>,>=,<=,==,!=
public class Demo5 {
	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=20;
		int d=20;
		System.out.println(a>c);//false
		System.out.println(b<a);//false
		System.out.println(a==c);//false
		System.out.println(c==d);//true
		System.out.println(c>=d);//true
		System.out.println(b<=d);//true
		System.out.println(a!=b);//true
		System.out.println(a=c);//单等是赋值运算
	}
}
