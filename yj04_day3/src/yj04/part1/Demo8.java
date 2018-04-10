package yj04.part1;

import java.util.Scanner;

//if判断的循环嵌套使用
public class Demo8 {
	public static void main(String[] args) {
//		System.out.println("小二：客官，您是打尖儿还是住店？");
//		String hd=new Scanner(System.in).next();
//		if(hd.equals("不差钱")){
//			System.out.println("客官：好酒好菜伺候着");
//			System.out.println("小二：您想吃点啥？");
//			String hd1=new Scanner(System.in).next();
//			if(hd1.equals("满汉全席")){
//				System.out.println("小二：大佬，土豪啊您!得嘞，马上上菜!");
//			}else if(hd1.equals("阳春面")){
//				System.out.println("小二：一碗啊，切！您等会！");
//			}
//		}else if(hd.equals("没带钱")){
//			System.out.println("小二：爱哪玩哪玩儿");
//		}
		
		//颜值打分(if..elseif..else)
		/*
		 * 1-10:影响市容
		 * 11-30:没脸见畜生
		 * 31-50:没脸见人
		 * 51-70：正常人
		 * 71-80：靠脸吃饭
		 * 81-90：小白脸
		 * 91-100：不可能
		 * */
		
		System.out.println("你请输入您的颜值分");
		int fen=new Scanner(System.in).nextInt();
		if(fen>=1&&fen<=10){
			System.out.println("影响市容");
		}else if(fen>=11&&fen<=30){
			System.out.println("没脸见畜生");
		}else if(fen>=31&&fen<=50){
			System.out.println("没脸见人");
		}else if(fen>=51&&fen<=70){
			System.out.println("正常人");
		}else if(fen>=71&&fen<=80){
			System.out.println("靠脸吃饭");
		}else if(fen>=81&&fen<=90){
			System.out.println("小白脸");
		}else{
			System.out.println("不可能");
		}
	}
}
