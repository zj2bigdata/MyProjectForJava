package Thread.part2;

public class ThreadSleppDemo extends Thread{
	public void run(){
		int i=1;
		while(true){
			
//			try {
//				Thread.sleep(3000);//�ý������ߣ�ʱ�䵽������������ȴ���һ�ε�ִ��
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(i);
			i++;
			if(i>5){
				break;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo1 t1=new ThreadDemo1("�߳�1");
		ThreadDemo1 t2=new ThreadDemo1("�߳�2");
		ThreadDemo1 t3=new ThreadDemo1("�߳�3");
		t1.start();
		t2.start();
		t2.join();
		t3.start();
		
	}
}
