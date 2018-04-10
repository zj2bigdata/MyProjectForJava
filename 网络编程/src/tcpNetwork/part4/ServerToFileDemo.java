package tcpNetwork.part4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务端接受客户端上传的吻遍并保存到服务端E盘
public class ServerToFileDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(10086);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		OutputStream os=new FileOutputStream("d:/hello.jpg");
		byte[] b=new byte[1024];
		int l=0;
		while((l=is.read(b))!=-1){
			os.write(b,0,l);
			os.flush();
		}
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("文件上传成功！");
		bw.flush();
		os.close();
		s.close();
		ss.close();
	}
}
