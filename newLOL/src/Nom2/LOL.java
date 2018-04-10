package Nom2;

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
	    System.out.println("进入游戏..........");
	}
	
	//登陆方法
	public boolean login(){
		System.out.println("欢迎游玩英雄联盟，请先登录：");
		System.out.println("用户名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("密码：");
		Scanner sc1 = new Scanner(System.in);
		String pass = sc.next();
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
}
