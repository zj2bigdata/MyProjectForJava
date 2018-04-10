package tcpNetwork.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端输出从客户端上传的文件
public class ServerInFileDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String m=null;
		while((m=br.readLine())!=null){
			System.out.println(m);
		}
		s.close();
	}
}
