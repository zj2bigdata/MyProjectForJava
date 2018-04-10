package network.part1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议接收数据
 * 1.创建接收端socket对象
 * 2.创建用来接收据包的容器
 * 3.接收数据包
 * 4.调用socket对象解析数据包并显示
 * 5.释放资源
 * 
 * */
public class ReciveDemo {
	public static void main(String[] args) throws IOException {
		//1.
		DatagramSocket ds =new DatagramSocket(10086);
		//2.public DatagramPacket(byte[] buf, int length)
		//构造 DatagramPacket，用来接收长度为 length 的数据包
		byte[] buf=new byte[1024];
		int l=buf.length;
       DatagramPacket dp=new DatagramPacket(buf, l);
       //3.public void receive(DatagramPacket p)从此套接字接收数据报包。
       ds.receive(dp);//阻塞
       //4.
       //public InetAddress getInetAddress()返回此套接字连接的地址。
       InetAddress ia=dp.getAddress();
       String ip=ia.getHostAddress();
       //public byte[] getData()返回数据缓冲区
       byte[] m=dp.getData();
       //public int getLength()返回将要发送或接收到的数据的长度
       int gl =dp.getLength();
       //public String(byte[] bytes,int offset,  int length)
       //构造一个新的 String，方法是使用指定的字符集解码字节的指定子数组   
       String pm=new String(m,0,gl);
       System.out.println(ip+":"+pm);
       //5.
       ds.close();
		
	}

}
