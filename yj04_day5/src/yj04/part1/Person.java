package yj04.part1;


//����(����),�Զ�����
public class Person {
	//�˵Ĺ���������ȡ�����ŵ�һ��������Ϊ����
	//���ƣ�����������˹��˹�����������������ǹ������Ժ���Ϊ��ȡ�����ŵ�һ�����У�������̽����������
	public String name;//����
	public int age;//����
	public char gender;//�Ա�
	public String job;//����
	public String conuntry;//����
	public String address;//��ַ
	public String hoby;//����
	
	//��ȡ�˵Ĺ�����Ϊ�ŵ�һ��������Ϊ����
	//�ݽ�
	public void skill(String skill){
		System.out.println(name+"��"+skill+"!");//ϵͳ��
	}
	//����
	public void work(){
		System.out.println(name+"��Ҫ����!");
	}
	//�Է�
	public void eat(){
		System.out.println(name+"��Ҫ�Է�!");
	}
	//˯��
	public void sleep(){
		System.out.println(name+"��Ҫ˯��!");
	}
	public int income(int money){
		return money/12;
	}
}