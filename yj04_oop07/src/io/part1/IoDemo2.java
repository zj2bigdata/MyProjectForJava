package io.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IoDemo2 {
	public static void main(String[] args) throws Exception {
		File f=new File("d:/helloworld/hello/hello.txt");
		RandomAccessFile raf=new RandomAccessFile( f,"rw");
		raf.writeUTF("la");//UTF8 中文占3字节，非中文占1字节，有两个默认字节
		//raf.writeInt(1),整数占4字节 raf.writeFloat(1.0f),单精度占4字节 raf.writeDouble(1.0),双精度占8字节
		//raf.writeBoolean(true),布尔占1字节 raf.writeChar(1),字符占2字节
		raf.writeInt(1);//4btye
		raf.writeFloat(1.0f);//4btye
		raf.writeDouble(1.0);//8byte
		raf.writeBoolean(true);//1byte
		raf.writeInt(1);//4byte
		raf.writeChar('中');//2
		raf.seek(0);
		raf.skipBytes(25);
		char m=raf.readChar();
		System.out.println(m);
		raf.close();
	
	}
}
