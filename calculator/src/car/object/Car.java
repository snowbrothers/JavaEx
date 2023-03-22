package car.object;

public class Car {
	
	// 객체가 가지고 있는 여러가지 속성값을 정의해 놓는 것을 필드<<< 라고 합니다.
	// 생성할 때 값을 넣어 줄 수도 있고
	// 선언만 할 수도 있음
	
	String company = "현대자동차";
	String model = "각그랜저";
	int speed;		// 값을 초기화 해주지 않으면 초기값을입력
	boolean engineStart;
	
	// 생성자  ( 매개변수 ) 를 받아온다.
	public Car(String company) {
		// 필드의 이름과 매개변수의 이름이 동일한 경우에는 지역(로컬변수)변수가 우선된다.
		// 결과적으로 블록 내부에서 company 의 값은 매개변수의 값을 가르키고 있다.
		// this : 생성된 객체를 의미함. 별표 이백개
		this.company = company;
	}
	// 기본생성자: 매개변수가 없는 생성자
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어준다.
	// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다.
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// 메서드
	public void speedUp( ) {
		speed += 10;
	}
	
}
