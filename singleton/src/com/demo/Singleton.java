package com.demo;

public class Singleton {
	//˽�л����캯��
	private Singleton() {}
	//ʵ������ǰ����
	private static final Singleton s=new  Singleton();
	
	public static final Singleton getSingleton(){
		return s;
	}
	
}
