package ioc;

public class A {
	private IB ib;
	
	public void setB(IB ib) {
		System.out.println("setIB()");
		this.ib = ib;
	}
	public A() {
		System.out.println("A()");
	}
	public void excute(){
		ib.f1();
		System.out.println("excute()");
	}
	
}
