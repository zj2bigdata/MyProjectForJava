package yj04.part1;

//使用构造方法快速进行实例化初始化过程
public class Toys {
	public int id;//编号
	public String name;//名字
	public double price;//价格
	public String type;//种类
	public String area;//地区
	public int range;//年龄段
	public String crowd;//人群
	
	//构造方法主要对一个类快速实例化和初始化
	//无参数构造方法:public 访问修饰符 toy 构造方法名:该名必须与类名相同.构造方法无返回值
	//无参构造方法无初始化作用
	//在类中如果没有编写无参构造方法，那么在程序编译运行的时候，系统会默认添加无参构造方法
	public Toys(){
		//System.out.println("玩具总动员！！！");
	}
	//有参构造方法
	//一旦某个类添加了有参构造方法，建议添加一个无参构造方法
	public Toys(int id,String name,double price,String type,String area,int range,String crowd){
		//this指代该类的属性值
		this.id=id;
		this.name=name;
		this.price=price;
		this.type=type;
		this.area=area;
		this.range=range;
		this.crowd=crowd;
	}
	
	//普通方法
	public void paly(){
		System.out.println("玩旧了可以换信!");
	}
}
