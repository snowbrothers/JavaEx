package sec03.exam01;

public class SmartPhone extends Phone {

	
	public SmartPhone(String owner) {

		super(owner);
	
	}
	
	
	public void name() {
		
		System.out.println("휴대폰 사용자의 이름은 " + super.owner + " 입니다.");
	}

	// 메소드
	public void internetSearch() {
		
		System.out.println("인터넷 검색을 합니다.");
		
		
	}
	
	public void turnOn() {
		System.out.println("사용자 " + super.owner + "의 휴대폰 전원을 켭니다.");
	
		
	
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
