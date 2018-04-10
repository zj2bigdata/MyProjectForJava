package tcpNetwork.part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

//从客户端上传文本文件
public class ClientOutFileDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.1.103",10086);
		BufferedReader br=new BufferedReader(new FileReader("d:/hello.txt"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String m=null;
		while((m=br.readLine())!=null){
			bw.write(m);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
		
	}
}
