package jiekou.part3;

public class Test {
	public static void main(String[] args) {
		System.out.println(ICark.PI);//static���ε����Կ���ֱ�ӷ���
		//ICark ia=new ICark();�޷�ʵ����,�ӿ��޹��캯��
		CarkImpl ci=new CarkImpl();
		ci.sum(1, 4);
		
		ICark ic=new CarkImpl();//��̬
		ic.sum(3, 7);
	}
}
