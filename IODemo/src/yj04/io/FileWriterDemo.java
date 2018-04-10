package yj04.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("d:\\hellozj.txt");
			fw.write("hello zj !!!!");
			fw.close();
			System.out.println("–¥»Î≥…π¶");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
