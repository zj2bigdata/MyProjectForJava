package udp.aprt1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	public static void main(String[] args) throws IOException{
		//�����ʾ�������ͺͽ������ݱ������׽���
		DatagramSocket ds=new DatagramSocket();
		//�������ݰ�
		String phone="����Anuex11";
		byte[] b=phone.getBytes();
		DatagramPacket dp=new DatagramPacket(b, b.length,InetAddress.getByName("localhost"),12306);
		//�������ݰ�
		ds.send(dp);
		ds.close();
	}
}
