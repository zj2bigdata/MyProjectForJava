package yj04_1211;

import java.util.ArrayList;
import java.util.List;
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
public class Housework {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		List<Goods> lgs=new ArrayList<Goods>();
		start(lgs);
		
	}
	public static void start(List<Goods> lgs){
	
		boolean flag=false;
		int sel=0;
		do{
			System.out.println("==========���ﳵ===============");
			System.out.println("1.�����Ʒ"); //ok
			System.out.println("2.ɾ����Ʒ"); //ok
			System.out.println("3.�޸Ĺ�������"); //ok
			System.out.println("4.�鿴���ﳵ"); //ok
			System.out.println("5.����(����ʱ��ʾ��ϸ)"); //ok
			System.out.println("6.��չ��ﳵ"); //ok
			System.out.println("7.�˳�����"); //ok
			System.out.println("=========================");
			System.out.println("����������ѡ��:");
			sel=s.nextInt();
			switch (sel) {
			case 1: 
				tianjia(lgs);
				flag=false;
				break;
			case 2:
				deleate(lgs);
				flag=false;
				break;
			case 3:
				changeNum(lgs);
				flag=false;
				break;
			case 4:
				see(lgs);
				flag=false;
				break;
			case 5:
				account(lgs);
				flag=false;
				break;
			case 6:
				clear(lgs);
				flag=false;
				break;
			case 7:
				System.exit(0);
				flag=false;
				break;

			default:
				System.out.println("������ѡ��:");
				flag=true;
				break;
			}
		}while(flag);
	}
	//���
	public static  void tianjia(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		String name="";
		double price=0;
		int num =0;
		int index=0;
		while(f){
			System.out.println("����������Ҫ��ӵ���Ʒ���ƣ�");
			name =s.next();
			for(int i=0;i<lgs.size();i++){
				if(name.equals(lgs.get(i).name)){
					index=i;
					f1=true;
				}
			}
			if(f1){
				System.out.println("����������Ҫ��ӵ���Ʒ������");
				num =s.nextInt();
				lgs.get(index).num+=num;
			}else{
				System.out.println("����������Ҫ��ӵ���Ʒ�۸�");
				price =s.nextDouble();
				System.out.println("����������Ҫ��ӵ���Ʒ������");
				num =s.nextInt();
				lgs.add(new Goods(name,price,num));
			}
			System.out.print("�Ƿ�������(y/n):");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
				
			}else{
				
				f=false;
			}
		}
		start(lgs);
	}
	//�鿴
	public static void see(List<Goods> lgs){
		System.out.println("----------------------------------------------------------");
		System.out.println("��Ʒ\t\t�۸�\t\t\t����");
		for(Goods g:lgs){
			System.out.println(g.name+"\t\t"+g.price+"\t\t\t"+g.num);
		}
		System.out.println("-----------------------------------------------------------");
		start(lgs);
	}
	//ɾ��
	public static void deleate(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		while(f){
			System.out.print("��������Ҫɾ������Ʒ��:");
			String del=s.next();
			if(null != del){
				for(int i=0;i<lgs.size();i++){
					if(del.equals(lgs.get(i).name)){
						lgs.remove(i);
						f1=true;
					}
				}
			}
			if(f1){
				System.out.println("ɾ������Ʒ�ɹ�!");
			}else{
				System.out.println("δ���ҵ�����Ʒ����������Ч!");
			}
			System.out.print("�Ƿ����ɾ��(y/n)?��");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
			}else{
				f=false;
			}
		}

		start(lgs);
	}
	//�޸Ĺ�������
	public static void 	changeNum(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		while(f){
			System.out.println("��������Ҫ�޸ĵ���Ʒ��:");
			String cname=s.next();
			System.out.println("��������Ҫ�޸ĵ�����:");
			int cnum=s.nextInt();
			if(null != cname&&cnum!=0){
				for(int i=0;i<lgs.size();i++){
					if(cname.equals(lgs.get(i).name)){
						lgs.get(i).num=cnum;
						f1=true;
					}
				}
			}
			if(f1){
				System.out.println("�޸�"+cname+"�����ɹ�!");
			}else{
				System.out.println("δ���ҵ�����Ʒ����������Ч!");
			}
			System.out.println("�Ƿ�����޸�(y/n)?��");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
			}else{
				f=false;
			}
		}

		start(lgs);
	}
	//����
	public static void account(List<Goods> lgs){
		double money=0;
			System.out.println("��Ʒ\t\t�۸�\t\t\t����\t\t\t�ܶ�");
			for(Goods g:lgs){
				money+=g.price*g.num;
				System.out.println(g.name+"\t\t"+g.price+"\t\t\t"+g.num);
				
			}
			System.out.println("\n\t\t\t\t\t\t\t"+"�ϼƣ�"+money+"$");
			System.out.println("�Ƿ�֧��(y/n)?��");
			String sel=s.next();
			if("y".equals(sel)){
				clear(lgs);
				start(lgs);
			}else{
				start(lgs);
			}
	}
	//���
	public static void clear(List<Goods> lgs){
		lgs.clear();
		System.out.println("��ճɹ�!");
		start(lgs);
	}
	
}
