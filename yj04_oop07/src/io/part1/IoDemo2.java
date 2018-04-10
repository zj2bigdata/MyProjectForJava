package io.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IoDemo2 {
	public static void main(String[] args) throws Exception {
		File f=new File("d:/helloworld/hello/hello.txt");
		RandomAccessFile raf=new RandomAccessFile( f,"rw");
		raf.writeUTF("la");//UTF8 ����ռ3�ֽڣ�������ռ1�ֽڣ�������Ĭ���ֽ�
		//raf.writeInt(1),����ռ4�ֽ� raf.writeFloat(1.0f),������ռ4�ֽ� raf.writeDouble(1.0),˫����ռ8�ֽ�
		//raf.writeBoolean(true),����ռ1�ֽ� raf.writeChar(1),�ַ�ռ2�ֽ�
		raf.writeInt(1);//4btye
		raf.writeFloat(1.0f);//4btye
		raf.writeDouble(1.0);//8byte
		raf.writeBoolean(true);//1byte
		raf.writeInt(1);//4byte
		raf.writeChar('��');//2
		raf.seek(0);
		raf.skipBytes(25);
		char m=raf.readChar();
		System.out.println(m);
		raf.close();
	
	}
}
