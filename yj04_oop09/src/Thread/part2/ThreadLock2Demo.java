package Thread.part2;
//������ʽ2
public class ThreadLock2Demo implements Runnable{
	private Object car1=new Object();
	private Object car2=new Object();
	private boolean f=true;
	public void run(){
		if(f){
			f=false;
			synchronized(car1){
				System.out.println("1");
				synchronized(car2){
					System.out.println("2");
				}
			}
		}else{
			synchronized(car2){
				System.out.println("2");
				try {
					Thread.sleep(10000);//��t2��סcar2һ��ʱ�䣬����t1��סcar1���޷�ȥ��car2
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadLock2Demo tl1=new ThreadLock2Demo();
		Thread t1=new Thread(tl1);
		Thread t2=new Thread(tl1);
		t1.start();
		t2.start();
		//tl1.notify();//java.lang.IllegalMonitorStateException
		//�׳����쳣����ĳһ�߳��Ѿ���ͼ�ȴ�����ļ�������
		//������ͼ֪ͨ�������ڵȴ�����ļ�����������û��ָ�����������̡߳�
	}
}
