package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
		
	// 정적필드, 정적 메서드는 new 연산자를 통해 생성하지 않고도 
	// 클래스 이름으로 접근하여 사용 할 수 있다.
	double res	= 10 * 10 * Calculator.pi;
		System.out.println(res);

		// 사용하려면 변수 선언해서 담아줘야함 .
	int plus = Calculator.plus(3, 3);
		System.out.println(plus);
		
		
	int minus =	Calculator.minus(4, 2);
		System.out.println(minus);
	}

}
