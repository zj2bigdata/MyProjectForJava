package yj04.part1;

//����
public class Demo1 {
	//����:ʹ�ñ�������ѧԱ��Ϣ,100��ѧԱ�������������ķ�ʽ���ٲ�������Ϣ
	//����ʹ�ñ����޷����,���Ҫ����100���������ǻ�ܳ��ڴ�
	//ʹ���������������
	public static void main(String[] args) {
		String name1="zj";
		//....
		//��������Ϊ10���ַ�������
		//[]��ʾ��0��ʼƥ������(0-9)����Ϊ10;
		//�������Ԫ��ʱ����ʹ��ͬһ����������
		//int[] array=new int[];������������Ҫ���볤��
		//�����һ��������ʽ����Ϊ��̬��ʼ��
		String[] names = new String[10]; //@2a139a55 �����new String[10]������ڴ��ַ
		System.out.println(names);//
		System.out.println(names.length);//�����鳤��Ϊ10
		//System.out.println(names[10]);//java.lang.ArrayIndexOutOfBoundsException �����±�Խ��
		//��ô��ʾ����ĵ�һ������
		names[0]="ׯ��";
		//names[0]=10; ����cannot convert from int to String
		System.out.println("----------------------------------------------");
		
		//��̬��ʼ��
		char[] charArray;
		char[] charArray1;
		//��ʼ����������Ȼ�����
		charArray =new char[]{'��','��','��','��','��'};
		System.out.println("charArray����:"+charArray.length);
		System.out.println(charArray);
		charArray1=charArray;//��charArray�ĵ�ַͬʱ����charArray1
		System.out.println(charArray1);
		charArray1[2]='2';//�޸�charArray1��ͬʱ�ı�charArrayָ���ֵ
		System.out.println(charArray);
		//��һ�ֶ�̬��ʼ��
		int[] intArray={1,2,3,4,5};
		System.out.println(intArray);
		System.out.println(intArray[0]);
		System.out.println(intArray[2]);
		System.out.println("-----------------------");
		//Ĭ��ֵ
		int[] intArray1= new int[1];
		System.out.println(intArray1[0]);//����ӡintĬ��ֵ0
		char[] charArray3= new char[1];
		System.out.println(charArray3[0]);//jdk1.8�����Ͻ���ӡcharĬ��ֵ��
		double[] doubleArray3= new double[1];
		System.out.println(doubleArray3[0]);//����ӡdoubleĬ��ֵ0.0
		boolean[] booleanArray3= new boolean[1];
		System.out.println(booleanArray3[0]);//����ӡbooleanĬ��ֵ0.0
		String[] stringArray3= new String[1];
		System.out.println(stringArray3[0]);//����ӡstringĬ��ֵnull(�������Ĭ��ֵ����null)
		
		System.out.println("-----------------------------------------------");
		//�������:ѭ��չʾ���ݼ��е�ÿһ��Ԫ��
		String[] foods={"����","����","����","ը��","ơ��"};
		//forѭ��
		System.out.println("�ҵ�Ӫ�������:");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		//java��for...eachѭ��(��ǿforѭ��):�����ڱ������ݼ�
		//����foods
		//foods�е�ÿһ��Ԫ������,��ÿ��Ԫ������food
		System.out.println("(for...each)�ҵ�Ӫ������:");
		for(String food:foods ){
			System.out.println(food);
		}
	}
}