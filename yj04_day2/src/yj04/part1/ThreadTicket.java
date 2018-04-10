package yj04.part1;

public class ThreadTicket implements Runnable {
	
	private int num = 100;	// ������Դ
	public void run() {
		while (true) {
			String threadName = Thread.currentThread().getName();
			// ͬ�������
			synchronized (this) {
				if (num > 0) {
					num --;
					System.out.println(threadName + "�۳�1�ţ���Ʊ" + num + "��");
				}else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadTicket tt = new ThreadTicket();
		Thread t1 = new Thread(tt,"����1");
		Thread t2 = new Thread(tt,"����2");
		Thread t3 = new Thread(tt,"����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
