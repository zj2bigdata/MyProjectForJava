package yj04.part1;

public class Father {
	//public ��Ϊ�������еĹ��еģ���ߵķ��ʼ������public��Ա������ĳ�Ա�����Է���;
	public String name;//����
	//private ˽�еģ������⹫�������private��Աֻ�ܱ�����ĳ�Ա���ʣ����ʼ������
	private double money;//˽��Ǯ
	//protected �ܱ����ģ����protected��Աֻ�ܱ�����ĳ�Ա�Լ��������Ա���ʡ�
	//�����Ա�ͬһ������������ĳ�Ա����
	protected String house;//����
	//Ĭ�ϣ���ĳ�Աʲô���η���û�У��ֽа����η���ֻ���౾���Ա�͵�ǰ������ĳ�Ա���Է��ʡ�
	String passport;//����
	public static void main(String[] args) {
		Father fa=new Father();
		fa.money=50;//˽������ֻ�ܱ���ǰ��������
	}
}
