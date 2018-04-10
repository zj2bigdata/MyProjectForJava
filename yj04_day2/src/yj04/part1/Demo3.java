package yj04.part1;

//数据类型转换问题
public class Demo3 {
	public static void main(String[] args) {
		//数据类型转换限制于能相互转换的类型，如（数字类型）;
		//double >float>long>int>short>byte
		//小类型转大类型为自动转换,反之则为强制转换
		
		double wages =98.5;
		//double ---> int 强制转换会丢失精度，需要在转换的变量前添加(转换后类型).比如:
		int wagesTo=(int)wages;
		System.out.println("原始为(double)"+wages+" "+"转换后(int):"+wagesTo);
		
		byte age =36;
		//type --->long 自动转换,不会丢失精度
		long ageTo=age;
		
		//字符类型和整数类型转换
		//java中每个中文或英文字符都对应了一个编码，既unicode编码。
		char name1='单'; //对应数字为21333
		char name2='宅'; //对应数字为23429
		int no1=name1;//‘单’ ----> int
		int no2=name2;
		System.out.println(no2);
		
		//在java中每一个字母都对应一个数字，叫Ascll码。
		char ch1='a';
		char ch2='b';
		int num1=ch1;
		int num2=ch2;
		System.out.println(num1);
		System.out.println(num2);
	}
}
