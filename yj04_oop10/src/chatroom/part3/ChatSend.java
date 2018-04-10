package chatroom.part3;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//客户端发送消息线程
public class ChatSend extends Thread{
	private Socket s;
	private String name=null;
	public ChatSend(Socket s,String name){
		this.s=s;
		this.name=name;
	}
	public void run(){
		PrintWriter pw=null;
		FileReader fr=new FileReader(FileDescriptor.in);
		BufferedReader br=new BufferedReader(fr);
		try{
			OutputStream os=s.getOutputStream();
			pw=new PrintWriter(os,true);
			pw.println(name+"上线了！");
			String p=br.readLine();
			while(true){
				if("886".equals(p)){
					pw.println(name+"下线了！");
					break;
				}
				pw.println(name+":"+p);
				p=br.readLine();
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
				e.printStackTrace();
			}
		}
	}
}
