package yj04.part1;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * do-whileѭ��
		 * С���Ͻ���ʮ���ձ���ÿ���ձ�2Ԫ���ؼҵ�·��͵����һ��.�������ձ��ܹ�ֵ����Ǯ
		 * */
		int num=10;//ѭ����ʵ����
		int sum=0;
		do {//ѭ���ĵ���
			if(num<10){
				sum+=2;
			}
			num--;
		} while (num>0);//ѭ������
//		System.out.println(sum);
		
		//ʹ��do-whileʵ��ѭ��
		boolean flag=false;
		String name="";
		String pass="";
		do {
			System.out.println("�������绶ӭ��:");
			System.out.println("�������ʺ�:");
			name=new Scanner(System.in).next();
			System.out.println("����������:");
			pass=new Scanner(System.in).next();
			if(name.equals("centos666")&&pass.equals("666666")){
				System.out.println("��¼�ɹ�!");
				flag=false;
			}else{
				System.out.println("�ʺŻ������������������:");
				flag=true;
			}
		} while (flag);
		
		
	}
}
