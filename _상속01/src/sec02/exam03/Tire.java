package sec02.exam03;

public class Tire {
	// 부모클래스

	// 최대회전수 
	// 타이어가 생성될 때 매개변수에 의해 초기화 된다.
	public int maxRotation;  // 최대 회전수
	
	// 누적회전수
	public int rotation; // 누적 회전수
	
	// 타이어의 위치
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation){
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	/**
	 * 타이어 1회전 - rotation 1 증가 
	 * 1번 실행 할때마다 누적 회전수를 증가시킵니다.
	 * 만약 maxRotation(최대회전수보다 크면 false를 리턴 합니다.
	 * @return
	 */
	public boolean roll() {
	
		rotation++; // 타이어 1회전
		System.out.println(location + "누적 회전수 : " + rotation);
		System.out.println(location + "최대 회전수 : " + maxRotation);
		System.out.println("------------------------------");
		
		if(maxRotation <= rotation) {
			
			// 바퀴 교체해야 한다고 알림.
			return false;
		}
		
		return true;
	}
	
}
