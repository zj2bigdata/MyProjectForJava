package Nom4;

//英雄类
public class Hero {
	public String name;//姓名
	public String desc;//英雄介绍
	public int level;//等级
	public int attact;//攻击力
	public int defense;//防御力
	public int life;//血量
	public double money;//钞票
	
	//英雄类的构造方法，快速赋值
	public Hero(String name,String desc,int level,int attact,int defense,int life,double money){
		this.name = name;
		this.desc = desc;
		this.level = level;
		this.attact = attact;
		this.defense =defense;
		this.life = life;
		this.money = money;
	}
}
