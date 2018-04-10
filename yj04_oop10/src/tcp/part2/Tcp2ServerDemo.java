package tcp.part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp2ServerDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(12306);//此类实现服务器套接字。服务器套接字等待请求通过网络传入。
		Socket s=ss.accept();//此类实现客户端套接字
		//接受来自客户端的消息
		BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
		byte[] b=new byte[1024];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		//向客户端发送响应消息
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		bos.write("服务端：我收到了你来的消息！".getBytes());
		bos.flush();
		//释放资源
		s.close();
		ss.close();
	}
}
