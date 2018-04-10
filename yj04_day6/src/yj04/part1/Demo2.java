package yj04.part1;

//构造方法(目的:实现实例的快速初始化)
public class Demo2 {
	public static void main(String[] args) {
		//实例化加初始化过程
		Toys doraemon=new Toys();//调用了无参数的Toy类构造方法
		doraemon.id=1;
		doraemon.name="哆啦A梦";
		doraemon.type="毛绒玩具";
		doraemon.area="日本";
		doraemon.crowd="儿童";
		doraemon.price=10.00;
		doraemon.range=9;
		
		Toys ultraman=new Toys();
		ultraman.id=2;
		ultraman.name="迪加奥特曼";
		ultraman.type="毛绒玩具";
		ultraman.area="日本";
		ultraman.crowd="儿童";
		ultraman.price=12.00;
		ultraman.range=9;
		
//参数:int id,String name,double price,String type,String area,int range,String crowd
		Toys superman=new Toys(3,"超人",16.05,"手办","美国",16,"青少年");
		Toys batman=new Toys(4,"蝙蝠侠",18.05,"手办模型","美国",16,"青少年");
	}
}
