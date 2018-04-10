package yj04.part1;

import java.util.Scanner;

//if的双分支结构
public class Demo4 {
	public static void main(String[] args) {
		/*
		 * 双分支语句结构多了一个else
		 * 当if条件不成立时则一定会进入else语句块
		 * 每一个if.else双分支语句结构，都是一个单独的判断
		 * */
		System.out.println("请输入你喜爱的食物:");
		Scanner sc=new Scanner(System.in);
		String food=sc.next();
		if(food.equals("满汉全席")){
			System.out.println("惊艳全场!");
		}else{
			System.out.println("日子没法过了！");
		}
		
		if(food.equals("扬州炒饭")){
			System.out.println("穷！");
		}else{
			System.out.println("揭不开锅了！");
		}
		
//		if(food.equals("代码段"));{
//			System.out.println(112);
//		}
		//条件判断后不能打分号，否则代表结束
	}
}
