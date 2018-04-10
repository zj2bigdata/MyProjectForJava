package jiekou.part3;

//如果需要继承一个类，那么先继承(extends)再实现(implements)
public class CarkImpl implements ICark{
//实现接口也需要重写其抽象方法
	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	

}
