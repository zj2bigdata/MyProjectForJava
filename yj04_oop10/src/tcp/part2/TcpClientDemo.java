package tcp.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("127.0.0.1",9999);
		//���ܷ���˷���������Ϣ
		BufferedReader br=new BufferedReader( new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("������:"+msg);
		//�����˷�����Ϣpublic PrintWriter(OutputStream out,boolean autoFlush)
		//ͨ�����е� OutputStream �����µ� PrintWriter���˱�ݹ��췽��������Ҫ���м� OutputStreamWriter������ʹ��Ĭ���ַ����뽫�ַ�ת��Ϊ�ֽڡ� 
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		//public void println(String x)��ӡ String��Ȼ����ֹ���С��˷�������Ϊ�����ȵ��� print(String) Ȼ����� println() һ����
		pw.println("����Ԥ����Ʊ");
		s.close();
	}
}
