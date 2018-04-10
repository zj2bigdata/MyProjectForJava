package tcpNetwork.part4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//����˽��ܿͻ����ϴ����Ǳ鲢���浽�����E��
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
		bw.write("�ļ��ϴ��ɹ���");
		bw.flush();
		os.close();
		s.close();
		ss.close();
	}
}
