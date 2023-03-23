package sec04.exam04;

public class Calculator {

	public static void main(String[] args) {
		
	Calculator calcul	= new Calculator();
	
	calcul.execute();
	
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
		
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	void execute() {
		double result = avg(8, 10);
		println("실행결과: " + result);
		
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
