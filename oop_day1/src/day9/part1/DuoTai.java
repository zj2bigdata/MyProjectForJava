package day9.part1;

//��̬:��������д�����أ��̳л�ʵ�֣���������ָ���������
//�������˶�Ա����

//1.��������
abstract class Person1{
	 private String name;
	 private int age;
	 public Person1(){}
	 public Person1(String name,int age){
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
	 public abstract void eat();
	 public abstract void sleep();
}
//����ӿڿ���ʵ���˶�Ա���Ե��˶��س�
interface character{
	public abstract  void sport();
}
//������
class Coaches extends Person1{
	public Coaches(){}
	public Coaches(String name,int age){
		super(name,age);
	}
	 public void eat(){};
	 public void sleep(){};
	 public void sport(){System.out.println("�̵��˶�Ա��");};
}
//�˶�Ա��
class Sporter extends Person1 implements character{
	String sport;
	public Sporter(){}
	public Sporter(String name,int age,String sport){
		super(name,age);
		this.sport=sport;
	}
	 public void eat(){};
	 public void sleep(){};
	 public  void sport(){System.out.println("���ó�:"+sport);};
}
public class DuoTai {
	public static void main(String[] args) {
		//�����Ž���
		Person1 z=new Coaches("�ż�",18);
		z.eat();
		z.sleep();
		Coaches z1=(Coaches)z;
		z1.sport();
		//������ѧԱ
		Sporter s=new Sporter("����",18,"��Ӿ");
		s.eat();
		s.sleep();
		s.sport();
	}
}
