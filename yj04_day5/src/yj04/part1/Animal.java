package yj04.part1;

//����һ��������(animal)
		//����:���࣬��������Ϣ�أ����֣��Ա�
		//��Ϊ:��У���ʳ��˯��������
public class Animal {
	String type;
	String cry;
	String place;
	String name;
	String gender;
	
	void crying(){
		System.out.println(name+"������:"+cry+cry+cry+"...");
	}
	void bushi(String food){
		System.out.println(name+"��ʳ��:"+food);
	}
	void sleep(){
		System.out.println(name+"ÿ����Ҫ:"+"˯��ing");
	}
	void hibernation(String need){
		System.out.println(name+need+"����ing");
	}
}
