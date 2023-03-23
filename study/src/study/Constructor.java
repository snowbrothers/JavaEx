package study;

public class Constructor {
	
	String name;
	String school;
	int age;
	int num;
	
	public Constructor(String name, String school) { 
		this(null, null, 0 , 0 );
		
		
	}
	
	public Constructor(String name, String school, int age, int num) {
		
		this.name = name;
		this.school = school;
		this.age = age;
		this.num = num;
	}
	
}
