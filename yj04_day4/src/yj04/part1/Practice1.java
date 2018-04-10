package yj04.part1;

import java.util.Scanner;

//
public class Practice1 {
	public static void main(String[] args) {
		//飞机围绕地球飞(用户输入)，每一圈消耗500升油，最后一圈只用480升油.
		int old=0;
		System.out.println("请输入飞机需要绕地球飞行的圈数:");
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
		System.out.println(count+"圈飞完了总共耗油:"+old+"升");
		
		//1-100累加值
		int j=100;
		int sum=0;
		while(j>0){
			sum+=j;
			j--;
		}
		System.out.println("1-100累加值:"+sum);
	
		//计算1-100之间的偶数和
		int k=100;
		int sum1=0;
		int sum2=0;
		while(k>0){
			if(k%2==0){//判断是偶数
				sum1+=k;
			}else{//否则为奇数
				sum2+=k;
			}
			k--;
		}
		System.out.println("1-100偶数和:"+sum1+",1-100奇数和:"+sum2);
	}
}
