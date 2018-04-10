package Nom5;

//怪物类
public class Monster {
	public String name; //怪物名称
	public int attact; //攻击力
	public int defanse; //防御力
	public double killMoney;//掉落金币
	public int life; // 血量
	
	public Monster(String name,int att,int def,double killMoney,int life){
		this.name = name;
		this.attact = att;
		this.defanse = def;
		this.killMoney = killMoney;
		this.life = life;
	}
}
