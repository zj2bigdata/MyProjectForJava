package yj04.part2;

import java.util.Scanner;

//switch +case���
public class Demo1 {
	public static void main(String[] args) {
		//�ڱ��ʽ���Եó����ֵ�������
		//ʹ��switch-case���Ч������
		System.out.println("������������ڼ�:");
		int i=new Scanner(System.in).nextInt();
		switch(i){
		 case 1://case��ʾƥ�� ��ֵ
			 System.out.println("��������"+i+"Ҫ�Ͽ�");
			 break;//��ʾһ��ƥ��ɹ�����ôʹ��break�����������
		 case 2:
			 System.out.println("��������"+i+"�����Ͽ�");
			 break;
		 case 3:
			 System.out.println("��������"+i+"�Ͽ�ȥ��");
			 break;
		 case 4:
			 System.out.println("��������"+i+"�Ͽΰ�");
			 break;
		 case 5:
			 System.out.println("��������"+i+"��ϣ��");
			 break;
		 case 6:
			 System.out.println("��������"+i+"˯����");
			 break;
		 case 7:
			 System.out.println("��������"+i+"��Ҫ�Ͽ���");
			 break;
		 default:
			 System.out.println("��������"+i+"Ҫ�Ͽ�");
			 break;
		}
	}
}