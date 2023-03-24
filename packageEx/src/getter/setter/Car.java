package getter.setter;

public class Car {

	
	private int speed;
	private boolean stop;

	
	public int getSpeed() {
		// 필드값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		// 필드의 값을 변경한다. !! 유효하지 않은 값은 변경하지 않는다.
		// 검증 후 값을 변경
		if(speed > 0) {
			this.speed = speed;
			
		}else {
			this.speed = 0;
		}
	}
	// boolean 타입의 경우 is 로 시작 >> boolean 값을 반환한다.
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop) {
		 this.setSpeed(0);
		}
		
		this.stop = stop;
	}
	
	
	
}
