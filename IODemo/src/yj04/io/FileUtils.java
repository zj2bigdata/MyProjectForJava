package yj04.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	
	//1.拷贝文件
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
	public static void copyFile(File src,File dec) throws IOException{
		if(!src.isFile()){
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		
		if(dec.isDirectory()){
			System.out.println("已经存在");
			throw new IOException("已经存在");
		}
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
	
	//文件夹拷贝
	public static void copyDirectory(String srcPath,String decPath) throws IOException{
		File fs=new File(srcPath);
		File fd=new File(decPath);
		if(fs.isDirectory()){ //源文件是文件夹
			fd=new File(decPath,fs.getName());
		}
		copying(fs,fd);
	}
	public static void copyDirectory(File fs,File fd) throws IOException{
		if(fs.isDirectory()){ //源文件是文件夹
			fd=new File(fd,fs.getName());
		}
		copying(fs,fd);
	}
	public static void copying(File fs,File fd) throws IOException{
		if(fs.isFile()){
			FileUtils.copyFile(fs, fd);
		}else if(fs.isDirectory()){
			fd.mkdirs(); //确保目标文件存在
			for(File f:fs.listFiles()){
				copying(f,new File(fd,f.getName()));
			}
		}
	}
}
