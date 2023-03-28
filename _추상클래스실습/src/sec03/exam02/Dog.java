package sec03.exam02;

public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	// 강제로 구현을 위임한다.
	@Override
	public void sound() {
		System.out.println("왕왕!");
		
	}

	
}
