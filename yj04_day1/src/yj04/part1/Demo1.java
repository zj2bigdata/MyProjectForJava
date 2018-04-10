//packge 程序关键字
//yj04.part1;c程序的名字
//class Java程序的关键字
//Demo1 这个类程序的名字
package yj04.part1;
import java.util.Scanner;

//编写程序的主方法(起始方法)
public class Demo1 {
	public static void main(String args[]){
		//编写输出语句
		System.out.printf("HelloWorld!");
		//输入文字，Scanner输入程序
		Scanner sr=new Scanner(System.in);
		//表示把通过键盘输入的文字信息赋值给一个字符串变量name
		String name=sr.next();
		System.out.printf("您的名字是"+name);
		
	}
}
