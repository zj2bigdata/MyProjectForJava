package yj04.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 1.建立关系
 * 2.确定流
 * 3.选择容器
 * 4.打包送出
 * */
public class OutputStreamDemo {
	public static void main(String[] args) {
		File fs=new File("f:/zj.txt");
		OutputStream fos=null;
		try {
			 fos=new FileOutputStream(fs,true);
			String str="我是大数据分析师!";
			byte[] data=str.getBytes();
			fos.write(data);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件未找到！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据写入失败！");
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭输出流失败！");
			}
		}
	}
}
