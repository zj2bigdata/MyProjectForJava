package chatroom.part3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",12306);
		ChatSend cs=new ChatSend(s,"Client3");
		ChatRecive cr=new ChatRecive(s);
		cs.start();
		cr.start();
	}
}
