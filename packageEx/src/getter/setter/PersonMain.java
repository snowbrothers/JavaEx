package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("112345", "정관장");
		
		// 상수 필드의 값을 변경 할 수 없다.
		//person.nation = "한국"; // 오류 The final field Person.nation cannot be assigned
		person.name = "정관짱";
		
		System.out.println("파이값 : " + Person.PI);
		System.out.println("지구반지름 : " + person.EARTH_RADIUS + "km");
	
		
		// 싱글톤 방식의 예시 / 캘린더
		Calendar cal = Calendar.getInstance();
		
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(5);
		
		
		
		// 상수를 작성할때는 대문자로 .. 문자를 연결할때는 _ 사용
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
	
		// 실행전 
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		
		System.out.println(before);
		System.out.println(after);
		
	}

}
