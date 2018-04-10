package tcpNetwork.part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost",10086);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String m=br.readLine();
		while(m!=null){
			if("886".equals(m)){
				break;
			}
			bw.write(m);
			bw.newLine();
			bw.flush();
			m=br.readLine();
		}
		br.close();
		s.close();
	}
}
