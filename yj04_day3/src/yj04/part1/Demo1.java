package yj04.part1;

import java.util.Scanner;

//˳��ṹ,���϶��µ�ִ�д���
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("��������������:");
		Scanner sr1=new Scanner(System.in);
		String name=sr1.next();
		
		System.out.println("��������������:");
		Scanner sr2=new Scanner(System.in);
		String age=sr2.next();
		
		System.out.println("�����������Ա�:");
		Scanner sr3=new Scanner(System.in);
		String sex=sr3.next();
		
		System.out.println("�ҽ�"+name+",�ҵ�������:"+age+",�ҵ��Ա���:"+sex);
		sr1.close();
		sr2.close();
		sr3.close();
	}
}
