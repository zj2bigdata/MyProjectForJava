package network.part1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//…˝º∂∞ÊUDPΩ” ’∂À
public class ReviceSDemo {
	public static void main(String[] args) throws IOException{
		DatagramSocket dg=new DatagramSocket(10086);
		while(true){
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			dg.receive(dp);
			String ip=dp.getAddress().getHostAddress();
			byte[] m=dp.getData();
			System.out.println(ip+":"+new String(m,0,dp.getLength()));
		}
	}
}
