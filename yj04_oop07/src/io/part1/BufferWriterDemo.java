package io.part1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BufferWriterDemo {
	public static void main(String[] args){
		BufferedWriter bw=null;
		try {
			Writer out=new FileWriter(new File("d:/helloworld/hello/hello.txt"));
			bw=new BufferedWriter(out);
			bw.write("hello world");
			bw.newLine();
			bw.write("hello world");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
