package io.part1;

import java.io.File;
import java.io.IOException;

public class IoDemo1 {
	public static void main(String[] args) throws IOException {
		File fs1=new File("d:/helloworld");
		find(fs1,"  ");
//		String[] strfs=fs1.list();//��ȡ��ǰĿ¼������Ŀ¼�����ǳ�
//		for(String str :strfs){
//			System.out.println(str);
//		}
		//fs1.mkdir()ֻ�ܴ���һ��Ŀ¼
//		fs1.mkdirs();//���Դ������Ŀ¼
		//�����ļ�
//		File fs2=new File("d:/hello1.txt");//�ļ������򴴽������򲻻�
//		System.out.println(fs2.createNewFile()?"�����ɹ�":"����ʧ��");
		//�����ļ���
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
				File[] files=file.listFiles();//��ȡĿ¼�������ļ�
				if(files.length>1){
					l=true;
				}else{
					l=false;
				}
				for(File f:files){
					find(f,space);//�ݹ�
				}
		}
	}
}
