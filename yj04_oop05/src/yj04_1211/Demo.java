package yj04_1211;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<Object> set=new HashSet<Object>() ;
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		Map<String,Object> map=new HashMap<String, Object>();
		map.put(null,null);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("-------------------Hashtable----------------------");
		Map<String,Object> map2=new Hashtable<String, Object>();//
		map2.put(null,null);
		System.out.println(map2);//Exception in thread "main" java.lang.NullPointerException
	}
}
