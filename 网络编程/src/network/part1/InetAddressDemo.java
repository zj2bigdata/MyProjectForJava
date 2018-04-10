package network.part1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 1.public static InetAddress getByName(String host)
 * �ڸ����������������ȷ�������� IP ��ַ��
 * 2.public String getHostName()
 * ��ȡ�� IP ��ַ���������� 
 * 3.public String getHostAddress()
 * ���� IP ��ַ�ַ��������ı�������ʽ���� 
 * */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia=InetAddress.getByName("gh9527");
		String ip=ia.getHostAddress();
		String hn=ia.getHostName();
		System.out.println(hn+"--"+ip);
	}
}
