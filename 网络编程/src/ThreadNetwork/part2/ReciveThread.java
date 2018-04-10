package ThreadNetwork.part2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReciveThread implements Runnable {
	private DatagramSocket ds;
	public  ReciveThread(DatagramSocket ds){
		this.ds=ds;
	}

	@Override
	public void run() {
		try{
			while(true){
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String ip=dp.getAddress().getHostName();
				byte[] m=dp.getData();
				System.out.println(ip+":"+new String(m,0,dp.getLength()));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
