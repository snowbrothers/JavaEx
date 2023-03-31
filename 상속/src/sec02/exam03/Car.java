package sec02.exam03;

public class Car {

	
	// 필드
	
	Tire fl = new Tire("FL", 6);
	Tire fr = new Tire("FR", 2);
	Tire bl = new Tire("BL", 3);
	Tire br = new Tire("BR", 4);
	
	

	// 생성자
	
	
	//메소드
	
	int run() {
	
		
		System.out.println("자동차가 달립니다.");
		if(fl.roll() == false) { stop(); return 1;}
		if(fr.roll() == false) { stop(); return 2;}
		if(bl.roll() == false) { stop(); return 3;}
		if(br.roll() == false) { stop(); return 4;}
	
		return 0;
	}



	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
