package tcpNetwork.part3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//tcp�����
public class ServerDemo {
	public static void main(String[] args) throws IOException{
		//public ServerSocket(int port)�����󶨵��ض��˿ڵķ������׽��֡�
		ServerSocket ser=new ServerSocket(10086);
		//public Socket accept()���������ܵ����׽��ֵ����ӡ��˷����ڽ�������֮ǰһֱ������
		Socket s=ser.accept();
		//public InputStream getInputStream()���ش��׽��ֵ���������
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int l=is.read(b);
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+new String(b,0,l));
		OutputStream os=s.getOutputStream();
		os.write("Server:���յ����������".getBytes());
		s.close();
	}
}
