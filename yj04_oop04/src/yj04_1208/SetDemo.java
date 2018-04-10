package yj04_1208;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		List<String> al6=new ArrayList<String>();
		al6.add("a");
		al6.add("b");
		al6.add("c");
		al6.add("a");
		al6.add("b");
		al6.add("a");
		al6.add("a");
		al6.add("c");
		al6.add("998");
		Set<String> st=new HashSet<String>(al6);//构造一个包含指定 collection 中的元素的新 set。
		st.add(null);
		System.out.println(st);
		System.out.println("----------------迭代器迭代元素------------------");
		Iterator<String> it=st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("----------------增强for迭代元素------------------");
		for(String m:st){
			System.out.println(m);
		}
		System.out.println("----------------添加重复元素------------------");
		Set<String> st2=new HashSet<String>();//构造一个新的空集合，其底层 HashMap 实例的默认初始容量是 16
		st2.add("1");
		st2.add("2");
		st2.add("5");
		st2.add("3");
		st2.add("1");
		System.out.println(st2);
	}
}
