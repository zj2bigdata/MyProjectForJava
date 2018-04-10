package tcp.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) throws IOException{
		//创建服务端接受12306平台
		ServerSocket ss=new ServerSocket(9999);
		//连接上后指派空闲客服进行专线处理,具有阻塞性
		Socket s=ss.accept();
		//向客户端发送消息
		PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
		pw.println("您好，我是9527号客服，请问需要什么服务？");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("客户端:"+msg);
		s.close();
		ss.close();
	}
}
