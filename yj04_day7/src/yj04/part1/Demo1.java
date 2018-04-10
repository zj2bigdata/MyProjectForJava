package yj04.part1;

//数组
public class Demo1 {
	//需求:使用变量管理学员信息,100个学员，可以用索引的方式快速查找其信息
	//单独使用变量无法完成,如果要声明100个变量，那会很吃内存
	//使用数组来解决问题
	public static void main(String[] args) {
		String name1="zj";
		//....
		//声明长度为10的字符串数组
		//[]表示从0开始匹配数据(0-9)长度为10;
		//数组管理元素时必须使用同一种数据类型
		//int[] array=new int[];这种声明必须要给与长度
		//数组第一种声明方式，称为静态初始化
		String[] names = new String[10]; //@2a139a55 这个是new String[10]分配的内存地址
		System.out.println(names);//
		System.out.println(names.length);//该数组长度为10
		//System.out.println(names[10]);//java.lang.ArrayIndexOutOfBoundsException 数组下标越界
		//怎么表示数组的第一个长度
		names[0]="庄周";
		//names[0]=10; 报错cannot convert from int to String
		System.out.println("----------------------------------------------");
		
		//动态初始化
		char[] charArray;
		char[] charArray1;
		//初始化必须给长度或数据
		charArray =new char[]{'夏','倪','粉','带','菜'};
		System.out.println("charArray长度:"+charArray.length);
		System.out.println(charArray);
		charArray1=charArray;//将charArray的地址同时给了charArray1
		System.out.println(charArray1);
		charArray1[2]='2';//修改charArray1将同时改变charArray指向的值
		System.out.println(charArray);
		//另一种动态初始化
		int[] intArray={1,2,3,4,5};
		System.out.println(intArray);
		System.out.println(intArray[0]);
		System.out.println(intArray[2]);
		System.out.println("-----------------------");
		//默认值
		int[] intArray1= new int[1];
		System.out.println(intArray1[0]);//将打印int默认值0
		char[] charArray3= new char[1];
		System.out.println(charArray3[0]);//jdk1.8及以上将打印char默认值空
		double[] doubleArray3= new double[1];
		System.out.println(doubleArray3[0]);//将打印double默认值0.0
		boolean[] booleanArray3= new boolean[1];
		System.out.println(booleanArray3[0]);//将打印boolean默认值0.0
		String[] stringArray3= new String[1];
		System.out.println(stringArray3[0]);//将打印string默认值null(类或对象的默认值都是null)
		
		System.out.println("-----------------------------------------------");
		//数组遍历:循环展示数据集中的每一个元素
		String[] foods={"薯条","豆浆","汉堡","炸鸡","啤酒"};
		//for循环
		System.out.println("我的营养早餐是:");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		//java中for...each循环(增强for循环):适用于遍历数据集
		//遍历foods
		//foods中的每一个元素类型,给每个元素起名food
		System.out.println("(for...each)我的营养餐是:");
		for(String food:foods ){
			System.out.println(food);
		}
	}
}