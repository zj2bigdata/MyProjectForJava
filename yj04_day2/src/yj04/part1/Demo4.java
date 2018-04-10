package yj04.part1;

/*
 * 1.算数运算符
 * 2.关系运算符
 * 3.逻辑运算符
 * 4.三目运算符
 * */
public class Demo4 {
	public static void main(String[] args) {
		/*加法运算
		 * 1.用于两个数字类型的加法运算
		 * 2.用于秒速当前数字是一个正数
		 * 3.一旦数字和某个字符串之间使用+,那么+表示连接符
		 * */
		int a=10;
		int b=15;
		String c="20";
		int d =-50;
		System.out.println(a+b); //25
		System.out.println(+d);  //+(-50)-->-50
		System.out.println(a+b+c);//2520
		
		/*减法运算
		 * 1.表述负数
		 * 2.两个值的减法运算(无法对字符串进行运算)
		 * */
		System.out.println(a-b);
		System.out.println();
		
		/* *,/,%
		 * 1.*表述乘法运算
		 * 2./表述除法运算
		 * 3.%表述取模运算
		 * 4.自增自减运算（++，--）
		 * */
		System.out.println(a*b%a);
		int x=7;
		int y=8;
		int z=9;
		//++/--在前则先运算再执行,在后则反之
		System.out.println(x++);//7
		System.out.println(++x);//9
		System.out.println(z--);//9
		System.out.println(--z);//7
		
		int a1=8,c1=9,b1=10;
		a1=b1++;
		c1=--b1;
		b1=++a1;
		System.out.println(a+" "+b+" "+c);
		
		//二维运算简化写法
		int k=20;
		System.out.println(k-=x);
		System.out.println(k+=k);
		
		//三目运算符
		int o=25;
		int p=20;
		int q;
		//三目运算 表达式?表达式为ture时的取值:表达式为false时的值
		q=o-p>10?20:50;//q=50
		System.out.println(q);
		System.out.println(o-=p+o);
		
	}
}
