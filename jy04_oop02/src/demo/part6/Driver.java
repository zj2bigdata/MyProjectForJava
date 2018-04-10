package demo.part6;

public class Driver {
	int speed;
	String place;
	public Driver(int speed,String place){
		this.speed=speed;
		this.place=place;
	}
	void driveCar(IMove im){
		im.moving(speed,place);
	}
}
