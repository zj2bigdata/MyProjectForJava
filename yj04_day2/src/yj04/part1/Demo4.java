package yj04.part1;

/*
 * 1.���������
 * 2.��ϵ�����
 * 3.�߼������
 * 4.��Ŀ�����
 * */
public class Demo4 {
	public static void main(String[] args) {
		/*�ӷ�����
		 * 1.���������������͵ļӷ�����
		 * 2.�������ٵ�ǰ������һ������
		 * 3.һ�����ֺ�ĳ���ַ���֮��ʹ��+,��ô+��ʾ���ӷ�
		 * */
		int a=10;
		int b=15;
		String c="20";
		int d =-50;
		System.out.println(a+b); //25
		System.out.println(+d);  //+(-50)-->-50
		System.out.println(a+b+c);//2520
		
		/*��������
		 * 1.��������
		 * 2.����ֵ�ļ�������(�޷����ַ�����������)
		 * */
		System.out.println(a-b);
		System.out.println();
		
		/* *,/,%
		 * 1.*�����˷�����
		 * 2./������������
		 * 3.%����ȡģ����
		 * 4.�����Լ����㣨++��--��
		 * */
		System.out.println(a*b%a);
		int x=7;
		int y=8;
		int z=9;
		//++/--��ǰ����������ִ��,�ں���֮
		System.out.println(x++);//7
		System.out.println(++x);//9
		System.out.println(z--);//9
		System.out.println(--z);//7
		
		int a1=8,c1=9,b1=10;
		a1=b1++;
		c1=--b1;
		b1=++a1;
		System.out.println(a+" "+b+" "+c);
		
		//��ά�����д��
		int k=20;
		System.out.println(k-=x);
		System.out.println(k+=k);
		
		//��Ŀ�����
		int o=25;
		int p=20;
		int q;
		//��Ŀ���� ���ʽ?���ʽΪtureʱ��ȡֵ:���ʽΪfalseʱ��ֵ
		q=o-p>10?20:50;//q=50
		System.out.println(q);
		System.out.println(o-=p+o);
		
	}
}
