package animal;

public abstract class Animal {

	public String kinds;
	
	
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	
	// 추상메서드 선언 // abstract 반환타입 메소드이름(매개변수);
	public abstract void sound();

}


