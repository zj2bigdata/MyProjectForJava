package yj04.part1;

//创建一个People
public class People {
	//属性声明
	int age;
	float height;
	
	//行为声明
	void printAge(){
		System.out.println("今年"+age+"岁");
	}
	void printHeight(){
		System.out.println("身高(m):"+height);
	}
	public void changeAge(int newAge){
		age=newAge;
	}
	public void changeHeight(float newHeight){
		height=newHeight;
	}
}
