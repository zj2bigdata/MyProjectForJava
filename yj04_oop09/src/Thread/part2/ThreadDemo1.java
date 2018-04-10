package Thread.part2;

public class ThreadDemo1 extends Thread{
	public ThreadDemo1(String name){super(name);}
	public void run(){
		for(int i=0;i<10;i++){
			if(i%3==0){
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		ThreadDemo1 t1=new ThreadDemo1("线程1");
		ThreadDemo1 t2=new ThreadDemo1("线程2");
		ThreadDemo1 t3=new ThreadDemo1("线程3");
		t1.start();
		t2.start();
		t3.start();
	}
}
