package demo.part6;

public class Car implements IMove{
	@Override
	public void moving(int speed,String place) {
		if("高速公路".equals(place)){//用equals方法最好把常量放在前面
			if(speed>120||speed<90){
				System.out.println("高速交警提醒:您已超速!!!(90-120)km/h");
			}else{
				System.out.println("高速交警提醒:安全驾驶，平安回家O(∩_∩)O！");
			}
		}else{
			if(speed>60||speed<10){
				System.out.println("城市交警提醒:您已超速!!!(10-60)km/h");
			}else{
				System.out.println("城市交警提醒:安全驾驶，平安回家O(∩_∩)O！");
			}
		}
	}

}
