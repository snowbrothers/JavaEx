package sec01.exam02;

public class StudentExample {

	public StudentExample() {
	
	
	}
	
	public static void main(String[] args) {

		
		// 코드의 양을 줄일 수 있고 
		// 중복되는 코드를 없앨 수 있다.
		// 재사용 가능 !
		
		
		People p = new People("박상민", "123456-123245");
		
		Student s = new Student("학생1", "주민번호", 1);
		
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
		
		// 주소값이 바뀜!
		System.out.println("s.toString()==============");
		System.out.println(s.toString());
	
	
	}

}
