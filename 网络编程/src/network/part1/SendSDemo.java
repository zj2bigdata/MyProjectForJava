package network.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDPÉý¼¶°æ·¢ËÍ¶Ë
public class SendSDemo {
	public static void main(String[] args) throws IOException{
		DatagramSocket dg=new DatagramSocket();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			byte[] buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.1.102"), 10086);
			dg.send(dp);
			
		}
		
		dg.close();
	}
}
