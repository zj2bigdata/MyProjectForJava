package yj04.part1;

//forѭ��
public class Demo3 {
	public static void main(String[] args) {
		/*
		 * for(���ʽ1;���ʽ2;���ʽ3){ ѭ���� }
		 * 1.���ʽ1:ѭ���Ļ�������
		 * 2.���ʽ2:ѭ��������
		 * 3.ѭ���ĵı�������
		 * */
		
		//����1:����ʮȦ
//		for(int i=1;i<11;i++){
//			System.out.println("�������ܵ�"+i+"Ȧ��");
//		}
		
		//����2:ϲ������ɽ��8848�ף�һ��ֽ���0.01�ף�ʹ�ø߿Ƽ���ֽ���������۵����۵������ٴβŻ���ɽͬ��
		int sum=1;
		int count=0;
		for(sum=1;sum<=884800;sum*=2){
			count++;
		}
		System.out.println("�۵�����Ϊ:"+count);
		
		//����3:һ�γٵ�1Ԫ��2��2Ԫ��3��4Ԫ��4��8Ԫ��...
		//��ѧ�ڳٵ�20�η������
		int money=1;
		int sum_money=1;
		for(int i=2;i<=20;i++){
			money*=2;
			sum_money+=money;
		}
		System.out.println("�ٵ�20�η���:"+sum_money+"Ԫ!");
	}
}
