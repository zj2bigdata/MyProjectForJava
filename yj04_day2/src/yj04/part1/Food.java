package yj04.part1;

//����һ��ʳ���࣬��Ӳ�ͬ���͵ı�����Ϊ���Ը�ֵ
public class Food {
	//�ַ����͵�-ʳ������-�ܲ��ײ�
	//��������-ʳ��۸�-5
	//�ַ�����-����-�ǻ��
	//��������-�в�-true
	//˫��������-�ۿ�-0.98
	
	public static void main(String[] args) {
		 String name="�ܲ��ײ�";
		 int price=5;
		 char evaluation='��';
		 boolean chineseFood=true;
		 double discount=0.98;
		System.out.println("����:"+name+",�۸�:"+price+"��,����:"+evaluation+","+(chineseFood?"��ʽ��":"��ʽ��")+","+"���ۿ�"+discount);
	}

}
