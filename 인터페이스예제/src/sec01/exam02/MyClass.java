package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTV;

public class MyClass {
	
	// 인터페이스는 생성 할 수 없다.
	// 인터페이스는 필드, 생성자, 메서드의 매개변수,
	//생성자, 메서드, 로컬변수로 선언<< 할 수 있다. // 타입으로 쓸 수 있다는 뜻.
	// ==>> 다형성 구현.....
	
	
	// 인터페이스가 필드의 타입으로 선언된 경우 
	// 인터페이스의 구현체만 인터페이스를 타입으로 사용 할 수 있다.
	RemoteControl rc = new SmartTV();
	
	
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		// 매개변수로 받아온 rc 를 필드에 저장
		this.rc =rc;
		
	}
	
	public void methodA() {

		// Audio 객체를 생성하여 RemoteControl 타입으로 자동 변환
		RemoteControl rc = new Audio();
		// 생성된 객체를 필드에 저장
		this.rc = rc;
	}
	
	
	public void methodB(RemoteControl rc) {
		// 매개변수로 넘어온 rc 를 필드에 저장한다
		this.rc = rc;
		
	}
}
