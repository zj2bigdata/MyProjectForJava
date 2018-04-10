package yj04.part1;

//逻辑运算符
//java中使用"&&"表示逻辑与
//使用"||"表示逻辑或
//使用"！"表示逻辑非
//使用"^"表示或
//其中&表示与，|表示或.
public class Demo6 {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=5;
		//位运算符或关系
		System.out.println((a<b)|(a>c));
		System.out.println((b==c)|(c>a));
		System.out.println((c<b)|(c>a));
		
		//逻辑或关系(该运算符有短路效应：如果前面表达式成立，则不执行后面的程序).实际开发推荐使用(效率高)
		System.out.println((a<b)||(a>c));
		System.out.println((b==c)||(c>a));
		System.out.println((c<b)||(c>a));
		
		//位运算符与关系
		System.out.println((a<b)&(a>c));
		System.out.println((b==c)&(c>a));
		System.out.println((c<b)&(c>a));
		
		//位运算符逻辑与关系(该运算符有短路效应：如果前面表达式成立，则不执行后面的程序).实际开发推荐使用(效率高)
		System.out.println((a<b)&&(a>c));
		System.out.println((b==c)&&(c>a));
		System.out.println((c<b)&&(c>a));
		
		//位运算符逻辑异或关系(同则为false,异则为true)
		System.out.println((a<b)^(a>c)); //true
		System.out.println((c==c)^(c>a)); //false
		System.out.println((c<b)^(c<a)); //false
				
		//取非关系
		System.out.println(!(a<b)&&(a>c));
		System.out.println(!(b==c)||(c>a));
		System.out.println(!(c<b)^(c>a));
	}
}
