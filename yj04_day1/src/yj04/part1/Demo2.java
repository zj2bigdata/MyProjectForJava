package yj04.part1;

public class Demo2 {
//  快速编写main方法，先写main再按住ALT+“/”，回车。
//	java中alt+/代码快捷补全方式
 public static void main(String[] args) {
	 //创建一个早餐的对象。并给其具体属性赋值.
	 Breakfirst bf=new Breakfirst();
	 bf.name="馒头+稀饭";
	 bf.type="中式";
	 bf.price=5.0;
	 
//	syso+alt+/可快速编写输出
	 System.out.println("我今天早上吃的是:"+bf.name+"，它是"+bf.type+"早餐，价格是"+bf.price+"元！");
}
}
