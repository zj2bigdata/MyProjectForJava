package ThreadNetwork.part2;

import java.io.IOException;
import java.net.DatagramSocket;
public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		DatagramSocket ds1=new DatagramSocket(10086);
		SendThread st=new SendThread(ds);
		ReciveThread rt=new ReciveThread(ds1);
		Thread ts=new Thread(st);
		Thread tr=new Thread(rt);
		ts.start();
		tr.start();
	}
}
