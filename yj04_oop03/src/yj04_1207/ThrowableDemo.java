package yj04_1207;

//�쳣�������ַ�ʽ:1.(a)try...catch,(b)try ...catch;(c)try...finally;
//2.throws(�׳��쳣)
public class ThrowableDemo {
	static int tc(){
		try{
			return 1/0;
		}catch(Exception e){
			
		}finally{
			System.out.println("fina");
		}
		return 123;//��ִ��
	}
	public static void main(String[] args) {
//		try{
//			System.out.println(1/0);
//		}catch(Exception e){
//		System.out.println("�����쳣��");
//		}finally{
//			System.out.println("ִ��finally");
//			
//			System.out.println("over");
//		}
		System.out.println(tc());
	}
}
