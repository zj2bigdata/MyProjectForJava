package day9.part1;
/*
	è������,�������ߵĶ��⹦��
	
	�������Ӿ��嵽����
		è��
			����,����
			�Է���˯��
		����
			����,����
			�Է���˯��
			
		�����й��Թ��ܣ����ԣ����ǳ�ȡ��һ�����ࣺ
		���
			����,����
			�Է�();
			˯��(){}
			
		è���̳��Զ���
		�����̳��Զ���
		
		���ߵĶ��⹦����һ���µ���չ���ܣ���������Ҫ����һ���ӿ�
		�ӿڣ�
			����
			
		����è��ʵ������
		���ֹ���ʵ������
	ʵ�֣�
		�ӳ��󵽾���
		
	ʹ�ã�
		ʹ�þ�����
*/
//�������߽ӿ�
interface Jumpping {
	//���߹���
	public abstract void jump();
}

//���������
abstract class Animal {
	//����
	private String name;
	//����
	private int age;
	
	public Animal() {}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	//�Է�();
	public abstract void eat();
	
	//˯��(){}
	public void sleep() {
		System.out.println("˯������");
	}
}

//����è��
class Cat extends Animal {
	public Cat(){}
	
	public Cat(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("è����");
	}
}

//���幷��
class Dog extends Animal {
	public Dog(){}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("������");
	}
}

//�����߹��ܵ�è
class JumpCat extends Cat implements Jumpping {
	public JumpCat() {}
	
	public JumpCat(String name,int age) {
		super(name,age);
	}

	public void jump() {
		System.out.println("����è");
	}
}

//�����߹��ܵĹ�
class JumpDog extends Dog implements Jumpping {
	public JumpDog() {}
	
	public JumpDog(String name,int age) {
		super(name,age);
	}

	public void jump() {
		System.out.println("���߹�");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		//��������è������
		JumpCat jc = new JumpCat();
		jc.setName("����A��");
		jc.setAge(3);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		System.out.println("-----------------");
		
		JumpCat jc2 = new JumpCat("�ӷ�è",2);
		System.out.println(jc2.getName()+"---"+jc2.getAge());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		
		//�������߹������в��Ե������Լ���ɡ�
	}
}