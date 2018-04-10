package io.part1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputSteamDemo {
	public static void main(String[] args) {
		File src=new File("d:/hello.txt");
		File dec=new File("e:/hello.txt");
		copyBufferFile(src,dec);
	}
	
	static void copyBufferFile(File src,File dec){
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		byte[] b=new byte[10];
		try {
			bis=new BufferedInputStream(new FileInputStream(src));
			bos=new BufferedOutputStream(new FileOutputStream(dec));
			int l=bis.read(b);
			while(-1!=l){
				bos.write(b);
				l=bis.read(b);
			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
					if(null!=bis&&null!=bos){
						bos.close();
						bis.close();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
		}
		
	}
}

