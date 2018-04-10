package io.part1;

import java.io.File;
import java.io.IOException;

public class IoDemo1 {
	public static void main(String[] args) throws IOException {
		File fs1=new File("d:/helloworld");
		find(fs1,"  ");
//		String[] strfs=fs1.list();//获取当前目录下所有目录名和昵称
//		for(String str :strfs){
//			System.out.println(str);
//		}
		//fs1.mkdir()只能创建一个目录
//		fs1.mkdirs();//可以创建多个目录
		//创建文件
//		File fs2=new File("d:/hello1.txt");//文件存在则创建，否则不会
//		System.out.println(fs2.createNewFile()?"创建成功":"创建失败");
		//创建文件夹
//		File fs3=new File("d:/hello2");
//		System.out.println(fs3.getParent());
	}
	static boolean l=false;
	static void find(File file,String space){
			if(l){
				System.out.print(space+file.getName());
			}else{
				System.out.println(space+file.getName());
			}
			if(file.isDirectory()){
				space+="  ";
				File[] files=file.listFiles();//获取目录下所有文件
				if(files.length>1){
					l=true;
				}else{
					l=false;
				}
				for(File f:files){
					find(f,space);//递归
				}
		}
	}
}
