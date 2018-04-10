package yj04.part1;

//创建一个食物类，添加不同类型的变量作为属性赋值
public class Food {
	//字符串型的-食物名称-萝卜白菜
	//整数类型-食物价格-5
	//字符类型-评价-是或否
	//布尔类型-中餐-true
	//双精度类型-折扣-0.98
	
	public static void main(String[] args) {
		 String name="萝卜白菜";
		 int price=5;
		 char evaluation='好';
		 boolean chineseFood=true;
		 double discount=0.98;
		System.out.println("菜名:"+name+",价格:"+price+"￥,评价:"+evaluation+","+(chineseFood?"中式菜":"西式菜")+","+"，折扣"+discount);
	}

}
