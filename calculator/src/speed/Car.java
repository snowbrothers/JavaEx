package speed;

public class Car {
	// 필드 : 속성을 정의
	// 정수 speed;
	public int speed;
	
	// 생성자	 : new 연산자에 의해 객체를 생성할 때 호출
	// 1. 기본생성자
	public Car(){
		
	}
	
	// 2. speed 를 매개변수로 받는 생성자
	// 매개변수로 넘어온 값을 필드에 세팅. 초기화!
	public Car(int speed){
		this.speed = speed;
	
	}
	
	
	// 메서드 : 기능을 정의
	//getSpeed : int
	public int getSpeed() {
		
		return speed;
	}
	
	// keyTurnOnOp : void
	void keytTurnOnOp() {
		
		System.out.println("시동을 켭니다.");
	}
	
	// run : void
	// 속도를 10씩 증가시키면서 50까지 속도를 출력합니다.
	void run() {
		
		for(int i=0; i<=50; i+=10) {
			System.out.println("i= " + i);
			// 필드에 값을 설정한다.
			speed = i;
			System.out.println("시속 :" + speed + "km/h");
		}
		
		
	
		
	}
	public static void main(String[] args) {
	
		Car car	= new Car();
		car.keytTurnOnOp();
		car.run();
		
		int speed = car.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
		
		
	}
	
	
	
}


	
	
