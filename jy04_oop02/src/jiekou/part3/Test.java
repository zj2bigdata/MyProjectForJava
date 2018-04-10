package jiekou.part3;

public class Test {
	public static void main(String[] args) {
		System.out.println(ICark.PI);//static修饰的属性可以直接访问
		//ICark ia=new ICark();无法实例化,接口无构造函数
		CarkImpl ci=new CarkImpl();
		ci.sum(1, 4);
		
		ICark ic=new CarkImpl();//多态
		ic.sum(3, 7);
	}
}
