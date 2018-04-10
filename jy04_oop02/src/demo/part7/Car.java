package demo.part7;

public class Car {
	public void run(IRoad ir,int speed){
		//根据公路测速
			if("cityRoad".equals(ir.type())){
					if(speed>60||speed<10){
						throw new CatusExcption("城市交警提醒:您已超速!!!(10-60)km/h");
						//System.out.println("城市交警提醒:您已超速!!!(10-60)km/h");
					}else{
						System.out.println("城市交警提醒:安全驾驶，平安回家O(∩_∩)O！");
					}
			}else{
					if(speed>120||speed<90){
						System.out.println("高速交警提醒:您已超速!!!(90-120)km/h");
					}else{
						System.out.println("高速交警提醒:安全驾驶，平安回家O(∩_∩)O！");
					}
			}
	}
}
