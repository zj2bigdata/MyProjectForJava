package smp.student;
//学生类管理学生数据库
public class Student {
	private String stuid;
	private String name;
	private String gender;
	private String age;
	private String birthday;
	
	public Student(String name,String gender,String age,String birthday){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.birthday=birthday;
	}
	public Student(String stuid,String name,String gender,String age,String birthday){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.birthday=birthday;
		this.stuid=stuid;
	}
	
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
