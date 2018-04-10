package yj04_1211;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 题目：利用集合实现购物车功能
	功能要求如下：
	1.添加商品
	2.删除商品
	3.修改购买数量
	4.查看购物车
	5.结算(结算时显示明细)
	6.清空购物车
	7.退出购物

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
			System.out.println("==========购物车===============");
			System.out.println("1.添加商品"); //ok
			System.out.println("2.删除商品"); //ok
			System.out.println("3.修改购买数量"); //ok
			System.out.println("4.查看购物车"); //ok
			System.out.println("5.结算(结算时显示明细)"); //ok
			System.out.println("6.清空购物车"); //ok
			System.out.println("7.退出购物"); //ok
			System.out.println("=========================");
			System.out.println("请输入您的选择:");
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
				System.out.println("请重新选择:");
				flag=true;
				break;
			}
		}while(flag);
	}
	//添加
	public static  void tianjia(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		String name="";
		double price=0;
		int num =0;
		int index=0;
		while(f){
			System.out.println("请输入您需要添加的商品名称：");
			name =s.next();
			for(int i=0;i<lgs.size();i++){
				if(name.equals(lgs.get(i).name)){
					index=i;
					f1=true;
				}
			}
			if(f1){
				System.out.println("请输入您需要添加的商品数量：");
				num =s.nextInt();
				lgs.get(index).num+=num;
			}else{
				System.out.println("请输入您需要添加的商品价格：");
				price =s.nextDouble();
				System.out.println("请输入您需要添加的商品数量：");
				num =s.nextInt();
				lgs.add(new Goods(name,price,num));
			}
			System.out.print("是否继续添加(y/n):");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
				
			}else{
				
				f=false;
			}
		}
		start(lgs);
	}
	//查看
	public static void see(List<Goods> lgs){
		System.out.println("----------------------------------------------------------");
		System.out.println("商品\t\t价格\t\t\t数量");
		for(Goods g:lgs){
			System.out.println(g.name+"\t\t"+g.price+"\t\t\t"+g.num);
		}
		System.out.println("-----------------------------------------------------------");
		start(lgs);
	}
	//删除
	public static void deleate(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		while(f){
			System.out.print("请输入需要删除的商品名:");
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
				System.out.println("删除该商品成功!");
			}else{
				System.out.println("未查找到该商品或者输入无效!");
			}
			System.out.print("是否继续删除(y/n)?：");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
			}else{
				f=false;
			}
		}

		start(lgs);
	}
	//修改购买数量
	public static void 	changeNum(List<Goods> lgs){
		boolean f=true;
		boolean f1=false;
		while(f){
			System.out.println("请输入需要修改的商品名:");
			String cname=s.next();
			System.out.println("请输入需要修改的数量:");
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
				System.out.println("修改"+cname+"数量成功!");
			}else{
				System.out.println("未查找到该商品或者输入无效!");
			}
			System.out.println("是否继续修改(y/n)?：");
			String sel=s.next();
			if("y".equals(sel)){
				f=true;
			}else{
				f=false;
			}
		}

		start(lgs);
	}
	//结算
	public static void account(List<Goods> lgs){
		double money=0;
			System.out.println("商品\t\t价格\t\t\t数量\t\t\t总额");
			for(Goods g:lgs){
				money+=g.price*g.num;
				System.out.println(g.name+"\t\t"+g.price+"\t\t\t"+g.num);
				
			}
			System.out.println("\n\t\t\t\t\t\t\t"+"合计："+money+"$");
			System.out.println("是否支付(y/n)?：");
			String sel=s.next();
			if("y".equals(sel)){
				clear(lgs);
				start(lgs);
			}else{
				start(lgs);
			}
	}
	//清空
	public static void clear(List<Goods> lgs){
		lgs.clear();
		System.out.println("清空成功!");
		start(lgs);
	}
	
}
