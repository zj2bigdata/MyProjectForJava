package yj04.part1;

import java.util.Scanner;

//����֧�ṹ
public class Demo3 {
	public static void main(String[] args) {
		//��java�У��ж�����ֵ�Ƿ���ȣ���һ����۵��жϣ�
		//1.��ʾ�ж�������ֵ���ڴ��Ƿ�ͬһ����ַ
		//2.�ж�������ֵ���ַ�����ֵ�Ƿ���ͬ
		//�����ַ�ʹ��ASCII,����ʹ��unicode����,
		//����java��==�жϵ��������ڴ�����õ�ַ,��Ҫ�ж������ַ����Ƿ���ȣ���Ҫequals������
		//
		System.out.println("���������ż��:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		if(name.equals("����")){
			System.out.println("������Ա");
		}
		if(name.equals("���»�")){
			System.out.println("��Ҳ����Ա");
		}
		if(name.equals("���")){
			System.out.println("���������Ա");
		}
		if(name.equals("������")){
			System.out.println("����ʶ");
		}
	}
}
