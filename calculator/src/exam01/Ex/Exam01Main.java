package exam01.Ex;

public class Exam01Main {

	public static void main(String[] args) {
		
		// 객체 생성
		 Exam01 person = new Exam01();
		 
		 // 필드 사용 ! 객체의 고유의 값
		 person.age = 17;
		 person.name = "강백호";
		 person.id = "slamDunk";
		 person.password = "채소연";
		 
		 
		 System.out.println(person.name);
		 System.out.println(person.age);
		 System.out.println(person.id);
		 System.out.println(person.password);
		 
	}

}
