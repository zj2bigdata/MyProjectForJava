package tcp.part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Tcp2ClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket(InetAddress.getByName("192.168.1.188"),12306);//����ʵ�ֿͻ����׽���
		//��ͻ��˷���һ�����к�����Ϣ
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		String m=s.getInetAddress().getHostAddress()+":��ã������!";
		bos.write(m.getBytes());
		bos.flush();//�����һ��Ҫflush��������������������
		//�������Կͻ��˵ķ���
		BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
		byte[] b=new byte[1024];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		//�ͷſͻ��˵���Դ
		s.close();
	}
}
