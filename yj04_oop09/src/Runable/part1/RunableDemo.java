package Runable.part1;

public class RunableDemo implements Runnable{
	int n=1;
	public  void run(){
		/*同步块
		 * synchronized(this){
		 * 		while(true){
		 * 			system.out.println(n);
		 * 			if(n>101){break;}
		 * 			else{n++}
		 * 		}
		 * }
		 * */
		for(int i=1;i<=100;i++){
			this.saleP();
		}
	}
	
	public synchronized void saleP(){  //同步方法
		if(n<101){
			System.out.println(Thread.currentThread().getName()+"抢到了第"+n+"张票！");
			n++;
		}
	}
	
	public static void main(String[] args) {
		RunableDemo r=new RunableDemo();
		Thread t1=new Thread(r,"线程1");
		Thread t2=new Thread(r,"线程2");
		Thread t3=new Thread(r,"线程3");
		t1.start();
		t2.start();
		t3.start();
	}
}
