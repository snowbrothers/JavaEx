package sec02.exam04;

public class Driver extends Vehicle {

	void drive(Vehicle vehicle) {
		
		// Vehicle 을 상속받아서 구현된 객체가 매개변수로 입력된 경우
		// 부모타입으로 자동 형 변환된 경우 !
		// 만약 vehicle의 원래 타입이 Bus가 맞다면 
		// 생성된인스턴스(객체) instanceof 타입 
	
		// new 연산자에 의해서 원래 생성된 타입을 확인한다.
		// 부모타입이 자식타입으로 강제 캐스팅 될 경우 오류가발!
		if(vehicle instanceof Bus) {
			
			Bus bus = (Bus)vehicle;
			System.out.println("Bus 타입으로 변환 성공");
			
		} else {
			System.out.println("Bus 타입으로 변환 불가능 합니다..!");
		}
		
		vehicle.run();
	}
		
}
