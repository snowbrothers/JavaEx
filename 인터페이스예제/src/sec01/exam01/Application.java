package sec01.exam01;

import sec01.exam02.MyClass;

public class Application {

	public static void main(String[] args) {
	// 인터페이스는 생성 할 수 없지만
	// 참조 변수의 타입으로 사용 할 수 있다.
	
		// 인터페이스 변수 = new 구현객체 >> 인터페이스의 다형성
		RemoteControl rc = new Audio();
		
		rc.turnOn();
		rc.setVolme(200);
		rc.turnOff();

		
		System.out.println(" ================================== ");
		// static final 을 자동으로 붙여주나보다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	
		
		System.out.println("==================================");
		//인터페이스의 다형성
		//인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다.

		
//		RemoteControl tv = new Television();
//		
//		tv.turnOn();
//		tv.turnOff();
//		tv.setVolme(10);


		// 상속단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		// 인터페이스의 타입으로 생성이 가능하
		Searchable searchable = new SmartTV();
		searchable.serarch("dd");
		
		RemoteControl smartv = new SmartTV();
		smartv.turnOn();
		smartv.setVolme(-1);
		smartv.turnOff();
		
		
		
	}
}
