package getter.setter;

public class Person {

	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	
	
	// 상수 : 한번 값이 정해지고 나면 수정이 불가능하다.
	final String nation = "Korea";
	final String ssn;
	String name;
	
	Person(String ssn, String name){
		// this.nation = nation;
		this.ssn = ssn;
		this.name = name;
		
		
		// final 필드 이므로 변경 할 수 없다.
		// this.ssn = "123456 - 2323234"; << 오류
		this.name = "김태균";
	}
	
}
