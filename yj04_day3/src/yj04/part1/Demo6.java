package yj04.part1;

import java.util.Scanner;

//���֧�ṹ
public class Demo6 {
	public static void main(String[] args) {
		//��:3,4,5
		//��:6,7,8
		//��:9,10,11
		//��:12,1,2
		/*
		 * ���֧�ṹ��if.else˫��֧�ṹ�϶���һ��else if()
		 * ��else if()��Ҳ��Ҫִ����Ӧ�Ĳ����жϣ��жϳ��������{}��
		 * if..elseif..else��һ��������߼��жϵ�Ԫ,ֻ�ܽ�������һ���жϿ�
		 * */
		System.out.println("�������·�:");
		int month=new Scanner(System.in).nextInt();
		if(month>=3&&month<=5){
			System.out.println("���紵����");
		}else if(month>=6&&month<=8){
			System.out.println("��ϧ���ճ�");
		}else if(month>=9&&month<=11){
			System.out.println("�����������");
		}else if(month==12||month==1||month==2){
			System.out.println("��������÷����");
		}else{
			System.out.println("�޸��·�!");
		}
	}
}
