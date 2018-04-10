package yj04.part2;

import java.util.Scanner;

public class Pratice {
	public static void main(String[] args) {
		System.out.println("----------欢迎来到威漫世界------------");
		System.out.println("英雄列表:");
		System.out.println("编号\t\t人物\t\t台词\t\t\t技能");
		
		
		Heros hero1=new Heros();
		hero1.name="美国队长";
		hero1.dialogue="我看好你,加油啊";
		hero1.skill="扔盾牌";
		
		Heros hero2=new Heros();
		hero2.name="蜘蛛侠";
		hero2.dialogue="能力越大，责任越大";
		hero2.skill="蜘蛛丝";
		
		Heros hero3=new Heros();
		hero3.name="超人";
		hero3.dialogue="钢铁之躯就是我";
		hero3.skill="超人射线";
		
		Heros[] hero=new Heros[3];
		hero[0]= hero1;
		hero[1]= hero2;
		hero[2]= hero3;
		
		for(int i=0;i<hero.length;i++){
			System.out.println(i+1+"\t\t"+hero[i].name+"\t\t"+hero[i].dialogue+"\t\t"+hero[i].skill);
		}
		
		System.out.println("请选择你最喜欢的英雄:");
		
		int i=new Scanner(System.in).nextInt();
		switch(i-1){
		 case 0:
			 System.out.println("您选择的是"+hero[0].name+",他对您说:"+hero[0].dialogue+",他的技能是:"+hero[0].skill);
			 break;
		 case 1:
			 System.out.println("您选择的是"+hero[1].name+",他对您说:"+hero[1].dialogue+",他的技能是:"+hero[1].skill);
			 break;
		 case 2:
			 System.out.println("您选择的是"+hero[2].name+",他对您说:"+hero[2].dialogue+",他的技能是:"+hero[2].skill);
			 break;
		default:
			System.out.println("其他英雄正在开发中!敬请期待！");
			break;
		}
		
	}
}
