package tcp.part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp2ServerDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(12306);//����ʵ�ַ������׽��֡��������׽��ֵȴ�����ͨ�����紫�롣
		Socket s=ss.accept();//����ʵ�ֿͻ����׽���
		//�������Կͻ��˵���Ϣ
		BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
		byte[] b=new byte[1024];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		//��ͻ��˷�����Ӧ��Ϣ
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		bos.write("����ˣ����յ�����������Ϣ��".getBytes());
		bos.flush();
		//�ͷ���Դ
		s.close();
		ss.close();
	}
}
