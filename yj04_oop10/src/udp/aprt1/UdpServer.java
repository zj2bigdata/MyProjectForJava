package udp.aprt1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	public static void main(String[] args) throws IOException{
		//�����ʾ�������ͺͽ������ݱ������׽���
		DatagramSocket ds=new DatagramSocket(12306);
		//�������ܰ�
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		//���ý��ܰ����ܿ�����İ���
		ds.receive(dp);
		//���
		System.out.println(new String(dp.getData(),0,dp.getLength()));
		ds.close();
	}
}
