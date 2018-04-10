package yj04.part2;

import java.util.Scanner;

//switch +case语句
public class Demo1 {
	public static void main(String[] args) {
		//在表达式可以得出多个值的情况下
		//使用switch-case语句效果更好
		System.out.println("请输入今天星期几:");
		int i=new Scanner(System.in).nextInt();
		switch(i){
		 case 1://case表示匹配 ：值
			 System.out.println("今天星期"+i+"要上课");
			 break;//表示一旦匹配成功，那么使用break跳出这个整体
		 case 2:
			 System.out.println("今天星期"+i+"还是上课");
			 break;
		 case 3:
			 System.out.println("今天星期"+i+"上课去咯");
			 break;
		 case 4:
			 System.out.println("今天星期"+i+"上课吧");
			 break;
		 case 5:
			 System.out.println("今天星期"+i+"有希望");
			 break;
		 case 6:
			 System.out.println("今天星期"+i+"睡懒觉");
			 break;
		 case 7:
			 System.out.println("今天星期"+i+"又要上课了");
			 break;
		 default:
			 System.out.println("今天星期"+i+"要上课");
			 break;
		}
	}
}