package car.common;

public class CarMain {

	public static void main(String[] args) {
		
		// 사용하기 위해서는 변수에 담아주어야함
		// 메서드 또는 생성자의 위치로 이동하는 방법
		// f3 or ctrl + 클릭
		
		// 생성자를 호출 할때는
		// 생성자의 매개변수타입에 맞춰서 순서대로 입력 해줘야 합니다.
		
		
	
		Car car = new Car();
		
		System.out.println("car ====================");
		System.out.println(car.model);
		System.out.println(car.maxSpeed);
		System.out.println(car.color);
		
		Car car1 = new Car("그랜져");
		System.out.println("car1 ===================");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car("SM5", 0);
		System.out.println("car2 ===================");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		
		Car car3 = new Car("소나타", "검정색", 200);
		System.out.println("car3 ===================");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
		
		
		
		
	}

}
