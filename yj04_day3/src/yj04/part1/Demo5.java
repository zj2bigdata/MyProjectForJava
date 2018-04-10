package yj04.part1;

import java.util.Scanner;

//使用双分支判断输入的年份是否闰年
//1.可以被4整除，不能被100整除,或者可以被400整除，那么则是如年
public class Demo5 {
	public static void main(String[] args) {
		System.out.println("请输入判断年份");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
