package yj04.part1;

//循环结构
public class Demo1 {
	public static void main(String[] args) {
		//顺序结构
		//选择结构
		//循环结构
		//需要输出一个马超在操场跑圈（50圈）
		System.out.println("马超跑了第1圈");
		System.out.println("马超跑了第2圈");
		System.out.println("马超跑了第3圈");
		System.out.println("马超跑了第4圈");
		System.out.println("马超跑了第5圈");
		//...
		
		//循环结构一共有四种
		//1.while循环:while(条件表达式){
		//          		循环体
		//				}
		/*
		 * 循环三要素
		 * 1.循环的起始变量
		 * 2.循环的条件
		 * 3.循环的迭代
		 * */
		int round = 1;//起始变量
		while(round <= 50){//循环条件
			System.out.println("马超跑了第"+round+"圈");//循环体内容
			round++;//变量迭代
		}
		//倒序循环
		System.out.println("警报！警报！操场30秒后被C4炸毁！");
		int second = 30;//循环起始变量
		while(second > 0){
			System.out.println("倒计时"+second+"秒!!!");
			second--;
		}
	}
}
