package yj04.part1;


public class Demo2 {
	public static void main(String[] args) {
		//����
		//����һ��������(animal)
		//����:���࣬��������Ϣ�أ����֣��Ա�
		//��Ϊ:��У���ʳ��˯��������
		//����������(������������)��ʵ�����������϶�����������Ժ���Ϊ
		
		//ʵ������
		Animal a1=new Animal();
		a1.type="��";
		a1.name="��ë";
		a1.gender="��";
		a1.cry="��";
		a1.place="����";
		a1.bushi("��ͷ");
		a1.sleep();
		a1.crying();
		a1.hibernation("����Ҫ");
		System.out.println("------------");
		//ʵ����è
		Animal a2=new Animal();
		a1.type="è";
		a1.name="��˹��";
		a1.gender="��";
		a1.cry="��";
		a1.place="����";
		a1.bushi("��ͷ");
		a1.sleep();
		a1.crying();
		a1.hibernation("����Ҫ");
		System.out.println("------------");
		//ʵ������
		Animal a3=new Animal();
		a1.type="��";
		a1.name="������";
		a1.gender="ĸ";
		a1.cry="��";
		a1.place="�й�����";
		a1.bushi("�������ӵ�");
		a1.sleep();
		a1.crying();
		a1.hibernation("��Ҫ");
		
		System.out.println("------------");
		Student s1=new Student();
		s1.name="�����";
		s1.age=18;
		s1.say();
		//����������д�ϲ������ͣ�һ��Ҫд�ϸ���������Ӧ�ı���ֵ(ʵ��).
		s1.changeAge(100);//100Ϊʵ��
		System.out.println(s1.eating("����"));
		System.out.println(s1.coke("������","��ҹ��"));
	}
}
