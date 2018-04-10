package yj04.part2;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		//switch作范围判断
		//可以用批注方式来判断，但是繁琐，不简洁,推荐使用if..else
		System.out.println("请输入年龄:");
		int age=new Scanner(System.in).nextInt();
		switch (age) {
		case 1:
		case 2:
		case 3:	
		case 4:	
		case 5:	
		case 6:
			System.out.println("儿童期");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("少年");
			break;
		default:
			break;
		}
	}
}
