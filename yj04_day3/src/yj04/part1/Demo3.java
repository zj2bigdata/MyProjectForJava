package yj04.part1;

import java.util.Scanner;

//单分支结构
public class Demo3 {
	public static void main(String[] args) {
		//在java中，判断两个值是否相等，是一个宏观的判断，
		//1.表示判断这两个值的内存是否同一个地址
		//2.判断这两个值的字符编码值是否相同
		//拉丁字符使用ASCII,中文使用unicode编码,
		//所有java中==判断的是两个内存的引用地址,而要判断两个字符串是否相等，需要equals方法。
		//
		System.out.println("请输入你的偶像:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		if(name.equals("胡歌")){
			System.out.println("他是演员");
		}
		if(name.equals("刘德华")){
			System.out.println("他也是演员");
		}
		if(name.equals("洪金宝")){
			System.out.println("他是武打演员");
		}
		if(name.equals("郭富城")){
			System.out.println("不认识");
		}
	}
}
