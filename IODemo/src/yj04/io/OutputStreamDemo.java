package yj04.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 1.������ϵ
 * 2.ȷ����
 * 3.ѡ������
 * 4.����ͳ�
 * */
public class OutputStreamDemo {
	public static void main(String[] args) {
		File fs=new File("f:/zj.txt");
		OutputStream fos=null;
		try {
			 fos=new FileOutputStream(fs,true);
			String str="���Ǵ����ݷ���ʦ!";
			byte[] data=str.getBytes();
			fos.write(data);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�δ�ҵ���");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����д��ʧ�ܣ�");
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ر������ʧ�ܣ�");
			}
		}
	}
}
