package yj04.part1;

//���췽��(Ŀ��:ʵ��ʵ���Ŀ��ٳ�ʼ��)
public class Demo2 {
	public static void main(String[] args) {
		//ʵ�����ӳ�ʼ������
		Toys doraemon=new Toys();//�������޲�����Toy�๹�췽��
		doraemon.id=1;
		doraemon.name="����A��";
		doraemon.type="ë�����";
		doraemon.area="�ձ�";
		doraemon.crowd="��ͯ";
		doraemon.price=10.00;
		doraemon.range=9;
		
		Toys ultraman=new Toys();
		ultraman.id=2;
		ultraman.name="�ϼӰ�����";
		ultraman.type="ë�����";
		ultraman.area="�ձ�";
		ultraman.crowd="��ͯ";
		ultraman.price=12.00;
		ultraman.range=9;
		
//����:int id,String name,double price,String type,String area,int range,String crowd
		Toys superman=new Toys(3,"����",16.05,"�ְ�","����",16,"������");
		Toys batman=new Toys(4,"������",18.05,"�ְ�ģ��","����",16,"������");
	}
}
