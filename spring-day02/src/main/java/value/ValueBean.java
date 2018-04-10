package value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ValueBean {
	private String name;
	private int age;
	private List<String> list;
	private Set<String> set;
	private Map<String,Integer> map;
	private Properties pro;
	public ValueBean() {
		System.out.println("ValueBean()");
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getList() {
		return list;
	}

	public Set<String> getSet() {
		return set;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ValueBean [name=" + name + ", age=" + age + ", list=" + list + ", set=" + set + ", map=" + map
				+ ", pro=" + pro + "]";
	}

	

	
	
	
	
}
