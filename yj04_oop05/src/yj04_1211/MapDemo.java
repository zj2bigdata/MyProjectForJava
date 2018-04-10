package yj04_1211;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String ,String> map=new HashMap<String,String>();
		map.put("a","b");
		map.put("a1","b1");
		map.put("a2","b2");
		map.put("a3","b3");
		System.out.println("����Ԫ��Ϊ:"+map);
		System.out.println("-------------������---------------");
		Set<String> set=map.keySet();
		Iterator<String> set1=set.iterator();
		while(set1.hasNext()){
			System.out.println(set1.next()+"---"+map.get(set1.next()));
		}
		System.out.println("-----------��ǿforѭ��---------------");
		for(String m:set){
			System.out.println(m+"---"+map.get(m));
		}
		System.out.println("-----------get(key)������value---------------");
		String w=map.get("a1");
		System.out.println(w);
		System.out.println("------------��ȡ����value---------------");
		Collection<String> cs=map.values();
		for(String cs1:cs){
			System.out.println(cs1);
		}
		System.out.println("-------------����Ƕ��-----------------");
		Set<Entry<String,String>> s1=map.entrySet();//  interface Entry<K,V>
		Iterator<Entry<String, String>> it=s1.iterator();
		while(it.hasNext()){
			Entry<String, String>m=it.next();
			System.out.println(m.getKey()+"---"+m.getValue());
		}
		System.out.println("-------------����Ƕ��(for)-----------------");
		for(Entry<String,String> m1:s1){
			System.out.println(m1.getKey()+"---"+m1.getValue());
		}
		
	}
}
