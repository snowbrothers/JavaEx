package study2;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// result1 에 10 * 10 * 정적필드 pi 의 값을 저장
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(20, 30); // 50
		int result3 = Calculator.minus(30, 20); // 10
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
