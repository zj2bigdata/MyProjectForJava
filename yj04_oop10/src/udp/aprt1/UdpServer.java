package udp.aprt1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	public static void main(String[] args) throws IOException{
		//此类表示用来发送和接收数据报包的套接字
		DatagramSocket ds=new DatagramSocket(12306);
		//创建接受包
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		//利用接受包接受快递来的包裹
		ds.receive(dp);
		//拆包
		System.out.println(new String(dp.getData(),0,dp.getLength()));
		ds.close();
	}
}
