package ThreadNetwork.part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	private DatagramSocket ds;
	public  SendThread(DatagramSocket ds){
		this.ds=ds;
	}
	@Override
	public void run() {
		DatagramSocket dg=null;
		try{
			dg=new DatagramSocket();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=br.readLine())!=null){
				if("886".equals(line)){
					break;
				}
				byte[] buf=line.getBytes();
				DatagramPacket dp=new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.1.188"), 10086);
				dg.send(dp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dg.close();
		}

	}
}
