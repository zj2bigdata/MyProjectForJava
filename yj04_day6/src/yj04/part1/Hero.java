package yj04.part1;

public class Hero {
	String name;//����
	int life;//����
	String skill;//����
	
	//�޲����޷���ֵ
	//����������Ϊ����̻����³�Ϊ����������ƻ����³�Ϊ��Ϊ
	//���������ĳ�����һ������
	//�������η� public  void�÷����޷���ֵ  say������(�÷����޲���){} 
	public void say(){
		System.out.println("����"+name+"��Ҳ��");
	}
	
	//�в����޷���ֵ����
	//����ΪString���� enemy���β�
	//�ͷż���
	public void kill(String enemy){
		System.out.println(name+":"+enemy+"����һ��"+skill);
	}
	
	//�з���ֵ�в����ķ���
	//ɱ��
	//һ��һ��������������ֵ���÷�����β����д�Ϲؼ���return�Լ���Ӧ���͵�ֵ
	public double getMoney(String enemy,double count){
		//System.out.println(name+"նɱ�˵���"+enemy+count+"��!!!"+"���"+count*100+"������!");
		return count*100;
	}
}
