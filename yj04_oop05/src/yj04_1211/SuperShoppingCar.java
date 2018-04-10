package yj04_1211;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ��Ŀ�����ü���ʵ�ֹ��ﳵ����
	����Ҫ�����£�
	1.�����Ʒ
	2.ɾ����Ʒ
	3.�޸Ĺ�������
	4.�鿴���ﳵ
	5.����(����ʱ��ʾ��ϸ)
	6.��չ��ﳵ
	7.�˳�����

 * */
//����Map<int,Map<String,Object>> spCar �������ﳵ����
public class SuperShoppingCar {
	static Scanner s=new Scanner(System.in);
	static int i=0;
	public static void main(String[] args) {
		Map<Integer,Map<String,Object>> spCar=new HashMap<Integer, Map<String,Object>>();
		start(spCar);
	}
	public static void start(Map<Integer,Map<String,Object>> spCar){
		
		boolean flag=false;
		int sel=0;
		do{
			System.out.println("==========���ﳵ===============");
			System.out.println("1.�����Ʒ"); //ok
			System.out.println("2.ɾ����Ʒ"); //ok
			System.out.println("3.�޸Ĺ�������"); //ok
			System.out.println("4.�鿴���ﳵ"); //ok
			System.out.println("5.����(����ʱ��ʾ��ϸ)");//ok 
			System.out.println("6.��չ��ﳵ"); //ok
			System.out.println("7.�˳�����"); //ok
			System.out.println("=========================");
			System.out.println("����������ѡ��:");
			sel=s.nextInt();
			switch (sel) {
			case 1: 
				tianjia(spCar);
				flag=false;
				break;
			case 2:
				deleate(spCar);
				flag=false;
				break;
			case 3:
				changeNum(spCar);
				flag=false;
				break;
			case 4:
				see(spCar);
				flag=false;
				break;
			case 5:
				account(spCar);
				flag=false;
				break;
			case 6:
				clear(spCar);
				flag=false;
				break;
			case 7:
				System.out.println("��л����ʹ�ã���ӭ�´μ�������^_^�������˳�...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�˳��ɹ���");
				System.exit(0);
				break;

			default:
				System.out.println("������ѡ��:");
				flag=true;
				break;
			}
		}while(flag);
	}
	//�����Ʒ
	public static void tianjia(Map<Integer,Map<String,Object>> spCar){
		boolean flag=true;
		int index=-1;
		while(flag){
			Map<String,Object> m=new HashMap<String, Object>();
			System.out.print("��������Ҫ��ӵ���Ʒ����:");
			String name=s.next();
			for(int i=0;i<spCar.size();i++){
				if(name.equals(spCar.get(i).get("����"))){
					index=i;
				}
			}
			if(index==-1){
				m.put("����", name);
				System.out.print("��������Ҫ��ӵ���Ʒ�۸�:");
				double price =s.nextDouble();
				m.put("�۸�", price);
				System.out.print("��������Ҫ��ӵ���Ʒ����:");
				int num=s.nextInt();
				m.put("����", num);
				spCar.put(i, m);
				
			}else{
				System.out.print("��������Ҫ��ӵ���Ʒ����:");
				int num=s.nextInt();
				int oldValue=(int) spCar.get(index).get("����");
				int newValue=oldValue+num;
				spCar.get(index).replace("����",oldValue,newValue);	
			}
			System.out.print("�Ƿ�������?(y/n):");
			String sel=s.next();
			if("y".equals(sel)){
				i++;
			}else{
				start(spCar);
			}
		}
	}
	
	//�鿴���ﳵ
	public static void see(Map<Integer,Map<String,Object>> spCar){
		if(spCar.isEmpty()){
			System.out.println("���ﳵΪ��!!!");
		}else{
			System.out.println("----------------------------------------------------------");
			System.out.println("���\t\t��Ʒ\t\t�۸�\t\t\t����");
			for(int i=0;i<spCar.size();i++){
				System.out.println((i+1)+"\t\t"+spCar.get(i).get("����")+"\t\t"+spCar.get(i).get("�۸�")+"\t\t\t"+spCar.get(i).get("����"));
			}
			System.out.println("-----------------------------------------------------------");
		}
		start(spCar);
	}
	
	//��չ��ﳵ
	public static void clear(Map<Integer,Map<String,Object>> spCar){
		spCar.clear();
		System.out.println("������չ��ﳵ.......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�����ɣ�");
		start(spCar);
	}
	//���㹺�ﳵ
	public static void account(Map<Integer,Map<String,Object>> spCar){
		double money=0;
		System.out.println("----------------------------------------------------------");
		System.out.println("��Ʒ\t\t�۸�\t\t\t����");
		for(int i=0;i<spCar.size();i++){
			System.out.println(spCar.get(i).get("����")+"\t\t"+spCar.get(i).get("�۸�")+"\t\t\t"+spCar.get(i).get("����"));
			money+=((double)(spCar.get(i).get("�۸�"))*(int)(spCar.get(i).get("����")));
		}
		System.out.println("\t\t\t\t\t�ܼ�:"+money+"��");
		System.out.println("-----------------------------------------------------------");
		System.out.print("�Ƿ���㣿(y/n)");
		String sel=s.next();
		if("y".equals(sel)){
			System.out.println("������.......");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("����ɹ���������лʹ�ã�������");
			clear(spCar);
		}else{
			start(spCar);
		}
	}
	
	public static void changeNum(Map<Integer,Map<String,Object>> spCar){
		System.out.println("���\t\t��Ʒ\t\t����");
		for(int i=0;i<spCar.size();i++){
			System.out.println((i+1)+"\t\t"+spCar.get(i).get("����")+"\t\t"+spCar.get(i).get("����"));
		}
		System.out.print("��������Ҫ�޸������ı��:");
		int sel=s.nextInt()-1;
		if(spCar.containsKey(sel)){
			System.out.print("��������Ҫ�޸ĵ�����:");
			int num=s.nextInt();
			spCar.get(sel).put("����", num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�޸ĳɹ���");
			see(spCar);
		}else{
			System.out.println("��Ǹ��û�ҵ��ñ�ŵ���Ʒ������");
			changeNum(spCar);
		}
	}
	
	//ɾ����Ʒ
	public static void deleate(Map<Integer,Map<String,Object>> spCar){
		System.out.println("���\t\t��Ʒ");
		for(int i=0;i<spCar.size();i++){
			System.out.println((i+1)+"\t\t"+spCar.get(i).get("����"));
		}
		System.out.print("��������Ҫɾ����Ʒ�ı��:");
		int sel=s.nextInt()-1;
		if(spCar.containsKey(sel)){
			spCar.remove(sel);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ɾ���ɹ���");
			System.out.print("�Ƿ����ɾ��?(y/n)");
			String num=s.next();
			if("y".equals(num)){
				deleate(spCar);
			}else{
				start(spCar);
			}
		}else{
			if(spCar.isEmpty()){
				System.out.println("���ﳵ�Ѿ����ˣ�����");
				start(spCar);
			}else{
				deleate(spCar);
			}
		}
	}
}


