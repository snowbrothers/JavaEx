package study2;

public class Car {

	// 필드
static	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	
	//기본
	Car(){
		
	}
	
	
	Car(String model){
		this.model = model;
		
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
