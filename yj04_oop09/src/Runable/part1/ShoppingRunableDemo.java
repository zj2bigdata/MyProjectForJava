package Runable.part1;

public class ShoppingRunableDemo implements Runnable{
	 private static int count;

	   public ShoppingRunableDemo() {
	      count = 0;
	   }

	   public  void run() {
	      synchronized(this) {
	         for (int i = 0; i < 5; i++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }

	   public int getCount() {
	      return count;
	   }
	
	public static void main(String[] args) {
		ShoppingRunableDemo rd=new ShoppingRunableDemo();
		Thread thread1 = new Thread(rd, "SyncThread1");
		Thread thread2 = new Thread(rd, "SyncThread2");
		thread1.start();
		thread2.start();
	}
	
}
