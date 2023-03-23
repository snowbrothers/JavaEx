package calc;

public class CarMain {

	public static void main(String[] args) {

		Car goStop = new Car(10);

		// 메서드 호출 가능
		// 타입이름 . 메서드 이름
		goStop.run();

		if (goStop.isLeftGas()) {
			System.out.println("남은 기름의 양: " + goStop.gas);
		} else {
			System.out.println("주유바랍니다.");
		}

		System.out.println(" ========================== ");
		
		goStop.run1();
		
	}
}