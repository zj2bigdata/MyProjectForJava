package yj04.part1;

//����һ��People
public class People {
	//��������
	int age;
	float height;
	
	//��Ϊ����
	void printAge(){
		System.out.println("����"+age+"��");
	}
	void printHeight(){
		System.out.println("���(m):"+height);
	}
	public void changeAge(int newAge){
		age=newAge;
	}
	public void changeHeight(float newHeight){
		height=newHeight;
	}
}
