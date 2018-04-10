package tcpNetwork.part4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//客户端上传文件
public class ClientToFileDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost",10086);
		InputStream is=new FileInputStream("e:/hello.jpg");
		OutputStream os=s.getOutputStream();
		byte[] b=new byte[1024];
		int l=0;
		while((l=is.read(b))!=-1){
			os.write(b, 0, l);
			os.flush();
		}
//		s.shutdownOutput();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String m=br.readLine();
		System.out.println(m);
		is.close();
		s.close();
	}
}
