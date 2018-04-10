package udp.aprt1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	public static void main(String[] args) throws IOException{
		//此类表示用来发送和接收数据报包的套接字
		DatagramSocket ds=new DatagramSocket();
		//创建数据包
		String phone="夏普Anuex11";
		byte[] b=phone.getBytes();
		DatagramPacket dp=new DatagramPacket(b, b.length,InetAddress.getByName("localhost"),12306);
		//发送数据包
		ds.send(dp);
		ds.close();
	}
}
