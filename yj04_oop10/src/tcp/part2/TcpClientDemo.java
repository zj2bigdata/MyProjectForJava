package tcp.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("127.0.0.1",9999);
		//接受服务端发送来的消息
		BufferedReader br=new BufferedReader( new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("服务器:"+msg);
		//向服务端发送消息public PrintWriter(OutputStream out,boolean autoFlush)
		//通过现有的 OutputStream 创建新的 PrintWriter。此便捷构造方法创建必要的中间 OutputStreamWriter，后者使用默认字符编码将字符转换为字节。 
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		//public void println(String x)打印 String，然后终止该行。此方法的行为就像先调用 print(String) 然后调用 println() 一样。
		pw.println("我想预定车票");
		s.close();
	}
}
