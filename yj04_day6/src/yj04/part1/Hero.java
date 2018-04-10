package yj04.part1;

public class Hero {
	String name;//名字
	int life;//声明
	String skill;//技能
	
	//无参数无返回值
	//方法：人行为，编程环境下称为方法，在设计环境下称为行为
	//方法是完成某项工作的一个过程
	//访问修饰符 public  void该方法无返回值  say方法名(该方法无参数){} 
	public void say(){
		System.out.println("我乃"+name+"是也！");
	}
	
	//有参数无返回值方法
	//参数为String类型 enemy的形参
	//释放技能
	public void kill(String enemy){
		System.out.println(name+":"+enemy+"吃我一招"+skill);
	}
	
	//有返回值有参数的方法
	//杀敌
	//一旦一个方法长生返回值，该方法结尾必须写上关键字return以及相应类型的值
	public double getMoney(String enemy,double count){
		//System.out.println(name+"斩杀了敌人"+enemy+count+"次!!!"+"获得"+count*100+"两银子!");
		return count*100;
	}
}
