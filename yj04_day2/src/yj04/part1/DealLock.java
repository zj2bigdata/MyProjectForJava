package yj04.part1;

public class DealLock implements Runnable {
		private Object money = new Object();
		private Object cola = new Object();
		private boolean flag = true;
		
		public void run() {
			if (flag) {
				flag = false;
				synchronized (cola) {
						System.out.println("先付钱");
						try {
							
							Thread.sleep(5000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						synchronized (money) {
							System.out.println("顾客付钱");
						}
				}
			}else {
				synchronized (money) {
						System.out.println("先给可乐");
						try {
							
							Thread.sleep(5000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						synchronized (cola) {
								System.out.println("销售给可乐");
						}
				}
			}
		}
		public static void main(String[] args) {
				DealLock lock = new DealLock();
				Thread t1 = new Thread(lock);
				Thread t2 = new Thread(lock);
				t1.start();
				t2.start();
		}
}
