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
			String name = this.getName();	// ��ȡ��ǰ�߳���
			System.out.println(name + ";" + n);
			n++;
			if (n > 5) {
				break;
			}
		}
	}*/

	public static void main(String[] args) throws Exception {
		// t1,t2,t3�ֱ��ʾ3���̶߳���
		ThreadDemo t1 = new ThreadDemo("�߳�1");
		ThreadDemo t2 = new ThreadDemo("�߳�2");
		ThreadDemo t3 = new ThreadDemo("�߳�3");
		// ÿ���̶߳���ֻ�ܵ���һ��start()�������������ν������쳣
		t1.start();
		t2.start();
//		t2.join();
		t3.start();
//		t1.run();
//		t2.run();
//		t3.run();
	}
}
