package io.part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamDemo {
	
	public static void main(String[] args) {
		Student s1=new Student("tom1",12);
		Student s2=new Student("tom2",15);
		File fs=new File("d:/hello.txt");
		writeObject(fs,s1,s2);
		File fs1=new File("d:/hello.txt");
		readObject(fs1);
	}
	
	//向文件写入对象
	public	static void writeObject(File fs,Student ...s){
		ObjectOutputStream ooput=null;
		try {
			FileOutputStream stfs=new FileOutputStream(fs);
			ooput=new ObjectOutputStream(stfs);
			for(Student st: s){
				ooput.writeObject(st);
			}
			ooput.writeObject(null);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=ooput){
					ooput.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//从文件读取对象
	static void readObject(File fs){
		ObjectInputStream ooin=null;
		Object s=null;
		try {
			FileInputStream fis=new FileInputStream(fs);
			ooin =new ObjectInputStream(fis);
		s=ooin.readObject();
		while(null !=s){
			Student st=(Student) s;
			System.out.println(st.getName()+"--"+st.getAge());
			s=ooin.readObject();
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=ooin){
					ooin.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
