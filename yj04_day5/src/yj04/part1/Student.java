package yj04.part1;

//��(��)�����ķ���
//��(��)����ֵ����
/*
 * ����
 * ����ֵ
 * 
 * */
public class Student {
	String name;
	int age;
	String hoby;
	
	//��д�޲���,�޷���ֵ����
	//say(�����б�Ϊ��)��
	//������ʹ��void����ʾ�޷���ֵ��
	public void say(){
		System.out.println(name+":������ʴ�ۣ��������棬������������ȡ����ʹ��!");
	}
	//�÷����в������޷���ֵ.�в�������()�ж����ǣ������еĲ�����Ҫд�ϴ����͵ı�������Ϊ�β�.
	public void changeAge(int age){
		this.age=age;
		System.out.println("�ҽ����"+age+"��");
	}
	
	//�÷�����void��Ϊ�÷���String,�÷�����������return,�����Ҫ����ʲô���͵�ֵ����һ��Ҫreturn�����͵�ֵ
	public String eating(String food){
		return "��ϲ����"+food;
	}
	
	//��д�з���ֵ�ķ���
	public String coke(String agg,String rice){
		return "�ϰ���ҳ���һ�뵰��������������"+agg+"��һ��"+rice;
	}
	
}
