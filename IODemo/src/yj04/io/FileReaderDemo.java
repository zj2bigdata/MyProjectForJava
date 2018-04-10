package yj04.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		Reader fr=null;
		try {
			 fr=new FileReader("d:/hellozj.txt");
			char[] buffer=new char[1024];
			int l=-1;
			while((l=fr.read(buffer)) != -1){
				System.out.println(new String(buffer,0,l));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
