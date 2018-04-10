package yj04.part1;

public class ThreadTicket implements Runnable {
	
	private int num = 100;	// 共享资源
	public void run() {
		while (true) {
			String threadName = Thread.currentThread().getName();
			// 同步代码块
			synchronized (this) {
				if (num > 0) {
					num --;
					System.out.println(threadName + "售出1张，余票" + num + "张");
				}else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadTicket tt = new ThreadTicket();
		Thread t1 = new Thread(tt,"窗口1");
		Thread t2 = new Thread(tt,"窗口2");
		Thread t3 = new Thread(tt,"窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
