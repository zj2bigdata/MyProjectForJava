package yj04.part1;

import java.util.Scanner;

//if��˫��֧�ṹ
public class Demo4 {
	public static void main(String[] args) {
		/*
		 * ˫��֧���ṹ����һ��else
		 * ��if����������ʱ��һ�������else����
		 * ÿһ��if.else˫��֧���ṹ������һ���������ж�
		 * */
		System.out.println("��������ϲ����ʳ��:");
		Scanner sc=new Scanner(System.in);
		String food=sc.next();
		if(food.equals("����ȫϯ")){
			System.out.println("����ȫ��!");
		}else{
			System.out.println("����û�����ˣ�");
		}
		
		if(food.equals("���ݳ���")){
			System.out.println("�");
		}else{
			System.out.println("�Ҳ������ˣ�");
		}
		
//		if(food.equals("�����"));{
//			System.out.println(112);
//		}
		//�����жϺ��ܴ�ֺţ�����������
	}
}
