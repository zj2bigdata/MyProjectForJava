package jiekou.part3;

//接口只能定义常量和抽象方法
public interface ICark extends ISic {
	double PI=3.14;//默认用public static final修饰属性
	void sum(int a,int b);//默认用public abstract修饰方法
}
