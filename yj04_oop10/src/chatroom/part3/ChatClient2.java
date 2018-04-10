package chatroom.part3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//¿Í»§¶Ë2
public class ChatClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",12306);
		ChatSend cs=new ChatSend(s,"Client2");
		ChatRecive cr=new ChatRecive(s);
		cs.start();
		cr.start();
	}
}
