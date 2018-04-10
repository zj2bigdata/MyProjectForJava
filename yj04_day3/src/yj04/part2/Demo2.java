package yj04.part2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//在表达式可以得出多个值的情况下
				//使用switch-case语句效果更好
				System.out.println("请输入省份简称:");
				char pName=new Scanner(System.in).next().toCharArray()[0];
				switch (pName) {
				case '鄂':
					System.out.println("湖北");
					break;
				case '湘':
					System.out.println("湖南");
					break;
				case '苏':
					System.out.println("江苏");
					break;
				case '粤':
					System.out.println("广东");
					break;
				case '京':
					System.out.println("北京");
					break;
				default://表示其他的意思
					System.out.println("不认识");
					break;
				}
	}
}
