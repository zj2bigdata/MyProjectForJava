package yj04.part1;

//����һ��ʳ���ࣺʳ��ID��name,type,area,evaluate,price
//Ϊ���ഴ��һ�����췽�����������ʵ������
//��Practice��ʵ������ʳ���࣬���ٳ�ʼ��
public class Food {
	int id;
	String name;
	String type;
	String area;
	boolean evaluate;
	double price;
	public Food(){
		
	}
	public Food(int id,String name,String type,String area,boolean evaluate,double price){
		this.id=id;
		this.name=name;
		this.type=type;
		this.area=area;
		this.evaluate=evaluate;
		this.price=price;
		System.out.println(id+" "+name+" "+type+" "+area+" "+(evaluate?"�ó�":"���ó�")+" "+price);
	}
}
