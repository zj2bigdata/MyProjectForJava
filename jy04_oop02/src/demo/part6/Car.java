package demo.part6;

public class Car implements IMove{
	@Override
	public void moving(int speed,String place) {
		if("���ٹ�·".equals(place)){//��equals������ðѳ�������ǰ��
			if(speed>120||speed<90){
				System.out.println("���ٽ�������:���ѳ���!!!(90-120)km/h");
			}else{
				System.out.println("���ٽ�������:��ȫ��ʻ��ƽ���ؼ�O(��_��)O��");
			}
		}else{
			if(speed>60||speed<10){
				System.out.println("���н�������:���ѳ���!!!(10-60)km/h");
			}else{
				System.out.println("���н�������:��ȫ��ʻ��ƽ���ؼ�O(��_��)O��");
			}
		}
	}

}
