package yj04.part1;

//ѭ���ṹ
public class Demo1 {
	public static void main(String[] args) {
		//˳��ṹ
		//ѡ��ṹ
		//ѭ���ṹ
		//��Ҫ���һ�����ڲٳ���Ȧ��50Ȧ��
		System.out.println("�����˵�1Ȧ");
		System.out.println("�����˵�2Ȧ");
		System.out.println("�����˵�3Ȧ");
		System.out.println("�����˵�4Ȧ");
		System.out.println("�����˵�5Ȧ");
		//...
		
		//ѭ���ṹһ��������
		//1.whileѭ��:while(�������ʽ){
		//          		ѭ����
		//				}
		/*
		 * ѭ����Ҫ��
		 * 1.ѭ������ʼ����
		 * 2.ѭ��������
		 * 3.ѭ���ĵ���
		 * */
		int round = 1;//��ʼ����
		while(round <= 50){//ѭ������
			System.out.println("�����˵�"+round+"Ȧ");//ѭ��������
			round++;//��������
		}
		//����ѭ��
		System.out.println("�������������ٳ�30���C4ը�٣�");
		int second = 30;//ѭ����ʼ����
		while(second > 0){
			System.out.println("����ʱ"+second+"��!!!");
			second--;
		}
	}
}
