package yj04.part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BreakCopy {
	
	static void copyFile(File src,File file){
		InputStream in = null;
		OutputStream out = null;
		byte[] b = new byte[100];
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(file,true);
			
			long size = file.exists() ? file.length() : 0;
			
			in.skip(size);		// Ìø¹ý£¨×Ö½Ú£©
			int len = in.read();
			while (len != -1) {
				System.out.println(new String(b,0,len));
				out.write(b,0,len);
				len = in.read(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
		File dest = new File("C:\\Users\\Administrator\\Desktop\\2.txt");
		
		copyFile(src,dest);
	}
}
