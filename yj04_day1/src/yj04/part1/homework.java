package yj04.part1;

import java.util.Scanner;

public class homework {
	public static void main(String[] args){
		String[] arr={"��Ȩ","���","����","����","�ܲ�","����"};
		for(int i=0;i<arr.length/2;i++){
			System.out.println(arr[i]+"     "+arr[i+1]);
		}
		
		Scanner sr=new Scanner(System.in);
		System.out.print("����������Ҫѡ��Ľ�ɫ:");
		String name=sr.next();
		int index=10;
		for(int j=0;j<arr.length;j++){
			if(name.equals(arr[j])){
				index=j;
			}
		}
		if(index>=arr.length){
			System.out.println("�޸ý�ɫ!");
		}else{
			System.out.println("��ѡ��Ľ�ɫ��:"+arr[index]);
		}
	}
	
}
