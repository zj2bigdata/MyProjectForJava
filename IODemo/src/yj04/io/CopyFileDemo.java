package yj04.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//¿½±´ÎÄ¼þÊµÀý
public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		copyFile("f:/360wallpaper.jpg","f:/centos");
		
	}
	
	public static void copyFile(String srcPath,String decPath) throws IOException{
			File src=new File(srcPath);
			File dec=new File(decPath,src.getName());
			InputStream is=null;
			OutputStream os=null;
			try {
				is = new FileInputStream(src);
				os=new FileOutputStream(dec);
				byte[] car=new byte[1024];
				int l=-1;
				while(-1 != (l=is.read(car))){
					os.write(car,0,l);
				}
				os.flush();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				os.close();
				is.close();
			}
	}
}
