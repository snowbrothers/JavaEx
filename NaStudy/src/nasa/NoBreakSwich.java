package nasa;

public class NoBreakSwich {

	public static void main(String[] args) {

		// Break문이 없는 case 
		// ** Break 문이 없는 경우에는 출력이 멈추지 않고 끝까지 출력된
		
		// 변수 선언
		
		int time = (int)(Math.random() * 4 + 8);
		
		System.out.println("[현재 시각: " + time + " 시");
		
		// switch ctrl + space 를 누르면 자동으로 양식 완성 ! 
		switch (time) {
		case  8:
			System.out.println("출근시간 입니다.");
		
		case 9 :
			System.out.println("회의시간 입니다.");			
		
		case 10 :
			System.out.println("업무시간 입니다.");
		
		case 11 :
			System.out.println("외근을 나갑니다.");
		
		default:
			System.out.println(" ========================");
			break;
			
		}
		
		// char 타입 변수를 이용한 switch 문
		
		char ab = 'a';
		
		switch (ab) {
		
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
		
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
			
			break;
			
		case 'C':
		case 'c':
			System.out.println("불량회원 입니다.");
			break;
					
		}
		
		System.out.println("======================");
		
		// String 타입의 switch 문
		
		String position = "부장";
		
		switch (position) {
	
		case "사장":
			System.out.println("급여를 주는 사람");
			break;
		
		case "부장":
			System.out.println("700 만원");
			break;
		
		case "과장":
			System.out.println("500 만원");
			break;
		
		case "사원":
			System.out.println("200 만원");
			break;

		default:
			break;
		}
		
		
		
		
		
		
	}

}
