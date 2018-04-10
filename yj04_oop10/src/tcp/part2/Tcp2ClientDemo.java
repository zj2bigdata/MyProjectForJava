package tcp.part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Tcp2ClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket(InetAddress.getByName("192.168.1.188"),12306);//此类实现客户端套接字
		//向客户端发送一条打招呼的消息
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		String m=s.getInetAddress().getHostAddress()+":你好，服务端!";
		bos.write(m.getBytes());
		bos.flush();//输出流一定要flush，否则可能造成两端阻塞
		//接受来自客户端的反馈
		BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
		byte[] b=new byte[1024];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		//释放客户端的资源
		s.close();
	}
}
