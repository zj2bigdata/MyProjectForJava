package yj04_1208;

public class Paradigm<N>{
	private N value;	//定义属性
	public void setValue(N value){
		this.value=value;
	}
	public N getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		Paradigm<String> p=new Paradigm<String>();
		p.setValue("String泛型");
		System.out.println(p.getValue());
		
		Paradigm<Integer> p1=new Paradigm<Integer>();
		p1.setValue(444);
		System.out.println(p1.getValue());
		
		Paradigm<Float> p2=new Paradigm<Float>();
		p2.setValue(2.8f);
		System.out.println(p2.getValue());
	}
}
