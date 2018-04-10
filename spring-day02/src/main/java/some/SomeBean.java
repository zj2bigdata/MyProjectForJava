package some;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {
	private List<String> list;
	private Set<Integer> set;
	private Map<Integer,String> map;
	private Properties pro;
	public SomeBean() {
		System.out.println("SomeBean()");
	}
	
	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<Integer> getSet() {
		return set;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "SomeBean [list=" + list + ", set=" + set + ", map=" + map + ", pro=" + pro + "]";
	}
	
	
	
}
