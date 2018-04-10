package Thread.part2;
//wait��notify
public class WaitNotifyDemo extends Thread{
	private Object o;
	private boolean f=true;
	public WaitNotifyDemo(){}
	public WaitNotifyDemo(Object o,boolean f){
		this.o=o;
		this.f=f;
	}
	public void run(){
		synchronized(o){
			if(f){
				try {
					System.out.println("1");
					o.wait();//ʹ��ǰ�߳�����
					Thread.sleep(500);
					System.out.println("2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("3");
				o.notify();//���ѵ�ǰ�߳�
				System.out.println("4");
			}
		}
	}
	
	public static void main(String[] args) {
		Object o=new Object();
		WaitNotifyDemo t1=new WaitNotifyDemo(o,true);
		WaitNotifyDemo t2=new WaitNotifyDemo(o,false);
		t1.start();
		t2.start();
	}
}
