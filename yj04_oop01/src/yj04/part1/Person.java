package yj04.part1;

//封装
//继承
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
			System.out.println("不合法年龄!请重新赋值!");
			return;//终止方法向下执行
		}
//		else{
		this.age = age;//this表示当前类
//		}
	}
	
	public void getInfo(){
		System.out.println("This is a person!"+"姓名:"+name+"体重（KG）"+weight);
	}
}
