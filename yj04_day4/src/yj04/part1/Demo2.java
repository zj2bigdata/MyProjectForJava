package yj04.part1;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * do-while循环
		 * 小明上街买十个烧饼，每个烧饼2元，回家的路上偷吃了一个.问其余烧饼总共值多少钱
		 * */
		int num=10;//循环其实变量
		int sum=0;
		do {//循环的迭代
			if(num<10){
				sum+=2;
			}
			num--;
		} while (num>0);//循环条件
//		System.out.println(sum);
		
		//使用do-while实现循环
		boolean flag=false;
		String name="";
		String pass="";
		do {
			System.out.println("威漫世界欢迎您:");
			System.out.println("请输入帐号:");
			name=new Scanner(System.in).next();
			System.out.println("请输入密码:");
			pass=new Scanner(System.in).next();
			if(name.equals("centos666")&&pass.equals("666666")){
				System.out.println("登录成功!");
				flag=false;
			}else{
				System.out.println("帐号或密码错误！请重新输入:");
				flag=true;
			}
		} while (flag);
		
		
	}
}
