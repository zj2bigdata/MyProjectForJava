package demo.part7;

public class Car {
	public void run(IRoad ir,int speed){
		//���ݹ�·����
			if("cityRoad".equals(ir.type())){
					if(speed>60||speed<10){
						throw new CatusExcption("���н�������:���ѳ���!!!(10-60)km/h");
						//System.out.println("���н�������:���ѳ���!!!(10-60)km/h");
					}else{
						System.out.println("���н�������:��ȫ��ʻ��ƽ���ؼ�O(��_��)O��");
					}
			}else{
					if(speed>120||speed<90){
						System.out.println("���ٽ�������:���ѳ���!!!(90-120)km/h");
					}else{
						System.out.println("���ٽ�������:��ȫ��ʻ��ƽ���ؼ�O(��_��)O��");
					}
			}
	}
}
