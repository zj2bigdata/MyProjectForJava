package yj04.part1;

public class Demo7 {
	public static void main(String[] args) {
		//if..elseif..else一个整体判断单元
		//如果这三个的条件都满足，那程序只会进入第一个判断
		String name="郭德纲";
		if(name.equals("郭德纲")){
			System.out.println("老郭OK");
		}else if(name.equals("郭德纲")||name.equals("于谦")){
			System.out.println("老郭NO");
		}else{
			System.out.println("老郭TO");
		}
	}
}
