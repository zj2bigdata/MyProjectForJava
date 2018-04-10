package yj04_1211;

import java.util.HashMap;
import java.util.Map;
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
//利用Map<int,Map<String,Object>> spCar 升级购物车功能
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
			System.out.println("==========购物车===============");
			System.out.println("1.添加商品"); //ok
			System.out.println("2.删除商品"); //ok
			System.out.println("3.修改购买数量"); //ok
			System.out.println("4.查看购物车"); //ok
			System.out.println("5.结算(结算时显示明细)");//ok 
			System.out.println("6.清空购物车"); //ok
			System.out.println("7.退出购物"); //ok
			System.out.println("=========================");
			System.out.println("请输入您的选择:");
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
				System.out.println("感谢您的使用，欢迎下次继续体验^_^！正在退出...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("退出成功！");
				System.exit(0);
				break;

			default:
				System.out.println("请重新选择:");
				flag=true;
				break;
			}
		}while(flag);
	}
	//添加商品
	public static void tianjia(Map<Integer,Map<String,Object>> spCar){
		boolean flag=true;
		int index=-1;
		while(flag){
			Map<String,Object> m=new HashMap<String, Object>();
			System.out.print("请输入需要添加的商品名称:");
			String name=s.next();
			for(int i=0;i<spCar.size();i++){
				if(name.equals(spCar.get(i).get("名称"))){
					index=i;
				}
			}
			if(index==-1){
				m.put("名称", name);
				System.out.print("请输入需要添加的商品价格:");
				double price =s.nextDouble();
				m.put("价格", price);
				System.out.print("请输入需要添加的商品数量:");
				int num=s.nextInt();
				m.put("数量", num);
				spCar.put(i, m);
				
			}else{
				System.out.print("请输入需要添加的商品数量:");
				int num=s.nextInt();
				int oldValue=(int) spCar.get(index).get("数量");
				int newValue=oldValue+num;
				spCar.get(index).replace("数量",oldValue,newValue);	
			}
			System.out.print("是否继续添加?(y/n):");
			String sel=s.next();
			if("y".equals(sel)){
				i++;
			}else{
				start(spCar);
			}
		}
	}
	
	//查看购物车
	public static void see(Map<Integer,Map<String,Object>> spCar){
		if(spCar.isEmpty()){
			System.out.println("购物车为空!!!");
		}else{
			System.out.println("----------------------------------------------------------");
			System.out.println("编号\t\t商品\t\t价格\t\t\t数量");
			for(int i=0;i<spCar.size();i++){
				System.out.println((i+1)+"\t\t"+spCar.get(i).get("名称")+"\t\t"+spCar.get(i).get("价格")+"\t\t\t"+spCar.get(i).get("数量"));
			}
			System.out.println("-----------------------------------------------------------");
		}
		start(spCar);
	}
	
	//清空购物车
	public static void clear(Map<Integer,Map<String,Object>> spCar){
		spCar.clear();
		System.out.println("正在清空购物车.......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("清空完成！");
		start(spCar);
	}
	//结算购物车
	public static void account(Map<Integer,Map<String,Object>> spCar){
		double money=0;
		System.out.println("----------------------------------------------------------");
		System.out.println("商品\t\t价格\t\t\t数量");
		for(int i=0;i<spCar.size();i++){
			System.out.println(spCar.get(i).get("名称")+"\t\t"+spCar.get(i).get("价格")+"\t\t\t"+spCar.get(i).get("数量"));
			money+=((double)(spCar.get(i).get("价格"))*(int)(spCar.get(i).get("数量")));
		}
		System.out.println("\t\t\t\t\t总价:"+money+"￥");
		System.out.println("-----------------------------------------------------------");
		System.out.print("是否结算？(y/n)");
		String sel=s.next();
		if("y".equals(sel)){
			System.out.println("付款中.......");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("付款成功！！！感谢使用！！！！");
			clear(spCar);
		}else{
			start(spCar);
		}
	}
	
	public static void changeNum(Map<Integer,Map<String,Object>> spCar){
		System.out.println("编号\t\t商品\t\t数量");
		for(int i=0;i<spCar.size();i++){
			System.out.println((i+1)+"\t\t"+spCar.get(i).get("名称")+"\t\t"+spCar.get(i).get("数量"));
		}
		System.out.print("请输入需要修改数量的编号:");
		int sel=s.nextInt()-1;
		if(spCar.containsKey(sel)){
			System.out.print("请输入需要修改的数量:");
			int num=s.nextInt();
			spCar.get(sel).put("数量", num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("修改成功！");
			see(spCar);
		}else{
			System.out.println("抱歉，没找到该编号的商品！！！");
			changeNum(spCar);
		}
	}
	
	//删除商品
	public static void deleate(Map<Integer,Map<String,Object>> spCar){
		System.out.println("编号\t\t商品");
		for(int i=0;i<spCar.size();i++){
			System.out.println((i+1)+"\t\t"+spCar.get(i).get("名称"));
		}
		System.out.print("请输入需要删除商品的编号:");
		int sel=s.nextInt()-1;
		if(spCar.containsKey(sel)){
			spCar.remove(sel);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("删除成功！");
			System.out.print("是否继续删除?(y/n)");
			String num=s.next();
			if("y".equals(num)){
				deleate(spCar);
			}else{
				start(spCar);
			}
		}else{
			if(spCar.isEmpty()){
				System.out.println("购物车已经空了！！！");
				start(spCar);
			}else{
				deleate(spCar);
			}
		}
	}
}


