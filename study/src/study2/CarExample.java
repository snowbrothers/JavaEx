package study2;

public class CarExample {

	public static void main(String[] args) {
		
		// company 는 static >> 정적 멤버로 필드선언을 해두었기 때문에
		// 따로 변수에 담아 사용하지 않아도 바로 실행이 가능하다. 
		
		
		CarEx car1 = new CarEx("트럭");
		System.out.println("차량 제조회사: " + Car.company);
		System.out.println("car1.model: " + car1.model);
		
		System.out.println("========================");
		
		CarEx car2 = new CarEx("자가용", "흰색", 0);
		System.out.println("차량 제조회사: " + Car.company);
		System.out.println("car2.model: "+ car2.model);
		System.out.println("car2.color: "+ car2.color);
		
	}

}
