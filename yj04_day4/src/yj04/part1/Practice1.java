package yj04.part1;

import java.util.Scanner;

//
public class Practice1 {
	public static void main(String[] args) {
		//�ɻ�Χ�Ƶ����(�û�����)��ÿһȦ����500���ͣ����һȦֻ��480����.
		int old=0;
		System.out.println("������ɻ���Ҫ�Ƶ�����е�Ȧ��:");
		int count=new Scanner(System.in).nextInt();
		int i=count;
		while(i>=1){
			if(i==1){
				old+=480;
			}else{
				old+=500;
			}
			i--;
		}
		System.out.println(count+"Ȧ�������ܹ�����:"+old+"��");
		
		//1-100�ۼ�ֵ
		int j=100;
		int sum=0;
		while(j>0){
			sum+=j;
			j--;
		}
		System.out.println("1-100�ۼ�ֵ:"+sum);
	
		//����1-100֮���ż����
		int k=100;
		int sum1=0;
		int sum2=0;
		while(k>0){
			if(k%2==0){//�ж���ż��
				sum1+=k;
			}else{//����Ϊ����
				sum2+=k;
			}
			k--;
		}
		System.out.println("1-100ż����:"+sum1+",1-100������:"+sum2);
	}
}
