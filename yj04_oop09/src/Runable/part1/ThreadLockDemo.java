package Runable.part1;

/*
 * 死锁条件:1.至少两个线程，2.至少两个对象，3.使用同步锁，3.两个线程相互持有对方正在等在的对象
 * 
 * 如线1锁住了对1，线2锁住了对2，而线1追呗锁住对2，线2准备锁住对1，
 * 两个相互锁不住对方的对象，会发生死锁
 * */
public class ThreadLockDemo implements Runnable{
	private Object o=new Object();
	private Object j=new Object();
	private boolean f=true;
	public void run(){
		if(f){
			f=false;
			synchronized(o){
				System.out.println("一手交钱一手交货");
				try {								//给其他线程执行机会，一定会发生死锁
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(j){
					System.out.println("拿钱");
				}
			}
		}else{
			synchronized(j){
				System.out.println("一手交货一手交钱");
				synchronized(o){
					System.out.println("拿到可乐");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadLockDemo tld=new ThreadLockDemo();
		Thread t1=new Thread(tld);
		Thread t2=new Thread(tld);
		t1.start();
		t2.start();
	}
}
