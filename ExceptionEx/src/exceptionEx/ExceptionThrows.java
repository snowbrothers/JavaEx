package exceptionEx;

import java.io.IOException;

public class ExceptionThrows {

	public static void main(String[] args) {

		ExceptionThrows ex = new ExceptionThrows();

		method2();
		
	}

	public static void method1() throws IOException, NullPointerException, Exception {
		System.out.println("method1() 호출");

		int num = (int) (Math.random() * 3 + 1);

		if (num == 1) {
			throw new Exception();
		} else if (num == 2) {
			throw new IOException();

		} else if (num == 3) {
			throw new NullPointerException();
		}

	}

	public static void method2() {
		System.out.println("method1 호출");
		try {
			method1();

		} catch (IOException e) {

			System.out.println("IOException 이 발생하였습니다.");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException 이 발생하였습니다.");
		
		} catch (Exception e) {
			System.out.println("Exception 이 발생하였습니다.");

		}
	
		System.out.println("method1 종료");
	
	}
	
	
	

	public void method3() {

	}
}
