package sec08.exam04;

public class Application {

	public static void main(String[] args) {
		
		// 객체를 생성
		// 내가 정의해 놓은 class 를 타입으로 사용한다
		KumhoTire kumho = new KumhoTire();
		// KumhoTire가 Tire 를 구현하고 있으므로
		// trie 로 자동 형변환 된다.
		
		Tire tire = new KumhoTire();
		
		//다형성 : 여러가지 타입을 가질 수 있는 성질
		// 1. 상속 : 자식클래스는 부모타입으로 선언 할 수 있다.
		//			부모타입으로 자동 형변환 된다. 
		
		// 2. 인터페이스 : 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다.
		// 				인터페이스타입으로 자동 형변환 된다.
		
		
		
		// 다형성
		// 메서드의재정의(오버라이딩)
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체를 매개변수로 넣어줘야 합니다.
		// 인터페이스의 구현체가 파라메터로 사용됩니다.
		// 구현체가 생성한 실체 로직이 실행 됩니다.
		Car kumho_car = new Car(new KumhoTire());
		Car hankook_car = new Car(new HankookTire());
		
		kumho_car.run();
		hankook_car.run();
	}
	

}
