package yj04.part2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//�ڱ��ʽ���Եó����ֵ�������
				//ʹ��switch-case���Ч������
				System.out.println("������ʡ�ݼ��:");
				char pName=new Scanner(System.in).next().toCharArray()[0];
				switch (pName) {
				case '��':
					System.out.println("����");
					break;
				case '��':
					System.out.println("����");
					break;
				case '��':
					System.out.println("����");
					break;
				case '��':
					System.out.println("�㶫");
					break;
				case '��':
					System.out.println("����");
					break;
				default://��ʾ��������˼
					System.out.println("����ʶ");
					break;
				}
	}
}
