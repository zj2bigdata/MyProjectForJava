package yj04.part1;

import java.util.Scanner;

//if�жϵ�ѭ��Ƕ��ʹ��
public class Demo8 {
	public static void main(String[] args) {
//		System.out.println("С�����͹٣����Ǵ�������ס�ꣿ");
//		String hd=new Scanner(System.in).next();
//		if(hd.equals("����Ǯ")){
//			System.out.println("�͹٣��þƺò��ź���");
//			System.out.println("С��������Ե�ɶ��");
//			String hd1=new Scanner(System.in).next();
//			if(hd1.equals("����ȫϯ")){
//				System.out.println("С�������У���������!���ϣ������ϲ�!");
//			}else if(hd1.equals("������")){
//				System.out.println("С����һ�밡���У����Ȼᣡ");
//			}
//		}else if(hd.equals("û��Ǯ")){
//			System.out.println("С���������������");
//		}
		
		//��ֵ���(if..elseif..else)
		/*
		 * 1-10:Ӱ������
		 * 11-30:û��������
		 * 31-50:û������
		 * 51-70��������
		 * 71-80�������Է�
		 * 81-90��С����
		 * 91-100��������
		 * */
		
		System.out.println("��������������ֵ��");
		int fen=new Scanner(System.in).nextInt();
		if(fen>=1&&fen<=10){
			System.out.println("Ӱ������");
		}else if(fen>=11&&fen<=30){
			System.out.println("û��������");
		}else if(fen>=31&&fen<=50){
			System.out.println("û������");
		}else if(fen>=51&&fen<=70){
			System.out.println("������");
		}else if(fen>=71&&fen<=80){
			System.out.println("�����Է�");
		}else if(fen>=81&&fen<=90){
			System.out.println("С����");
		}else{
			System.out.println("������");
		}
	}
}
