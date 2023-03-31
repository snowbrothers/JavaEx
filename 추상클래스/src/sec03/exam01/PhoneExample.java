package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {

		/// 추상클래스는 new 연산자를 통해 객체 생성이 불가능하다.
		//Phone phone = new Phone();
	
		SmartPhone smart = new SmartPhone("김덕수");
		
		smart.name();
		System.out.println("=================================");
		
		
		// 현재 turnOn 메서드는 자식클래스에서 메서드 재정의를 통해
		// 변경했기 때문에 부모클래스의 turnOn 이 아닌 자식클래스의 메서드가 실행된다.
		smart.turnOn();
		smart.turnOff();
	}

}
