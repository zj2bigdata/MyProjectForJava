package yj04.part1;

//创建一个动物类(animal)
		//属性:种类，叫声，栖息地，名字，性别
		//行为:吼叫，捕食，睡觉，冬眠
public class Animal {
	String type;
	String cry;
	String place;
	String name;
	String gender;
	
	void crying(){
		System.out.println(name+"叫声是:"+cry+cry+cry+"...");
	}
	void bushi(String food){
		System.out.println(name+"的食物:"+food);
	}
	void sleep(){
		System.out.println(name+"每天需要:"+"睡觉ing");
	}
	void hibernation(String need){
		System.out.println(name+need+"冬眠ing");
	}
}
