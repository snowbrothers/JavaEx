package sec02.exam03;

public class HankookTire extends Tire {

	// 자식클래스
	
	public HankookTire(String location, int maxRotation) {
		
		
		super(location,maxRotation);
	
	}
	
	public boolean roll() {
		
		return super.roll();
	}
	
	
	
}
