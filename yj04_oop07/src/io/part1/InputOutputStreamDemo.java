package io.part1;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamDemo {
	public static void main(String[] args){
//		File fs=new File("d:/hello.txt");
//		File fs1=new File("d:/hello1.txt");
//		writeFile(fs);
//		readFile(fs1);
		File src=new File("d:/hello.jpg");
		File dec=new File("e:/hello.jpg");
		copyFile(src,dec);
	}
	//从控制台读取数据写到文件
	static void writeFile(File tf){
		//设置输入流与控制台的连接
		InputStream ips=new FileInputStream(FileDescriptor.in);
		OutputStream ops=null;
		try {
			ops=new FileOutputStream(tf);
			byte[] b=new byte[2];
			int l=ips.read(b);//读取一个字节
			while((char)l !='E'){
				ops.write(b);
				ips.read(b);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null != ips && null != ops){
					ips.close();
					ops.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//从文件读取内容输出到控制台
	static void readFile(File tf){
		InputStream ips=null;
		OutputStream ops=null;
		try {
			ips=new FileInputStream(tf);
			ops=new FileOutputStream(FileDescriptor.out);
			int l=ips.read();
			while(-1 !=l){
				ops.write(l);
				l=ips.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ops.close();
				ips.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//拷贝文件
	static void copyFile(File srcf,File decf){
		InputStream ips=null;
		OutputStream ops=null;
		byte[] b=new byte[5];
		try{
			ips=new FileInputStream(srcf);//源文件
			ops=new FileOutputStream(decf);//目标文件
			int l=ips.read(b);
			while(-1 != l){
				ops.write(b, 0, l);//write（读取哪里的数据，从哪个位置开始读，读取多少个字节）
				l=ips.read(b);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
				try {
					if(ips !=null && ops !=null){
						ops.close();
						ips.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
