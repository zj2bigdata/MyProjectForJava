package yj04.part1;

import java.util.Scanner;

public class homework {
	public static void main(String[] args){
		String[] arr={"孙权","周瑜","刘备","关羽","曹操","张辽"};
		for(int i=0;i<arr.length/2;i++){
			System.out.println(arr[i]+"     "+arr[i+1]);
		}
		
		Scanner sr=new Scanner(System.in);
		System.out.print("请输入您所要选择的角色:");
		String name=sr.next();
		int index=10;
		for(int j=0;j<arr.length;j++){
			if(name.equals(arr[j])){
				index=j;
			}
		}
		if(index>=arr.length){
			System.out.println("无该角色!");
		}else{
			System.out.println("您选择的角色是:"+arr[index]);
		}
	}
	
}
