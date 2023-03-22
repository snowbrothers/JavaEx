package car.common;

public class Car {
	
	// 필드 생성
	
	String model ;
	String color;
	int maxSpeed;
	
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언 한다
	
	// 생성자의 특징 2가지
	// 1. 클래스명과 이름이 같다 2. 반환타입이 없다

	// 타입이 다르거나 변수의 갯수가 다르거나 ...  
	public Car() {
	
		// 생성자 호출
		// this. : 필드
		// this() : 생성자
		// 생성자를 사용하기 위해서 매개변수에 알맞은 파라미터를 넣어준다.
		// 생성자에서 다른 생성자를 호출 할 수 있다.
		
		// 1. 생성자에서 다른 생성자를 호출 할 수 있다. 
		// -> 중복되는 코드를 줄이기 위해서
		 
		this("기본모델", "블랙", 150);
		// null, null , 0
	} // 기본생성자
	
	public Car(String model) {
		 // model = model; -> 코드블럭 안에서는 로컬 변수가 우선되므로 아무런 의미가 없음
		//this.model = model;
		this(model, null , 0);
	} 
	
		// 생성자 오버로딩
	public Car(String model, String color) {
		// 생성자의 호출은 첫번째 단에서만 가능하다.
		this(model, color, 0);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model , int maxSpeed) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
}
