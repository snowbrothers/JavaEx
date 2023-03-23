package calc;

public class Car {
	
	public int gas;
	
	// 생성자 생성 : gas 초기화
	public Car(int gas) {
		this.gas = gas;
		
	}
	
	// 메서드는 기능! 을 담당한다. 
	public void run1() {
		System.out.println("달립니다요 ~");
		// 내부 메서드를 호출합니다.
		stop();
		// 이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아서 실행합니다.
		sound("소보로 빵빵");
		
	}
	
	void stop() {
		System.out.println("멈추겠습니다요 ~");
	}
	
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	// boolean 타입이 반환타입으로 오는 경우 메서드의 이름이 is 가 오는 경우가 많습니
	// 기름이 0이면 false를 반환
	public boolean isLeftGas() {
		if(gas>0) {
			
			return true;
		
			
		} else {
			return false;
		}
	}
	
	public void run() {
		
		while(true) {
			if(gas > 0) {
				// gas -= 1; // gas-1
				gas--;
				System.out.println("전진 합니다.");
				System.out.println("남은 기름양: " + gas);
				
			/*	if(gas == 0) {
					return;
				} */
				
			} else {
				System.out.println("기름이 없습니다.");
				System.out.println("남은 기름양: " + gas);
			
				//break 반복문 탈출
				
				//반환타입이 void 인 경우 return 을 만나면 메서드 강제종료.
				return;
			} 
		}
	
			
		}
	
}
