package yj04.part1;

/*Runnable�����ƣ�
 * �ʺ϶����ͬ�ĳ��������߳�ȥ����ͬһ����Դ
 * ���Ա���Java�е��̳е�����
 * 
 */

public class Runnablelmpl implements Runnable {
	
	int n = 1;
	public void run() {
	//	int n = 1;
		while (true) {
			
			Thread t = Thread.currentThread();		// ��ǰ�߳���
			String name = t.getName();	// ��ȡ��ǰ�߳���
			System.out.println(name + ";" + n);
			n++;
			if (n > 5) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Runnablelmpl thread = new Runnablelmpl();
		Thread t1 = new Thread(thread,"�߳�1");
		Thread t2 = new Thread(thread,"�߳�2");
		Thread t3 = new Thread(thread,"�߳�3");
		// ֻ�����run()����
		t1.start();
		t2.start();
		t3.start();
	}
}
