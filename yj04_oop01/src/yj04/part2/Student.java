package yj04.part2;

import yj04.part1.Person;
//ͨ���̳�������Լ̳и�������������
//�����޷����ʸ�����˽�����Ժͷ���
//��ͬ���е�Ĭ�����ε����Ժͷ���Ҳ�޷�����
//���캯��������Ҫ���ø����ǰ��Ĺ��캯��ʱ�����뽫���������
public class Student extends Person {
	public Student(){
		super("ssss");//��ʾ���ø��๹�캯��(����ʽ������)
	}
	
	public Student(int age){
		this();
	}
	
	public Student(String name){
		this(18);
	}
	
//	public int weight =66;
	
	public void print(){
		System.out.println(super.weight);//super��ʾ����
		System.out.println(this.weight);//�����ǰ��û��weight���ԣ����Ӹ�����Ҹ�����
	}
}
