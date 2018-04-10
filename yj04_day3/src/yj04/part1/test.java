package yj04.part1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		/*
		 * 编写代码实现如下内容：if语句实现
			考试成绩分等级。
			90~100	A等。
			80-89	B等。
			70-79	C等。
			60-69	D等。
			60以下	E等。
			请根据给定成绩，输出对应的等级。
		 * */
		
		System.out.println("请输入您的考试成绩:");
		int score=new Scanner(System.in).nextInt();
		if(score<60){
			System.out.println("您的成绩对应等级为:E等");
		}
		if(score>=60&&score<=69){
			System.out.println("您的成绩对应等级为:D等");
		}
		if(score>=70&&score<=79){
			System.out.println("您的成绩对应等级为:C等");
		}
		if(score>=80&&score<=89){
			System.out.println("您的成绩对应等级为:B等");
		}
		if(score>=90&&score<=100){
			System.out.println("您的成绩对应等级为:A等");
		}
	}
}
