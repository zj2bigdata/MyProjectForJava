package fanshe_1212;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class NewTestStudent {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class cs=Class.forName("fanshe_1212.Student");
		System.out.println("----------------------��ȡ���й��캯��---------------------------------");
		Constructor[] c1=cs.getDeclaredConstructors();
		for(Constructor con:c1){
			System.out.println(con.getName());
		}
		System.out.println("----------------------��ȡ���캯��---------------------------------");
		Constructor c2=cs.getConstructor();
		System.out.println(cs.getName());
		System.out.println("----------------------------------------------------------------------");
		Method[] c=cs.getMethods();
		for(Method con:c){
			System.out.println(con.getName());
		}
		
	}
}
