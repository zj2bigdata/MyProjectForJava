package yj04_1207;

//��̬����-��̬�����-��̬����-ʵ������-ʵ�������-���췽��
public class StaticDemo2 {
	public StaticDemo2(){
		System.out.println("���췽��1");
		}
	{
		System.out.println("��ͨ�����2");
		}
	static{
		System.out.println("��̬�����3");
		}
	
	public static void main(String[] args) {
		new StaticDemo2();//��̬�����3 ��ͨ�����2 ���췽��1
		System.out.println("--------------------------------------");
		new StaticDemo2();//��ͨ�����2 ���췽��1 (��̬�����ֻ�ᱻִ��һ��,JVM�����������ʱִ��һ��)
		
	}
}
