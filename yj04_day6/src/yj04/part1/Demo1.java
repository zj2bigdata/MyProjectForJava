package yj04.part1;

/*
 * �����Ĵ����������ĵ��ã��вκ�ʵ��
 * 
 * ���췽��
 * 
 * ��������
 * 
 * �������η�
 * 
 * 
 * */
public class Demo1 {
	public static void main(String[] args) {
		Hero liu=new Hero();
		//.��������������
		liu.name="����";
		liu.life=500;
		liu.skill="�ʵ�";
		//ͨ��.��������������
		liu.say();
		
		Hero guan=new Hero();
		//.��������������
		guan.name="����";
		guan.life=600;
		guan.skill="��ʥ";
		//ͨ��.��������������
		guan.say();
		
		Hero zhang=new Hero();
		//.��������������
		zhang.name="�ŷ�";
		zhang.life=800;
		zhang.skill="����";
		//ͨ��.��������������
		zhang.say();
		
		System.out.println("----kill----");
		//���÷���ʱ���ݵĲ������ͱ������βε�������ͬ
		liu.kill("�ܲ�");
		guan.kill("����");
		zhang.kill("��Ȩ");
		
		System.out.println("----getMoney----");
		//���÷���ʱ���ݵĲ������ͱ������βε�������ͬ
		double money1=liu.getMoney("�ܲ�",10);
		double money2=guan.getMoney("����",6);
		double money3=zhang.getMoney("��Ȩ",8);
		System.out.println("�������"+money1);
		System.out.println("������"+money2);
		System.out.println("�ŷɻ��"+money3);
	}
}
