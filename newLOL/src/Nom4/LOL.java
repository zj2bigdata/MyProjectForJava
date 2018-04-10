package Nom4;

import java.util.Scanner;

/**
 * 英雄联盟
 * @author pengsir
 *
 */
public class LOL {
	public static void main(String[] args) {
		//输出游戏标题
		System.out.println("--------------");
		System.out.println("----英雄联盟----");
		System.out.println("--------------");
		//流程1.用户登录
		//循环调用用户登录方法，登陆成功则停止调用
		LOL lol = new LOL();
		boolean key = false;
		do {
		    key = lol.login();
		} while (key == false);
	    //流程2.展示英雄的列表信息
		Hero hero = lol.selectHero();
	}
	
	//登陆方法
	public boolean login(){
		System.out.println("欢迎游玩英雄联盟，请先登录：");
		System.out.print("用户名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("密码：");
		Scanner sc1 = new Scanner(System.in);
		String pass = sc1.next();
		if(name.equals("pengsir")&&pass.equals("666")){
			System.out.println("恭喜你，登陆成功");
			System.out.println("欢迎来到符文之地行星!");
			System.out.println("这边大陆上的人民自古以来就喜欢结群而斗，用战争来决绝纷争");
			System.out.println("不论何时战争的解决工具都是魔法!");
			return true;
		}else{
			System.out.println("账号密码有误，请重新登陆");
			System.out.println("------------------");
			return false;
		}
	} 
	
	//初始化英雄，选择英雄
	public Hero selectHero() {
		// 1)初始化英雄信息
		Hero jia = new Hero("嘉文四世", "他是英雄联盟时代诞生的以为光盾王室成员", 1, 43, 35, 500, 400);
		Hero ka = new Hero("卡特琳娜", "人送外号不祥之刃", 1, 65, 30, 500, 400);
		Hero gai = new Hero("盖伦", "我就是德玛西亚之力", 1, 37, 40, 500, 400);
		Hero zhao = new Hero("赵信", "我是光盾王室的私人总管，打野高手", 1, 45, 35, 500, 400);
		Hero ai = new Hero("艾希", "来，吃我一箭。我就是寒冰射手！", 1, 55, 30, 500, 400);
		// 2)创建英雄数组，装载英雄对象
		Hero[] heros = new Hero[] { jia, ka, gai, zhao, ai };
		// 3)使用循环遍历英雄数组，展示英雄列表
		System.out.println("-----英雄列表------");
		int i = 1;
		for (Hero hero : heros) {
			System.out.println(i + "." + hero.name);
			i++;
		}
		System.out.println("请选择您的英雄------");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no >= 1 && no <= 5) {
			System.out.println("你已经选择" + heros[no - 1].name + "。下面进入符文之地的冒险之旅吧");
			return heros[no - 1];//返回已经选择好的英雄
		} else {
			System.out.println("对不起，暂未开放！请重新选择");
			return selectHero(); //表示递归调用，自己调用自己
		}
	}
}
