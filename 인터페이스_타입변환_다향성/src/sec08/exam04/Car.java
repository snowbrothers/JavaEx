package sec08.exam04;

public class Car {

//  인터페이스는 객체를 생성 할 수 없다.	
	//Tire tire = new Tire(); << 오류
	
	// 인터페이스의 구현체인 경우에만!
	// 인터페이스를 참조변수의 타입으로 사용할 수 있다.
	Tire frontLeftTire = new HankookTire();

	//	Tire frontRightTire = new HankookTire();
//	Tire BackLeftTire = new HankookTire();
//	Tire BackRightTire = new HankookTire();
	
	
	public Car(Tire tire) {
	
		this.frontLeftTire = tire;
	}
	
	public void run() {
		
		frontLeftTire.roll();
	}
	
	
	
	
	
	
}
