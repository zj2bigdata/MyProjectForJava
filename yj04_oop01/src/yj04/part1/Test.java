package yj04.part1;

import yj04.part2.Student;

public class Test {
//object����������ĸ��ࣨ�������Ĭ�ϼ̳У�
//this��super�޷���static(��̬)������������ʹ��
	public static void main(String[] args) {
		//Person p=new Person(); //����Ĭ���޲ι���
		//p.setAge(166); //����Person���е��������䷽��(setter)
		//System.out.println(p.getAge()); //����Person���еĻ�ȡ���䷽������int���͵�ֵ(getter)
		
		Student s=new Student();
//		s.setAge(18);
		//System.out.println(s.age);���ܷ��ʸ���˽������
		//System.out.println(s.name);���ܷ���Ĭ�����η�����(��ͬ��)
//		System.out.println(s.getAge());
//		System.out.println(s.weight);
//		System.out.println(s.height);
		s.print();
	}
}
