package udp.aprt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSClient {
	public static void main(String[] args) throws IOException{
		DatagramSocket ds=new DatagramSocket();
		InetAddress ip=InetAddress.getByName("localhost");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String in=br.readLine();
		while(!("886".equals(in))){
			byte[] buf=(ip.getHostAddress()+":"+in).getBytes();
			DatagramPacket dp=new DatagramPacket(buf, buf.length, ip,12306);
			ds.send(dp);
			in=br.readLine();
		}
		ds.close();
	}
}
