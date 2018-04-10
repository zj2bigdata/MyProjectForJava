package Runable.part1;

public class SellTicketDemo implements Runnable{
	int num=100;
	private Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			synchronized (obj) {
				if(num>0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"�����˵�"+(num--)+"��Ʊ��");
				}else{
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SellTicketDemo sd=new SellTicketDemo();
		Thread t1=new Thread(sd);
		Thread t2=new Thread(sd);
		Thread t3=new Thread(sd);
		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
