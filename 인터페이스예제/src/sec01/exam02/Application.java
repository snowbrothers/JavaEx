package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.Searchable;
import sec01.exam01.SmartTV;

public class Application {

	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성한다.
		// 참조타입 변수에 저장한다.
		MyClass myclass = new MyClass();
		
		// 타입으로 선언도 가능!
		Searchable search1 = new SmartTV();
		
		// myClass 의 필드에 접근 하여 메서드를 호출 한다.
		// smartTv 생성
		
		
		// 1. 인터페이스가 필드에 사용된 경우
		// myClass 의 필드에 접근하여 메서드를 호출(smartTV생성되어 있
		myclass.rc.turnOn();
		myclass.rc.setVolme(15);
		search1.serarch("유튜브");
		myclass.rc.turnOff();
		
		System.out.println("======================");
		
		// 1_2. 필드에 새로운 객체를 생성하여 저장
		myclass.rc = new Audio();
		myclass.rc.turnOn();
		myclass.rc.setVolme(20);
		myclass.rc.turnOff();
		
		
		System.out.println("======================");
		
		
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass myclass1 = new MyClass(new Audio());
		myclass1.rc.turnOn();
		myclass1.rc.setVolme(5);;
		myclass1.rc.turnOff();
		
		
		System.out.println("======================");
		
		// 3. 인터페이스가 메서드의 매개변수로 이용된 경우
		// 기본생성자로 생성하면 rc = new SmartTv로 생성됩니다.
		// 필드에 선언부에서 생성
		MyClass myclass2 = new MyClass();
		// 인터페이스가 메서드의 매개변수 타입으로 사용 될 경우
		// 메서드 호출 시 구현 객체를 매개값으로 대입
		myclass2.methodB(new Audio());
		myclass2.rc.turnOn();
		myclass2.rc.setVolme(10);
		myclass2.rc.turnOff();

		System.out.println("======================");
		
		MyClass myclass3 = new MyClass();
 		// 4. 메서드에 선언된 로컬변수를 rc 에 저장.
		myclass3.methodA();
		myclass3.rc.turnOn();
		myclass3.rc.setVolme(20);
		myclass3.rc.turnOff();
	
	
	
	}
}
