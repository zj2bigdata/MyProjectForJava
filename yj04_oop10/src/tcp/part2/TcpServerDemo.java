package tcp.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) throws IOException{
		//��������˽���12306ƽ̨
		ServerSocket ss=new ServerSocket(9999);
		//�����Ϻ�ָ�ɿ��пͷ�����ר�ߴ���,����������
		Socket s=ss.accept();
		//��ͻ��˷�����Ϣ
		PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
		pw.println("���ã�����9527�ſͷ���������Ҫʲô����");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("�ͻ���:"+msg);
		s.close();
		ss.close();
	}
}
