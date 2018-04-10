package yj04.io;

import java.io.File;
import java.io.IOException;

//¿½±´ÎÄ¼þ¼ÐÊµÀý
public class CopyDeritoryDemo {
	public static void main(String[] args){
		String srcPath="f:/copyd";
		String decPath="f:/centos";
		File fs=new File(srcPath);
		File fd=new File(decPath);
		
		try {
			FileUtils.copyDirectory(fs, fd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
