package sec03.exam01;

public class SmartPhone extends Phone {

	
	/*public SmartPhone() {
		super(null);
	}*/
	
	public SmartPhone(String owner) {
		super(owner);

	}
	
	// 추상메서드를 구현 해야지만 클래스가 될 수 있다.
	@Override
	public void turnOn() {
		System.out.println("전원을 킵니다.");
		
	}

	
	public void inter() {
		System.out.println("인터넷을 검색합니다.");
		
	}
	
	// 상속받은 추상 메서드를 모두 구현해야 일반 클래스가 될 수 있다.
	// 부모로부터 강제로 구현을 위임받는다.


	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	
}
