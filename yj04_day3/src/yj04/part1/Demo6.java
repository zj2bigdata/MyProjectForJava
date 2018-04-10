package yj04.part1;

import java.util.Scanner;

//多分支结构
public class Demo6 {
	public static void main(String[] args) {
		//春:3,4,5
		//夏:6,7,8
		//秋:9,10,11
		//冬:12,1,2
		/*
		 * 多分支结构在if.else双分支结构上多了一个else if()
		 * 在else if()中也需要执行相应的布尔判断，判断成立则进入{}。
		 * if..elseif..else是一个整体的逻辑判断单元,只能进入其中一个判断块
		 * */
		System.out.println("请输入月份:");
		int month=new Scanner(System.in).nextInt();
		if(month>=3&&month<=5){
			System.out.println("春风吹又生");
		}else if(month>=6&&month<=8){
			System.out.println("但惜夏日长");
		}else if(month>=9&&month<=11){
			System.out.println("白马秋风塞外");
		}else if(month==12||month==1||month==2){
			System.out.println("冬季腊月梅花开");
		}else{
			System.out.println("无该月份!");
		}
	}
}
