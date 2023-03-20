package New;

public class Do_While {

	public static void main(String[] args) {
		
		// while 과 do while 의 차이점 
		
		//반복문 
		// 조건 주기전에 변수 선언
		
		int i = 10;
		
		while(i<0) {
			System.out.println("0보다 작습니다.");
			
		}
		
		//do while -> 코드블럭을 실행하고 조건을 판단합니다.
		// 결과적으로 코드블럭은 1회 무조건 실행된다.
		
		do {
			System.out.println("do = while 문은 코드 블럭을 무조건 한번 실행합니다.");
			System.out.println("1회 실행 후 조건문이 참일때까지 반복합니다.");
		} while (i<0); 
	}

}
