package yj04.part1;

//��������
public class Demo3 {
	public static void main(String[] args) {
		//����syso�������о������ֳ�����
//		System.out.println("hello");
//		System.out.println(123);
//		System.out.println(false);
		Demo3 de=new Demo3();
		de.palyGame();
		de.palyGame("dad",19.00);
		palyGame("Ӣ������");
	
	}
	public void palyGame(){
		System.out.println("��ϲ��������ҫ");
	}
	//����������һ�����У����صķ���,��������ͬ�������ĸ��������Ͳ�ͬ���͹���������
	public static void palyGame(String name){
		System.out.println("��Ҳϲ��Ӣ������");
	}
	//���سɹ�����Ϊ�������������ͬԭ��
	public void palyGame(String name,double price){
		System.out.println("��Ҳϲ��");
	}
	//�����˲������Ͳ�һ��
	public void palyGame(double price,String area){
		System.out.println("��Ҳϲ��");
	}
	//ֻ���ڲ������������ͣ��뷵��ֵ�����޹�
//	public String playGame(double price,String area){
//		return "area";
//	}
}
