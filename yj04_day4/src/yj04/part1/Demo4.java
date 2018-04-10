package yj04.part1;


//break和continue
public class Demo4 {
	public static void main(String[] args) {
		//break在循环体中遇见break语句时，立即结束循环，跳至循环外，执行循环结构后面的语句
		int i=1;
		int sum=0;
		while(i<=100){
			if(i==11){
				break;
			}
			sum+=i;
		}
		System.out.println(sum);
		
		int sum1=0;
		int j;
		for(j=0;j<100;j++){
			if(j%2==0){
				continue;
			}else{
				sum1+=j;
			}
		}
		
//		for(){
//			while(){
//				break;//只能跳出当前循环
//			}
//		}
	}
}
