package fanshe_1212;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		//ʵ����˽����Student
		Class c=Class.forName("fanshe_1212.Student");
		Constructor sc=c.getDeclaredConstructor();
		sc.setAccessible(true);////ֵΪ true ��ָʾ����Ķ�����ʹ��ʱӦ��ȡ�� Java ���Է��ʼ�顣ֵΪ false ��ָʾ����Ķ���Ӧ��ʵʩ Java ���Է��ʼ�顣
		Object student=sc.newInstance();//ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
//		System.out.println(student);
//		//���ʹ�������name
//		Field fi=c.getDeclaredField("name");
//		fi.set(student, "yo");
//		System.out.println(fi.get(student));
//		//����˽������age
//		Field fi2=c.getDeclaredField("age");
//		fi2.setAccessible(true);
//		fi2.set(student, 18);
//		System.out.println(fi2.get(student));
		
//		Method[] mi=c.getMethods();//��ȡ������������������Ĺ�������
//		for(Method con:mi){
//			System.out.println(con.getName());
//		}
//		Method[] mi=c.getDeclaredMethods();//���� Method �����һ�����飬��Щ����ӳ�� Class �����ʾ�����ӿ����������з���������������������Ĭ�ϣ��������ʺ�˽�з��������������̳еķ�����
//		for(Method con:mi){
//			System.out.println(con.getName());
//		}
		Method mi=c.getDeclaredMethod("say", String.class);
		mi.setAccessible(true);
		Object hello=mi.invoke(student, "hellow world!");//�Դ���ָ��������ָ����������ɴ� Method �����ʾ�Ļ���������
		System.out.println(hello);
		
//		Class c1=s.getClass();
//		Class<Student> c2=Student.class;
//		System.out.println("--------------��ȡ����-------------------");
//		Class clazz=Class.forName("java.lang.String");
//		String name=clazz.getName();
//		System.out.println(name);
//		System.out.println("-------------------��ȡ����-------------------------");
//		Package pk=clazz.getPackage();//��ȡ������
//		String pname=pk.getName();
//		System.out.println(pname);
//		System.out.println("----------------------��ȡ������---------------------------------");
//		Class superClazz=clazz.getSuperclass();
//		String superName=superClazz.getName();
//		System.out.println(superName);
		
	}
}
