package spiderRobot_Demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepliteRobot {

	 public static void main(String[] args) {
	        URL url = null;
	        URLConnection urlconn = null;
	        BufferedReader br = null;
	        PrintWriter pw = null;
	        String regex = "http://[\\w+\\.?/?]+\\.[A-Za-z]+";
//	        String regex = "https://[\\w+\\.?/?]+\\.[A-Za-z]+";//urlƥ�����
	        Pattern p = Pattern.compile(regex);
	        try {
	            url = new URL("http://www.baidu.com");//��ȡ����ַ��������ȡ����һ��������վ
	            urlconn = url.openConnection();
	            pw = new PrintWriter(new FileWriter("D:/SiteURL.txt"), true);//����ȡ�������ӷŵ�D�̵�SiteURL�ļ���
	            br = new BufferedReader(new InputStreamReader(
	                    urlconn.getInputStream()));
	            String buf = null;
	            while ((buf = br.readLine()) != null) {
	                Matcher buf_m = p.matcher(buf);
	                while (buf_m.find()) {
	                    pw.println(buf_m.group());
	                }
	            }
	            System.out.println("��ȡ�ɹ�^_^");
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            pw.close();
	        }
	    }
}
