package yj04.part1;

//��������ת������
public class Demo3 {
	public static void main(String[] args) {
		//��������ת�����������໥ת�������ͣ��磨�������ͣ�;
		//double >float>long>int>short>byte
		//С����ת������Ϊ�Զ�ת��,��֮��Ϊǿ��ת��
		
		double wages =98.5;
		//double ---> int ǿ��ת���ᶪʧ���ȣ���Ҫ��ת���ı���ǰ���(ת��������).����:
		int wagesTo=(int)wages;
		System.out.println("ԭʼΪ(double)"+wages+" "+"ת����(int):"+wagesTo);
		
		byte age =36;
		//type --->long �Զ�ת��,���ᶪʧ����
		long ageTo=age;
		
		//�ַ����ͺ���������ת��
		//java��ÿ�����Ļ�Ӣ���ַ�����Ӧ��һ�����룬��unicode���롣
		char name1='��'; //��Ӧ����Ϊ21333
		char name2='լ'; //��Ӧ����Ϊ23429
		int no1=name1;//������ ----> int
		int no2=name2;
		System.out.println(no2);
		
		//��java��ÿһ����ĸ����Ӧһ�����֣���Ascll�롣
		char ch1='a';
		char ch2='b';
		int num1=ch1;
		int num2=ch2;
		System.out.println(num1);
		System.out.println(num2);
	}
}
