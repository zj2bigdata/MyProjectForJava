package tcpNetwork.part3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//tcp服务端
public class ServerDemo {
	public static void main(String[] args) throws IOException{
		//public ServerSocket(int port)创建绑定到特定端口的服务器套接字。
		ServerSocket ser=new ServerSocket(10086);
		//public Socket accept()侦听并接受到此套接字的连接。此方法在进行连接之前一直阻塞。
		Socket s=ser.accept();
		//public InputStream getInputStream()返回此套接字的输入流。
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int l=is.read(b);
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+new String(b,0,l));
		OutputStream os=s.getOutputStream();
		os.write("Server:我收到了你的请求！".getBytes());
		s.close();
	}
}
