package tcpNetwork.part3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//tcp客户端
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket(InetAddress.getByName("localhost"),10086);
		OutputStream os=s.getOutputStream();
		os.write("Client:你好啊，世界！！！".getBytes());
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int l=is.read(b);
		System.out.println(new String(b,0,l));
		s.close();
	}
}
