package network.part1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDPЭ���������
 * 1.�������ն�socket����
 * 2.�����������վݰ�������
 * 3.�������ݰ�
 * 4.����socket����������ݰ�����ʾ
 * 5.�ͷ���Դ
 * 
 * */
public class ReciveDemo {
	public static void main(String[] args) throws IOException {
		//1.
		DatagramSocket ds =new DatagramSocket(10086);
		//2.public DatagramPacket(byte[] buf, int length)
		//���� DatagramPacket���������ճ���Ϊ length �����ݰ�
		byte[] buf=new byte[1024];
		int l=buf.length;
       DatagramPacket dp=new DatagramPacket(buf, l);
       //3.public void receive(DatagramPacket p)�Ӵ��׽��ֽ������ݱ�����
       ds.receive(dp);//����
       //4.
       //public InetAddress getInetAddress()���ش��׽������ӵĵ�ַ��
       InetAddress ia=dp.getAddress();
       String ip=ia.getHostAddress();
       //public byte[] getData()�������ݻ�����
       byte[] m=dp.getData();
       //public int getLength()���ؽ�Ҫ���ͻ���յ������ݵĳ���
       int gl =dp.getLength();
       //public String(byte[] bytes,int offset,  int length)
       //����һ���µ� String��������ʹ��ָ�����ַ��������ֽڵ�ָ��������   
       String pm=new String(m,0,gl);
       System.out.println(ip+":"+pm);
       //5.
       ds.close();
		
	}

}
