package yj04.part1;

import java.util.Scanner;

//ʹ��˫��֧�ж����������Ƿ�����
//1.���Ա�4���������ܱ�100����,���߿��Ա�400��������ô��������
public class Demo5 {
	public static void main(String[] args) {
		System.out.println("�������ж����");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
}
