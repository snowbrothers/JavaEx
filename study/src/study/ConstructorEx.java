package study;

public class ConstructorEx {

	public static void main(String[] args) {
		
		Constructor slamDunk = new Constructor("강백호", "북산고등학교", 17, 10);
		
		
		
		
		System.out.println(slamDunk.name);
		System.out.println(slamDunk.school);
		System.out.println(slamDunk.age);
		System.out.println(slamDunk.num);
		
		
		System.out.println(" ========================= ");
		
		// Constructor << 배열 참조타입
		Constructor[] cons = new Constructor[4];
		
		
		// cons 배열에는 Constructor생성자의 정보를 담아 초기화?
		cons[0] = new Constructor("서태웅", "북산고등학교", 17, 7);
		cons[1] = new Constructor("채치수", "북산고등학교", 19, 5);
		cons[2] = new Constructor("정대만", "북산고등학교", 17, 3);
		cons[3] = new Constructor("강백호", "북산고등학교", 17, 10);
		
		
		// 타입 <<
// 향상된 for문 // 타입 변수이름 : 배열이름 
		
		for(Constructor first : cons) {
			System.out.println(" ====================== ");
			System.out.println(first.name);
			System.out.println(first.school);
			System.out.println(first.age);
			System.out.println(first.num);
			System.out.println(" ====================== ");
			
		}
		
		
		
		
	}

}
