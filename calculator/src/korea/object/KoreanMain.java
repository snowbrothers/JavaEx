package korea.object;

public class KoreanMain {

	public static void main(String[] args) {
		
		//클래스는 틀을 제공한다 // 거푸집 !
		
		// 초기화가 안된상태
		Korean korean = new Korean();
		korean.name = "서태웅";
		korean.ssn = "893321 - 1122345";
		System.out.println("Japan ============= ");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.nation);
		
		
		// 객체 초기화
		System.out.println("\nkorean ============= ");
		Korean hong = new Korean("홍길동", "322331 - 1123556");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		System.out.println("\nJapan ============= ");
		Korean backho = new Korean("강백호", "892341 - 1123556");
		System.out.println(backho.name);
		System.out.println(backho.ssn);
		System.out.println(backho.nation);
		
		
	
	}

}
