package yj04.io;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> mp=new HashMap<String, String>();
		mp.put("001", "周星星");
		mp.put("002", "王大锤");
		mp.put("003", "李狗蛋");
		mp.put("004", "古巨基");
		
		Set<Entry<String, String>> st=mp.entrySet();
		Iterator<Entry<String, String>> it=st.iterator();
		while(it.hasNext()){
			Entry<String, String> ep=it.next();
			System.out.println(ep.getKey()+"---"+ep.getValue());
		}
	}
}
