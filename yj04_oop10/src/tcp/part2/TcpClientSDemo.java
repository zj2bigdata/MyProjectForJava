package tcp.part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//tcp¿Í»§¶Ë
public class TcpClientSDemo {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost",12306);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String m=br.readLine();
		while(true){
			if("886".equals(m)){
				break;
			}else{
				bw.write(m);
				bw.newLine();
				bw.flush();
				m=br.readLine();
			}
		}
		br.close();
		s.close();
	}
}
