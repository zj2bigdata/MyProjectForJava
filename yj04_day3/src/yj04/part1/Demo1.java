package yj04.part1;

import java.util.Scanner;

//顺序结构,自上而下的执行代码
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("请输入您的名字:");
		Scanner sr1=new Scanner(System.in);
		String name=sr1.next();
		
		System.out.println("请输入您的年龄:");
		Scanner sr2=new Scanner(System.in);
		String age=sr2.next();
		
		System.out.println("请输入您的性别:");
		Scanner sr3=new Scanner(System.in);
		String sex=sr3.next();
		
		System.out.println("我叫"+name+",我的年龄是:"+age+",我的性别是:"+sex);
		sr1.close();
		sr2.close();
		sr3.close();
	}
}
