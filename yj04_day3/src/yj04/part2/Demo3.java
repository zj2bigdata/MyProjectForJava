package yj04.part2;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		//在表达式可以得出多个值的情况下
				//使用switch-case语句效果更好
				System.out.println("请输入明星:");
				String starName=new Scanner(System.in).next();
				switch (starName) {
				//switch ()中的值是byte,int ,short,shar,String(JDK1.8或以上)
				//switch在等值比对时更有优势，可读性更好，更清晰，但是无法用于范围值的判断
				case "周杰伦":
					System.out.println("");
//					break;
				case "刘德华":
					System.out.println("演员");
					break;
				case "习大大":
					System.out.println("中国共产党中央委员会总书记，中共中央军事委员会主席，中华人民共和国主席，中华人民共和国中央军事委员会主席");
					break;
				case "那英":
					System.out.println("辽宁，演员、歌手");
					break;
				case "成龙":
					System.out.println("中国香港，国家一级演员");
					break;
				default://表示其他的意思
					System.out.println("凡人一个，不认识");
					break;
				}
	}
}
