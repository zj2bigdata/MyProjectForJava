package Thread.part2;
//死锁方式2
public class ThreadLock2Demo implements Runnable{
	private Object car1=new Object();
	private Object car2=new Object();
	private boolean f=true;
	public void run(){
		if(f){
			f=false;
			synchronized(car1){
				System.out.println("1");
				synchronized(car2){
					System.out.println("2");
				}
			}
		}else{
			synchronized(car2){
				System.out.println("2");
				try {
					Thread.sleep(10000);//让t2锁住car2一段时间，所以t1锁住car1后无法去锁car2
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadLock2Demo tl1=new ThreadLock2Demo();
		Thread t1=new Thread(tl1);
		Thread t2=new Thread(tl1);
		t1.start();
		t2.start();
		//tl1.notify();//java.lang.IllegalMonitorStateException
		//抛出的异常表明某一线程已经试图等待对象的监视器，
		//或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。
	}
}
