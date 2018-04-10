package yj04.part1;

//创建一个食物类：食物ID，name,type,area,evaluate,price
//为该类创建一个构造方法，对其快速实例化，
//在Practice中实例化该食物类，快速初始化
public class Food {
	int id;
	String name;
	String type;
	String area;
	boolean evaluate;
	double price;
	public Food(){
		
	}
	public Food(int id,String name,String type,String area,boolean evaluate,double price){
		this.id=id;
		this.name=name;
		this.type=type;
		this.area=area;
		this.evaluate=evaluate;
		this.price=price;
		System.out.println(id+" "+name+" "+type+" "+area+" "+(evaluate?"好吃":"不好吃")+" "+price);
	}
}
