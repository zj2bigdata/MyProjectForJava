package tcp.part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//tcpΩ” ’
public class TcpServerSDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(12306);
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String m=br.readLine();
		while(null!=m){
			bw.write(m);
			bw.newLine();
			bw.flush();
			m=br.readLine();
		}
		s.close();
		ss.close();
		
	}
}
