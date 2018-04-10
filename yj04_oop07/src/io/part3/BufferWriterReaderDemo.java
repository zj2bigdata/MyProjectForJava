package io.part3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//字符流
public class BufferWriterReaderDemo {
	public static void main(String[] args) {
//		File fs=new File("d:/hello2.txt");
//		writerBuffer(fs);
//		File fs1=new File("d:/hello2.txt");
//		readBuffer(fs1);
		File src=new File("d:/hello2.txt");
		File dec=new File("d:/hello3.txt");
		copyFile(src,dec);
	}
	//从控制台读取数据写人文件
	static void writerBuffer(File f){
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			Writer fw=new FileWriter(f);
			Reader fr=new FileReader(FileDescriptor.in);
			bw=new BufferedWriter(fw);
			br=new BufferedReader(fr);
			String m=br.readLine();
			while(!"exit".equals(m)){
				bw.write(m);
				bw.newLine();
				m=br.readLine();
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
			if(bw!=null&br!=null){
				bw.close();
				br.close();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
	
	//从文件读取数据输出到控制台
	static void readBuffer(File f){
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			Writer fw=new FileWriter(FileDescriptor.out);
			Reader fr=new FileReader(f);
			bw=new BufferedWriter(fw);
			br=new BufferedReader(fr);
			String m=br.readLine();
			while(m!=null){
				bw.write(m);
				bw.newLine();
				m=br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
			if(bw!=null&br!=null){
				bw.close();
				br.close();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
	
	//复制文件
	static void copyFile(File src,File dec){
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			Reader r=new FileReader(src);
			Writer w=new FileWriter(dec);
			br=new BufferedReader(r);
			bw=new BufferedWriter(w);
			String m=br.readLine();
			while(null!=m){
				bw.write(m);
				bw.newLine();
				m=br.readLine();
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
			if(bw!=null&br!=null){
				bw.close();
				br.close();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
}
