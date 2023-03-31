package sec02.exam03;

// 차바퀴!
public class Tire {

	// 필드 >> 속성
	
	public int maxRotation;  // 최대회전수
	public int accumulatedRotation; // 누적회전수
	public String location; // 바퀴의 위치
	
	
	// 생성자 >> 객체의 값을 초기화 하는 역할.
	
	public Tire(String location, int maxRotation) {
		
		this.location = location;
		this.maxRotation = maxRotation;
		
		
	}
	
	
	
	// 메서드 >> 클래스의 기능을 정의
	
	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + 
										(maxRotation-accumulatedRotation) + "회");
		return true;
		} else {
			
			System.out.println("*** " + location + " Tire 펑크 ***");
		return false;
		}
		
		
	}
	
	
	
}
