package sec03.exam01;


// 추상 클래스
public abstract class Phone {

	// 필드
	public String owner;
	
	
	// 생성자
	public Phone(String owner) {
		
		// this. << 필드 호출 // 지역변수가 우선되기 때문에 명시해주어야함.
		this.owner = owner;
		
	}
	
	// 메소드
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
