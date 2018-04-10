package Thread.part2;

public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 td1=new ThreadDemo2("¼×");
		ThreadDemo2 td2=new ThreadDemo2("ÒÒ");
		ThreadDemo2 td3=new ThreadDemo2("±û");
		System.out.println(td1.getPriority()+"--"+td2.getPriority()+"--"+td3.getPriority());
		td1.start();
		try {
			td1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		td2.start();
		td3.start();
	}
}
