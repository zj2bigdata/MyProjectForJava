package chatroom.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//客户端接收消息线程
public class ChatRecive extends Thread{
	private Socket s;
	public ChatRecive(Socket s){
		this.s=s;
	}
	public void run(){
		BufferedReader br=null;
		try{
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			while(true){
				String m=br.readLine();
				System.out.println(m);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
					br.close();
				}
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
