package execeptionEx;

/**
 * try{ // 예외가 발생 할 수 있는 코드들을 작성
 * 
 * }catch (Exception e){ // try 블록에서 예외가 발생 시 실행을 멈추고 catch 블록을 실행
 * 
 * }finally{ // 생략이 가능하며 // 예외가 발생하거나 예외가 발생하지 않았을 경우 모두 실행한다. // 보통 자원을 반납하는
 * 문장이 작성 }
 * 
 * @author user
 *
 */
public class A_TryCatch {

	
	
	
	public static void main(String[] args) throws Exception {

		// 사용하고 싶으면 객체 생성.
		A_TryCatch a = new A_TryCatch ();
		a.method1();
		System.out.println("======================");
		a.method3();
	}
	public void method3() throws Exception {
		
		method2();
		
	}
	
	
	public void method1() {
		// 오류가 발생할 소지가 있는 메서드를 try catch 문으로 감싸
		// 오류 처리를 할 수 있다.
		// ==> 프로그램이 강제 종료 되지 않고 계속해서 실행 될 수 있도록 처리
		// 1. 메서드를 호출한 곳으로 오류를 떠넘기기 => 강제종료의 위험
		// 2. try catch 문을 처리
		try {
			System.out.println("method2() 호출 전");
			method2();
			System.out.println("method2() 호출 후");

		} catch (Exception e) {

//			e.printStackTrace();
			System.out.println("method2() 호출 도중 오류 발생");
			System.out.println("");
		} finally {
			// 무조건 실행 (오류발생, 오류 미발생)
			System.out.println();

		}

	}

	// 메서드를 호출한 곳으로 예외처리를 미룸
	public static void method2() throws Exception {

		System.out.println("method2() 호출 중에 예상치 못한 예외가 발생...");
		throw new Exception("강제로 예외를 발생 시켰습니다.");
	}

}
