package chatroom.part3;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//服务端
public class ChatServer extends Thread{
	private Socket s;
	private List<Socket> listSocket;
	private List<String> nameList;
	private static int index=-1;
	public ChatServer(Socket s,List<Socket> listSocket,List<String> nameList){
		this.s=s;
		this.listSocket=listSocket;
		this.nameList=nameList;
	}
	public void run(){
		PrintWriter pw=null;
		FileReader fr=new FileReader(FileDescriptor.in);
		BufferedReader br=new BufferedReader(fr);
		try{
			OutputStream os=s.getOutputStream();
			pw=new PrintWriter(os,true);
			pw.println("服务器连接成功!！");
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			String m=br.readLine();
			while(m!=null){
					if(listSocket.size()>1){
							for(Socket si:listSocket){
								if(si!=s){
									OutputStream oo=si.getOutputStream();
									PrintWriter psi=new PrintWriter(oo,true);
									psi.println(m);
								}
							}
					}
					System.out.println(m);
					m=br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(12306);
		List<Socket> l=new ArrayList<Socket>();
		List<String> n=new ArrayList<String>();
		while(true){
			Socket s=ss.accept();
			l.add(s);
			ChatServer cs=new ChatServer(s,l,n);
			cs.start();
		}
	}
}
