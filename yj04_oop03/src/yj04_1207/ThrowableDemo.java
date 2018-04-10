package yj04_1207;

//异常处理两种方式:1.(a)try...catch,(b)try ...catch;(c)try...finally;
//2.throws(抛出异常)
public class ThrowableDemo {
	static int tc(){
		try{
			return 1/0;
		}catch(Exception e){
			
		}finally{
			System.out.println("fina");
		}
		return 123;//后执行
	}
	public static void main(String[] args) {
//		try{
//			System.out.println(1/0);
//		}catch(Exception e){
//		System.out.println("出现异常了");
//		}finally{
//			System.out.println("执行finally");
//			
//			System.out.println("over");
//		}
		System.out.println(tc());
	}
}
