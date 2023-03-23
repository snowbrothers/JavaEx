package study2;

public class CarEx {

	static String company = "기아자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	
	// 기본생성자에는 오버로딩이 안됨.
	
	CarEx(String model){
		
		//this.model = model;
		
		this(model, "은색", 250);
	}


	
	CarEx(String model, String color){
	 this(model, color, 250);
	}	
	
	CarEx(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
