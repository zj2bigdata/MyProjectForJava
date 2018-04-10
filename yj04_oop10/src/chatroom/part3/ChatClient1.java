package chatroom.part3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//¿Í»§¶Ë1
public class ChatClient1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",12306);
		ChatSend cs=new ChatSend(s,"Client1");
		ChatRecive cr=new ChatRecive(s);
		cs.start();
		cr.start();
	}
}
