package yj04.part1;

//�������Ļ���
public class Demo1 {
	public static void main(String[] args) {
		//��һ����ת���һ����ʵ����
		//����һ����(Person)�����  p1(�����ʵ��ȡ��) =
		//new ����һ��ʵ�ʵ���(ʵ��������) �ٴ�����Person(��ʾ�ĸ����ʵ������)
		//��һ��������һ������Ĺ��̽���ʵ��������
		//Person�ǳ�����˵����ͣ���һ��ʵ��ģ�ͣ����ɸ�֪.
		//p1��һ��������һ��������������ʵ���������õ��Ķ����ǿ��Ը�֪�ģ����Լ��Ķ������Ժͷ���
		Person p1=new Person();
		//ʵ���������ʹ�øö���.����������������������Ժͷ���
		p1.name="����";
		p1.age=33;
		p1.gender='��';
		p1.job="��Ա";
		p1.conuntry="�й�";
		p1.hoby="ѧϰ";
		p1.address="�Ϻ�";
		
		
		//ͨ��.���øö��󷽷�
		p1.skill("��Ϸ");
		p1.work();
		p1.eat();
		p1.sleep();
			
		System.out.println("----------------------------------------");
		//ʵ����People��
		People pe1=new People();
		pe1.age=18;
		pe1.height=1.70f;
		System.out.println("�޸�ǰ:");
		pe1.printAge();
		pe1.printHeight();
		System.out.println("�޸ĺ�:");
		pe1.changeHeight(1.8f);
		pe1.changeAge(22);
		pe1.printAge();
		pe1.printHeight();
		
	}
}
