package execeptionEx;

public class NullPoint {

	public static void main(String[] args) {

		String str = null;

		// 참조변수가 null 값을 가지고 있을때
		// 참조변수로 부터 객체접근연산자(.) 를 이용해서 접근할때 발생하는 오류
		try {
			str.toString();
			print(str);

		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
			
		

		// 예외처리
		// 프로그램이 정상적으로 종료될 수 있도록 처리
		System.out.println("프로그램이 정상적으로 종료되었습니다.");

	}
	
	// 메서드 에서도 throws 를 작성해주어야함.
	public static void print(String str) throws Exception {

		
		throw new Exception("강제 오류 발생");
	
	}
}
