package tcp.part2;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {
	public static void main(String[] args) throws IOException{
		InetAddress ia=InetAddress.getByName("192.168.1.188");
		System.out.println(ia.getHostName());
	}
}
