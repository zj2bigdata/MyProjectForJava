package network.part1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议发送数据
 * 1.创建发送端socket对象
 * 2.创建数据并打包
 * 3.调用socket对象发送数据包
 * 4.释放资源
 * 
 * */

public class SendDemo {
	public static void main(String[] args) throws IOException {
		//1.
		DatagramSocket ds=new DatagramSocket();
		//2.public DatagramPacket(byte[] buf,  int length, InetAddress address, int port)
		byte[] buf="Hello world!I am conming!!!".getBytes();
		int l=buf.length;
		InetAddress address=InetAddress.getByName("192.168.1.102");
		int port=10086;
		DatagramPacket p=new DatagramPacket(buf, l, address, port);
		//3.public void send(DatagramPacket p)
		ds.send(p);
		//4.
		ds.close();
	}
}
