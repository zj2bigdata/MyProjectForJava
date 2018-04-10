package yj04.part1;

//有(无)参数的方法
//有(无)返回值方法
/*
 * 参数
 * 返回值
 * 
 * */
public class Student {
	String name;
	int age;
	String hoby;
	
	//编写无参数,无返回值方法
	//say(参数列表为空)。
	//方法中使用void，表示无返回值。
	public void say(){
		System.out.println(name+":我乃玉皇大帝，如来佛祖，观音菩萨特派取西经使者!");
	}
	//该方法有参数，无返回值.有参数方法()中定义是，括号中的参数需要写上带类型的变量，称为形参.
	public void changeAge(int age){
		this.age=age;
		System.out.println("我今年才"+age+"岁");
	}
	
	//该方法将void改为该方法String,该方法结束用了return,如果需要返回什么类型的值，则一定要return该类型的值
	public String eating(String food){
		return "我喜欢吃"+food;
	}
	
	//编写有返回值的方法
	public String coke(String agg,String rice){
		return "老板给我抄了一碗蛋炒饭，用了三个"+agg+"和一碗"+rice;
	}
	
}
