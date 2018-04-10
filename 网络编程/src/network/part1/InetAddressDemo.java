package network.part1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 1.public static InetAddress getByName(String host)
 * 在给定主机名的情况下确定主机的 IP 地址。
 * 2.public String getHostName()
 * 获取此 IP 地址的主机名。 
 * 3.public String getHostAddress()
 * 返回 IP 地址字符串（以文本表现形式）。 
 * */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia=InetAddress.getByName("gh9527");
		String ip=ia.getHostAddress();
		String hn=ia.getHostName();
		System.out.println(hn+"--"+ip);
	}
}
