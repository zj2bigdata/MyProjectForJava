package yj04.part1;


//break��continue
public class Demo4 {
	public static void main(String[] args) {
		//break��ѭ����������break���ʱ����������ѭ��������ѭ���⣬ִ��ѭ���ṹ��������
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
//				break;//ֻ��������ǰѭ��
//			}
//		}
	}
}
