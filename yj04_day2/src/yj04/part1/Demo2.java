package yj04.part1;

//变量
//常量，如果标识符被关键值final修饰，则变为常量，不可改变
public class Demo2 {
	public static void main(String[] args) {
		//String 关键字,字符串类型,变量类型
		//cantee是标识符，变量名
		//"宝石花" 变量的值
		String cantee="宝石花";//声明并赋值
		
		//int 关键字，整型,变量类型
		//age 标识符,变量名字
		int age;//变量的声明
		age=18;//变量的赋值
		
		//char 关键字,字符类型,变量类型
		//
		char firstName;
		firstName='单';
		final String hobby="听歌";
		//变量的使用要注意一定要初始化(赋值)
		System.out.println(firstName+"某今年"+age+"了,正在"+cantee+hobby+"!");
		//变量的声明规则:可以用英文字符，数字，美元符号，下划线，人名币符号，但是:
		//1.不能使用数字开头，
		//2.不能使用空格，
		//3.不建议使用中文
		//4.不能使用java中的关键字
		//5.尽量语义化
		String abc="hellow";
		String 你好="hello";
		String $ddd_222="hello";
	}
}
