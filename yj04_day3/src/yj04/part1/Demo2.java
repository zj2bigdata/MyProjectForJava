package yj04.part1;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//����
		/*
		 * ���(����Ǯ){
		 * 	�Ҿ��������ܳ�
		 * }
		 * 
		 * ���(���Ǵ�ţ){
		 * 	�Ҿ���д������
		 * }
		 * 
		 * ���(�һ��){
		 * 	�Ҿ�������
		 * }
		 * if(�������͵ı��ʽ){
				��С����������true����ִ��
			}
		 
		 * �������жϽṹ��,if�������ж���ʽ
		 * 1.����֧�ṹ
		 * ֻ��if���飬����if����������ʽ����ִ�д����������ͬ;
		 * ����֧�У�ÿ��if��䶼��һ��������ҵ���ж�;
		 * ��if�����,ִ�����ֻ��һ������Բ���{}���������Ƽ�;
		 * �ڣ�JDK1.8��ǰ�ᱨ��jdk1.8��������Ϊһ��,����Ҳ���Ƽ�(���ʹ���ɶ���).
		 * 2.˫��֧�ṹ
		 * 3.���֧�ṹ
		 * */
		
		System.out.println("����������?");
		Scanner sc=new Scanner(System.in);
		String hd=sc.next();
		if(hd.equals("��")){
			System.out.println("��ţ��");
		}
		if(hd.equals("����")){
			System.out.println("��ˣ�");
		}
		System.out.println("OK");
		//=������ֵ��==�������жϡ�
		
		
	}
}
