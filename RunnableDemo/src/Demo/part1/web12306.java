package Demo.part1;

public class web12306 implements Runnable{
	private int num=10;
	private boolean flag=true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag){
			test2();
		}
	}
	//ͬ������
	public synchronized void test1(){
		if(num<=0){
			flag=false;
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"�����˵�"+num--+"��Ʊ!");
	}
	
	//ͬ����
	public void test2(){
		synchronized(this){
			if(num<=0){
				flag=false;
				return;
			}
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����˵�"+num--+"��Ʊ!");
		}
		
	}
	
	public static void main(String[] args) {
		web12306 web=new web12306();
		Thread t1=new Thread(web, "��");
		Thread t2=new Thread(web, "��");
		Thread t3=new Thread(web, "��");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
