package io.part2;

import java.io.Serializable;

public class Student  implements Serializable{
	private String name;
	private int age;
	private final int Weight=50;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return Weight;
	}
	
}
