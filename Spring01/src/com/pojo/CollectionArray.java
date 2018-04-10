package com.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionArray {
	private List<String> list;
	private Set<String> set;
	private Map<Integer,String> map;
	private int[] iArray;
	private Properties pro;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public int[] getiArray() {
		return iArray;
	}
	public void setiArray(int[] iArray) {
		this.iArray = iArray;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "CollectionArray [list=" + list + ", set=" + set + ", map=" + map + ", iArray=" + Arrays.toString(iArray)
				+ ", pro=" + pro + "]";
	}
	
	
}
