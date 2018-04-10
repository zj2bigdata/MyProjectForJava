package yj04_lol;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*************************");
		System.out.println("*        英雄联盟                       *");
		System.out.println("*************************");
		System.out.println("欢迎来到英雄联盟，请先登录：");
		boolean flag = true;
        do{
        	System.out.print("账号：");
            Scanner sc = new Scanner(System.in);
            String name= sc.next();
    		System.out.print("密码：");
            Scanner sc1 = new Scanner(System.in);
            String pass = sc1.next();
           
            if(name.equals("zj") && pass.equals("666")){
            	System.out.println("恭喜！登陆成功");
            	flag = true;
            }else{
                System.out.println("您输入的账号密码有误，请重新登录");
                flag = false;
            }
        }while(flag == false);
        System.out.println("欢迎来到符文之地行星");
        System.out.println("这片大陆上的人民自古以来就喜欢结群而斗，用战争解决纷争");
        System.out.println("不论何时战争绝对的工具都是魔法");
        //2.展示英雄列表（使用英雄类型的数组装载英雄对象）使用循环遍历这个英雄数组。
        Demo2 lol = new Demo2();
        Hero hero = lol.getHero();
        //3.调用进入新手村
        lol.newPlayer(hero);
	}
	
	//定义一个方法用来展示，英雄列表
	//定义方法的目的，在于把游戏中的功能，单一化，模块化来进行管理
	public Hero getHero(){
		Hero sun = new Hero("孙悟空","俺老孙来也！",60,25,577,40);
		Hero ka = new Hero("卡特琳娜","开始大杀特杀吧",60,30,480,40);
		Hero gai = new Hero("盖伦","德玛西亚万岁",50,18,430,40);
		Hero pan = new Hero("潘森","长矛无法平静下来",55,45,500,40);
		Hero mang = new Hero("盲僧","我会识破这一切",60,21,520,40);
		Hero jia = new Hero("嘉文四世","德玛西亚永世长存！",55,25,550,50);
		
		//使用Hero数组装载英雄对象
		Hero[] heros = {sun,ka,gai,pan,mang,jia};
		
		//展示英雄列表(表头信息)
		System.out.println("========================英雄列表========================");
		System.out.println("编号\t姓名\t介绍\t\t攻击力\t防御力\t生命\t金币");
		//展示英雄列表(数据部分，遍历英雄数组)
		for (int i = 0; i < heros.length; i++) {
			System.out.println(i+1+"\t"+heros[i].name+"\t"+heros[i].desc+"\t"+heros[i].attack+"\t"+heros[i].defense+"\t"+heros[i].life+"\t"+heros[i].money);
		}
		System.out.println("请选择你喜欢的英雄进入游戏!");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no>=1 && no<=6){
			System.out.println("你已经选择了"+heros[no-1].name+"进入了游戏，下面进入符文之地的冒险吧");
			return heros[no-1];
		}else{
			System.out.println("无此英雄，请重新选择");
			return getHero();//递归调用
		}
		
	}
	
	//展示并选择英雄
	public void newPlayer(Hero h) throws InterruptedException{
		System.out.println("========================");
		System.out.println("欢迎来到德莱联盟！");
		System.out.println("1.确认信息\n2.出城打怪\n3.购买装备\n4.退出游戏");
		System.out.println("请选择下一步:");
		System.out.println("========================");
		int key=new Scanner(System.in).nextInt();
		switch (key) {
		case 1:
			System.out.println("==========="+h.name+"英雄信息如下==============");
			System.out.println("攻击:"+h.attack+"\t"+"防御:"+h.defense+"\t"+"生命:"+h.life+"\t"+"金钱:"+h.money);
			System.out.println("========================================");
			newPlayer(h);
			break;
		case 2:
			killMonster(h);
			break;
		case 3:
			shopping(h);
			break;
		case 4:
			System.out.println("您确认退出游戏吗?");
			String answer=new Scanner(System.in).next();
			if(answer.equals("y")){
				System.out.println("正在退出....");
				for(int i=0;i<5;i++){
					if(i==4){//如果是最后一秒，则换行显示游戏关闭
						System.out.println(1);
					}else{
						System.out.println(5-i+"\t");
					}
					//线程
					new Thread().sleep(1000);
				}
				System.out.println("退出成功!");
				System.exit(0);
			}else{
				newPlayer(h);
			}
			break;

		default:
			System.out.println("无该选项!请重新输入");
			newPlayer(h);
			break;
		}
	}
	
	//购买装备
	public void shopping(Hero h) throws InterruptedException{
		Eqiupment drag=new Eqiupment("屠龙",25,50,235.0);
		Eqiupment dragx=new Eqiupment("玉灵龙",55,0,495.0);
		Eqiupment drags=new Eqiupment("龙之心",100,100,735.0);
		Eqiupment bard=new Eqiupment("英盔",10,70,135.0);
		Eqiupment bardx=new Eqiupment("银魂铠",80,45,475.0);
		Eqiupment bards=new Eqiupment("三项铠",100,180,700.0);
		Eqiupment bardm=new Eqiupment("黄袍",10,10,40.0);
		Eqiupment[] eq={drag,dragx,drags,bard,bardx,bards};
		System.out.println("欢迎光临!您的英雄:"+h.name+"拥有金币:"+h.money);
		System.out.println("============装备列表==============");
		System.out.println("编号\t名字\t攻击力\t防御力\t价格");
		for (int i = 0; i < eq.length; i++) {
			System.out.println(i+1+"\t"+eq[i].name+"\t"+eq[i].attack+"\t"+eq[i].defense+"\t"+eq[i].price);
		}
		System.out.println("================================");
		System.out.print("请输入需要购买的装备编号:");
			int eqNo=new Scanner(System.in).nextInt();
			if(eqNo>=1&&eqNo<=eq.length){
				if(h.money>=eq[eqNo-1].price){
					h.attack+=eq[eqNo-1].attack;
					h.defense+=eq[eqNo-1].defense;
					h.money-=eq[eqNo-1].price;
					System.out.println("购买成功!");
				}else{
					System.out.println("购买失败，您的钱不够哦!");
				}
				System.out.print("继续购买?(y/n):");
				String y=new Scanner(System.in).next();
				if(y.equals("y")){
					shopping(h);
				}else{
					newPlayer(h);
				}
			}else{
				System.out.println("该编号装备暂没上架!");
				shopping(h);
			}
		
	}
	
	//打怪
	public void killMonster(Hero h) throws InterruptedException{
		Monster mo1=new Monster("石头人",30,21,800,10);
		Monster mo2=new Monster("狗头",24,27,700,30);
		Monster mo3=new Monster("亡灵",38,55,400,20);
		Monster mo4=new Monster("炮车",33,43,960,25);
		Monster[] mos={mo1,mo2,mo3,mo4};
		//英雄遭遇怪物
		System.out.println("将随机匹配怪物与英雄搏斗!搏斗倒计时...");
		int i=(int)(Math.floor(Math.random()*4));
		System.out.println(h.name+"遭遇到了"+mos[i].name+"!");
		//伤害值(声明变量存储每一回合英雄和怪物的伤害值)
		int hkm=h.attack-mos[i].defense;//英雄对怪物伤害
		int mkh=mos[i].attack-h.defense;//怪物对英雄的伤害
		//规避伤害为负数
		if(hkm<=0){
			hkm=1;
		}
		if(mkh<=0){
			mkh=1;
		}
		
		//双方血量都在0以上时将继续搏斗
		do{
			//计算伤害和生命
			//需要注意生命为负数
			if(hkm==1&&mkh==1){
				System.out.println(h.name+":与怪物不相上下,搏斗没意义!");
				System.out.println(mos[i].name+":别跑啊!小菜");
				break;
			}
			h.life-=mkh;
			mos[i].life-=hkm;
			if(h.life<0){
				h.life=0;
			}
			if(mos[i].life<0){
				mos[i].life=0;
			}
			System.out.println(h.name+"对"+mos[i].name+"造成"+hkm+"点伤害!");
			System.out.println(mos[i].name+"对"+h.name+"造成"+mkh+"点伤害!");
			System.out.println("英雄还剩:"+h.life+"点血!");
			System.out.println("敌人还剩:"+mos[i].life+"点血!");
			System.out.println("----------------------------------------");
		}while(h.life>0&&mos[i].life>0);
		System.out.println(h.life);
		System.out.println(mos[i].life);
		if(h.life==0){
			System.out.println(mos[i].name+":斩杀你真不痛快!哈哈!");
			System.out.println("正在返回新手村....");
			for(int j=0;j<4;j++){
				if(j==3){//如果是最后一秒，则换行显示游戏关闭
					System.out.println(1);
				}else{
					System.out.println(4-j+"\t");
				}
				//线程
				new Thread().sleep(1000);
			}
			h.life=500;
			newPlayer(h);
		}
		if(mos[i].life==0){
			h.money+=mos[i].money;
			System.out.println(h.name+":斩杀"+mos[i].name+"得到其掉落金钱"+mos[i].money+"！");
			System.out.println("是否继续打怪(y/n):");
			String answer=new Scanner(System.in).next();
			if(answer.equals("y")){
				killMonster(h);
			}else{
				newPlayer(h);
			}
		}
	}
}
