package yj04.part1;

public class ThreadDemo extends Thread {

	public ThreadDemo(String name) {
		super(name);
	}
	
	public void run(){
		for(int i = 1;i < 50;i++){
			System.out.println(this.getName() + ";" + i);
			if (i % 5 == 0) {
				Thread.yield();
			}
		}
	}
	
/*	int n = 1;
	public void run(){
//		int n = 1;
		while (true) {
			String name = this.getName();	// 获取当前线程名
			System.out.println(name + ";" + n);
			n++;
			if (n > 5) {
				break;
			}
		}
	}*/

	public static void main(String[] args) throws Exception {
		// t1,t2,t3分别表示3个线程对象
		ThreadDemo t1 = new ThreadDemo("线程1");
		ThreadDemo t2 = new ThreadDemo("线程2");
		ThreadDemo t3 = new ThreadDemo("线程3");
		// 每个线程对象只能调用一次start()方法，调用两次将出现异常
		t1.start();
		t2.start();
//		t2.join();
		t3.start();
//		t1.run();
//		t2.run();
//		t3.run();
	}
}
