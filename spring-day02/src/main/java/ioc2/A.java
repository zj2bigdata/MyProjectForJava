package ioc2;
//��������ʽע��
public class A {
	private B b;
	public A() {
		System.out.println("A()");
	}
	
	public A(B b) {
		System.out.println("A(B)");
		this.b = b;
	}

	public void excute(){
		System.out.println("excute()");
		b.f1();
	}
	
}
