package Nom5;

import java.util.Random;
import java.util.Scanner;

/**
 * 英雄联盟
 * @author pengsir
 *
 */
public class LOL {
	public static void main(String[] args) throws InterruptedException {
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
	    //流程2.展示英雄的列表信息，获取英雄对象
		Hero hero = lol.selectHero();
		/* 流程3.进入新手村
		 * 1).英雄信息
		 * 2).出村打怪
		 * 3).购买装备
		 * 4).退出游戏
		 */
		lol.newPerson(hero);
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
		if(name.equals("zj")&&pass.equals("666")){
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
	
	//进入新手村
	public void newPerson(Hero hero) throws InterruptedException{
		System.out.println("------------");
		System.out.println("*欢迎进入新手村*");
		System.out.println("------------");
		System.out.println("1.确认信息");
		System.out.println("2.出村打怪");
		System.out.println("3.购买装备");
		System.out.println("4.退出游戏");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("英雄："+hero.name);
			System.out.println("简介："+hero.desc);
			System.out.println("等级："+hero.level);
			System.out.println("伤害："+hero.attact);
			System.out.println("防御："+hero.defense);
			break;
		case 2:
			fight(hero);
			//调用一个打怪的方法
			break;
		case 3:
			//卖装备
			break;
		case 4:
			//退出游戏
			break;
		default:
			System.out.println("暂不提供此服务");
			break;
		}
	}
	
	//打怪方法
	public void fight(Hero hero) throws InterruptedException{
		//1)初始化怪物信息
		Monster dragon = new Monster("纳什男爵",80,50,1000,1000);
		Monster stone = new Monster("熔岩巨兽",40,50,500,500);
		Monster gnome = new Monster("地精",20,10,80,200);
		Monster ghost = new Monster("幽灵",20,60,200,300);
		Monster corpse = new Monster("僵尸王",100,20,500,600);
		//2)使用怪物数组装载怪物对象
		Monster[] mons = {dragon,stone,gnome,ghost,corpse};
		//3)随机数参数怪物
		int num = new Random().nextInt(5);
		System.out.println("您的英雄已经进入战备状态，敌人还有30秒到达战场");
		System.out.println(hero.name+"遭遇到了"+mons[num].name);
		//我对怪我造成的伤害
		int atth = 0;
		//怪物对我造成的伤害
		int attm = 0;
		do {
			//如果英雄对怪我造为负伤害，则直接把本次伤害归0
			if(hero.attact - mons[num].defanse <0){
				atth = 0;
			}else{
				//否则本次伤害按常规数据计算
				atth = hero.attact - mons[num].defanse;
			}
			//如果怪物对英雄造成负数伤害，也把本次伤害归0
			if(mons[num].attact - hero.defense <0){
				attm = 0;
			}else{
				//否则本次伤害按常规数据计算
				attm = mons[num].attact - hero.defense;
			}
			System.out.println(hero.name+"对"+mons[num].name+"造成了"+atth+"点伤害");
			System.out.println(mons[num].name+"对"+hero.name+"造成了"+attm+"点伤害");
			//计算本次战斗后的血量
			hero.life = hero.life - attm;
			mons[num].life = mons[num].life - atth;
			//规避英雄负生命情况出现
			if(hero.life < 0){
				hero.life = 0;
				System.out.println(hero.name+"还剩"+hero.life+"点生命==="+mons[num].name+"还剩"+mons[num].life+"点生命");
				//跳出本次打怪的操作，进入新手村养伤
				break;
			}
			//规避怪物生命出现负数
			if(mons[num].life < 0){
				mons[num].life = 0;
				System.out.println(hero.name+"还剩"+hero.life+"点生命==="+mons[num].name+"还剩"+mons[num].life+"点生命");
				break;
			}
			System.out.println(hero.name+"还剩"+hero.life+"点生命==="+mons[num].name+"还剩"+mons[num].life+"点生命");
			new Thread().sleep(500);//调用线程的sleep方法，让当前线程休眠500毫秒
		} while (hero.life>0&&mons[num].life>0);
		//判断如果怪物死了，则获取怪物掉落的金币
		if(mons[num].life <= 0){
			System.out.println(mons[num].name+"已被杀死"+hero.name+"获得了"+mons[num].killMoney);
			hero.money = hero.money + mons[num].killMoney;
			System.out.println("请问是否继续打怪？<y/n>");
			String key = new Scanner(System.in).next();
			if(key.equals("y")){
				fight(hero);//继续打怪
			}else{
				newPerson(hero);//回新手村
			}
	    //如果英雄死了，则回到新手村
		}else if(hero.life <= 0){
			System.out.println(hero.name+"已经阵亡，返回新手村");
			hero.life = 500;
			newPerson(hero);//调用进入新手村方法
		}
	}
}
