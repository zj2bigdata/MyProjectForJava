package Runable.part1;

/*
 * ��������:1.���������̣߳�2.������������3.ʹ��ͬ������3.�����߳��໥���жԷ����ڵ��ڵĶ���
 * 
 * ����1��ס�˶�1����2��ס�˶�2������1׷����ס��2����2׼����ס��1��
 * �����໥����ס�Է��Ķ��󣬻ᷢ������
 * */
public class ThreadLockDemo implements Runnable{
	private Object o=new Object();
	private Object j=new Object();
	private boolean f=true;
	public void run(){
		if(f){
			f=false;
			synchronized(o){
				System.out.println("һ�ֽ�Ǯһ�ֽ���");
				try {								//�������߳�ִ�л��ᣬһ���ᷢ������
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(j){
					System.out.println("��Ǯ");
				}
			}
		}else{
			synchronized(j){
				System.out.println("һ�ֽ���һ�ֽ�Ǯ");
				synchronized(o){
					System.out.println("�õ�����");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadLockDemo tld=new ThreadLockDemo();
		Thread t1=new Thread(tld);
		Thread t2=new Thread(tld);
		t1.start();
		t2.start();
	}
}
