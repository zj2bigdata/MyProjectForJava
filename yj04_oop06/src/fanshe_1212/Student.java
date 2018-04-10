package fanshe_1212;

public class Student {
	private int age;
	public String name;
	private Student(){
		
	}
	public Student(int i){
		System.out.println("带参");
	}
	public Student(int i,String mo){
		System.out.println("带参");
	}
	public void hello(){
		
	}
	private String say(String hello){
		return hello;
	}
}
