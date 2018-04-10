package yj04.part1;

//for循环
public class Demo3 {
	public static void main(String[] args) {
		/*
		 * for(表达式1;表达式2;表达式3){ 循环体 }
		 * 1.表达式1:循环的基础变量
		 * 2.表达式2:循环的条件
		 * 3.循环的的变量迭代
		 * */
		
		//案例1:马超跑十圈
//		for(int i=1;i<11;i++){
//			System.out.println("马超正在跑第"+i+"圈！");
//		}
		
		//案例2:喜马拉雅山高8848米，一张纸厚度0.01米，使用高科技对纸进行无限折叠，折叠到多少次才会与山同高
		int sum=1;
		int count=0;
		for(sum=1;sum<=884800;sum*=2){
			count++;
		}
		System.out.println("折叠次数为:"+count);
		
		//案例3:一次迟到1元，2次2元，3次4元，4次8元，...
		//本学期迟到20次罚款多少
		int money=1;
		int sum_money=1;
		for(int i=2;i<=20;i++){
			money*=2;
			sum_money+=money;
		}
		System.out.println("迟到20次罚款:"+sum_money+"元!");
	}
}
