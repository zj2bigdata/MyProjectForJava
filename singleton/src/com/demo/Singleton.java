package com.demo;

public class Singleton {
	//私有化构造函数
	private Singleton() {}
	//实例化当前对象
	private static final Singleton s=new  Singleton();
	
	public static final Singleton getSingleton(){
		return s;
	}
	
}
