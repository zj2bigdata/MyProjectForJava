package yj04_1207;
/*
 * ��̬������ָ��static����
 * ����ĳ���࣬������ʵ������
 * ͨ����������
 * ��̬�����ֻ�ᱻִ��һ��
 * */
public class StaticDemo {
		static int sum;//static �������� ������
		int sum5=5;
		static{System.out.println("��̬�����");}
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			StaticDemo s=new StaticDemo();
			s.sum++;
			System.out.println(s.sum);
		}
		System.out.println(sum);//��̬��������Է������о�̬��Ա����
		//System.out.println(sum5);//��̬�������޷����Է������зǾ�̬��Ա����
	}
}
