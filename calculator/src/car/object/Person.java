package car.object;

public class Person {
	
	public static void main(String[] args) {
		
		// 매개변수가 없으면 기본생성자
		
	/*	Car car = new Car( );
		Car carKia = new Car("기아자동차");
		
		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다.
		// 출력하고자 할때 뭘 출력하는지 명확하게 해주는것이 좋다.
		System.out.println("car.company : " + car.company);

		car.speedUp();
		System.out.println("car.speed: " + car.speed);
		
		System.out.println("carKia.company : " + carKia.company); */
		
		// 필드에 접근해서 값을 읽어오고 변경하는 방법.ㅋ
		
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("car.company: " + car.company);
		System.out.println("speed : " + car.speed);
		car.speedUp();
		System.out.println("speed : " + car.speed);
		car.speed = 100;
		System.out.println("car.speed = 100 ");
		System.out.println("speed : " + car.speed);
		
	}

}
