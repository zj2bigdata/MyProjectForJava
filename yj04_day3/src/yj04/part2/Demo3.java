package yj04.part2;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		//�ڱ��ʽ���Եó����ֵ�������
				//ʹ��switch-case���Ч������
				System.out.println("����������:");
				String starName=new Scanner(System.in).next();
				switch (starName) {
				//switch ()�е�ֵ��byte,int ,short,shar,String(JDK1.8������)
				//switch�ڵ�ֵ�ȶ�ʱ�������ƣ��ɶ��Ը��ã��������������޷����ڷ�Χֵ���ж�
				case "�ܽ���":
					System.out.println("");
//					break;
				case "���»�":
					System.out.println("��Ա");
					break;
				case "ϰ���":
					System.out.println("�й�����������ίԱ������ǣ��й��������ίԱ����ϯ���л����񹲺͹���ϯ���л����񹲺͹��������ίԱ����ϯ");
					break;
				case "��Ӣ":
					System.out.println("��������Ա������");
					break;
				case "����":
					System.out.println("�й���ۣ�����һ����Ա");
					break;
				default://��ʾ��������˼
					System.out.println("����һ��������ʶ");
					break;
				}
	}
}
