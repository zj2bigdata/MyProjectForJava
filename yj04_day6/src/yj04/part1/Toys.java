package yj04.part1;

//ʹ�ù��췽�����ٽ���ʵ������ʼ������
public class Toys {
	public int id;//���
	public String name;//����
	public double price;//�۸�
	public String type;//����
	public String area;//����
	public int range;//�����
	public String crowd;//��Ⱥ
	
	//���췽����Ҫ��һ�������ʵ�����ͳ�ʼ��
	//�޲������췽��:public �������η� toy ���췽����:����������������ͬ.���췽���޷���ֵ
	//�޲ι��췽���޳�ʼ������
	//���������û�б�д�޲ι��췽������ô�ڳ���������е�ʱ��ϵͳ��Ĭ������޲ι��췽��
	public Toys(){
		//System.out.println("����ܶ�Ա������");
	}
	//�вι��췽��
	//һ��ĳ����������вι��췽�����������һ���޲ι��췽��
	public Toys(int id,String name,double price,String type,String area,int range,String crowd){
		//thisָ�����������ֵ
		this.id=id;
		this.name=name;
		this.price=price;
		this.type=type;
		this.area=area;
		this.range=range;
		this.crowd=crowd;
	}
	
	//��ͨ����
	public void paly(){
		System.out.println("����˿��Ի���!");
	}
}
