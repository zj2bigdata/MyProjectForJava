package yj04.part2;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		//switch����Χ�ж�
		//��������ע��ʽ���жϣ����Ƿ����������,�Ƽ�ʹ��if..else
		System.out.println("����������:");
		int age=new Scanner(System.in).nextInt();
		switch (age) {
		case 1:
		case 2:
		case 3:	
		case 4:	
		case 5:	
		case 6:
			System.out.println("��ͯ��");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("����");
			break;
		default:
			break;
		}
	}
}
