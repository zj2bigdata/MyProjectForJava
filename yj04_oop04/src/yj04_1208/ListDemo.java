package yj04_1208;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("1");
		al.add("String");
		al.add("true");
		al.add("2");
		al.add("true");
		al.add(null);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(2));
		al.remove("true");
		System.out.println(al);
		System.out.println("--------------�Ƴ�����--------------------");
		List<String> al1=new ArrayList<String>();
		al1.add("true");
		al.removeAll(al1);
		System.out.println(al);
		System.out.println("---------------for����------------------");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("----------------��ǿfor-----------------");
		for(String a:al){
			System.out.println(a);
		}
		System.out.println("--------����������----------");
		Iterator<String> it=al.listIterator();//������ָ��ļ���
		while(it.hasNext()){
			String l=it.next();
			System.out.println(l);
		}
		System.out.println("---------���---------");
		al.clear();
		System.out.println(al);
		if(al.isEmpty()){
			System.out.println("����");
		}
		System.out.println("----------�滻Ԫ��------------");
		System.out.println(al.hashCode());
		al.add("2");
		al.set(0, "��һ��");
		System.out.println(al);
		System.out.println("------------����--------------");
		List<String> al2=new ArrayList<String>();
		al2.add("��һ��");
		if(al.containsAll(al2)){
			System.out.println("������");
		}
		
		System.out.println("--------------ɾ���ظ�Ԫ��1----------------");
		List<String> al3=new ArrayList<String>();
		al3.add("a");
		al3.add("b");
		al3.add("c");
		al3.add("a");
		al3.add("b");
		al3.add("a");
		al3.add("a");
		al3.add("c");
		al3.add("998");
		System.out.println("��ѡǰ:"+al3);
		for(int i=0;i<al3.size();i++){
			for(int j=i+1;j<al3.size();j++){
				if(al3.get(i).equals(al3.get(j))){
				al3.set(j,"null");
				}
			}
		}
		List<String> al5=new ArrayList<String>();
		al5.add("null");
		al3.removeAll(al5);
		System.out.println("��ѡ��:"+al3);
		
		System.out.println("--------------ɾ���ظ�Ԫ��2----------------");
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
		System.out.println("��ѡǰ:"+al6);
		int k=al6.size();
		for(int i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				if(al6.get(i).equals(al6.get(j))){
				al6.remove(j);
				k--;
				}
			}
		}
		System.out.println("��ѡ��:"+al3);
		
		
	}
}
