package yj04.part1;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//举例
		/*
		 * 如果(我有钱){
		 * 	我就能买辆跑车
		 * }
		 * 
		 * 如果(我是大牛){
		 * 	我就能写个病毒
		 * }
		 * 
		 * 如果(我会飞){
		 * 	我就能上天
		 * }
		 * if(布尔类型的表达式){
				当小括号中条件true，则执行
			}
		 
		 * 在条件判断结构中,if有三种判断形式
		 * 1.单分支结构
		 * 只有if语句块，满足if后的条件表达式，则执行大括号里的内同;
		 * 单分支中，每个if语句都是一个单独的业务判断;
		 * 在if语句中,执行语句只有一行则可以不用{}包裹，不推荐;
		 * 在（JDK1.8以前会报错）jdk1.8后不再限制为一行,但是也不推荐(降低代码可读性).
		 * 2.双分支结构
		 * 3.多分支结构
		 * */
		
		System.out.println("你能上天吗?");
		Scanner sc=new Scanner(System.in);
		String hd=sc.next();
		if(hd.equals("能")){
			System.out.println("你牛！");
		}
		if(hd.equals("不能")){
			System.out.println("真菜！");
		}
		System.out.println("OK");
		//=用来赋值，==才用于判断。
		
		
	}
}
