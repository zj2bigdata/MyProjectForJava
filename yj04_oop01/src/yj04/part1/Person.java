package yj04.part1;

//��װ
//�̳�
public class Person {
	private int age;
	 String name="zxc";
	public int weight=50;
	protected double height=1.70;

	public Person(){
		System.out.println("Person");
	}
	public Person(String sss){
		System.out.println(sss);
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>100){
			System.out.println("���Ϸ�����!�����¸�ֵ!");
			return;//��ֹ��������ִ��
		}
//		else{
		this.age = age;//this��ʾ��ǰ��
//		}
	}
	
	public void getInfo(){
		System.out.println("This is a person!"+"����:"+name+"���أ�KG��"+weight);
	}
}
