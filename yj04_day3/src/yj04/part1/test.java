package yj04.part1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		/*
		 * ��д����ʵ���������ݣ�if���ʵ��
			���Գɼ��ֵȼ���
			90~100	A�ȡ�
			80-89	B�ȡ�
			70-79	C�ȡ�
			60-69	D�ȡ�
			60����	E�ȡ�
			����ݸ����ɼ��������Ӧ�ĵȼ���
		 * */
		
		System.out.println("���������Ŀ��Գɼ�:");
		int score=new Scanner(System.in).nextInt();
		if(score<60){
			System.out.println("���ĳɼ���Ӧ�ȼ�Ϊ:E��");
		}
		if(score>=60&&score<=69){
			System.out.println("���ĳɼ���Ӧ�ȼ�Ϊ:D��");
		}
		if(score>=70&&score<=79){
			System.out.println("���ĳɼ���Ӧ�ȼ�Ϊ:C��");
		}
		if(score>=80&&score<=89){
			System.out.println("���ĳɼ���Ӧ�ȼ�Ϊ:B��");
		}
		if(score>=90&&score<=100){
			System.out.println("���ĳɼ���Ӧ�ȼ�Ϊ:A��");
		}
	}
}
