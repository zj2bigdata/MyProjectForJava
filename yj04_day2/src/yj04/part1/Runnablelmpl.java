package yj04.part1;

/*Runnable的优势：
 * 适合多个相同的程序代码的线程去处理同一个资源
 * 可以避免Java中单继承的限制
 * 
 */

public class Runnablelmpl implements Runnable {
	
	int n = 1;
	public void run() {
	//	int n = 1;
		while (true) {
			
			Thread t = Thread.currentThread();		// 当前线程名
			String name = t.getName();	// 获取当前线程名
			System.out.println(name + ";" + n);
			n++;
			if (n > 5) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Runnablelmpl thread = new Runnablelmpl();
		Thread t1 = new Thread(thread,"线程1");
		Thread t2 = new Thread(thread,"线程2");
		Thread t3 = new Thread(thread,"线程3");
		// 只会调用run()方法
		t1.start();
		t2.start();
		t3.start();
	}
}
