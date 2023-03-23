package calc;

public class Calculator {

	// true : 켜짐 , false : 꺼짐
	boolean powerOn; // 초기값 : false

	/**
	 * 
	 * 전원을 키거나 끄는 역할
	 */

	public void powerOn() {

		
		if (powerOn) {
			powerOn = false;
			System.out.println("계산기를 종료 합니다.");
			
		} else {
			
			System.out.println("계산기를 실행 합니다.");
			powerOn = true;
		}
	}

	public int add(int num1, int num2) {
		if (powerOn) {

			return num1 + num2;
			
		} else {
			System.out.println("계산기를 실행 해주세요");
			return 0;
		}
	}
	
	// 타입이 다르기 때문에 쓸수 있음
	/**
	 * 배열 메서드
	 * @param numbers
	 * @return
	 */
	
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
}
		
		// 배열로 들어온다
	
		// 배열 생성하지 않고 	값의 목록만 넘겨주는 방식
		public int addFn(int ... numbers) {
			
			int sum = 0;
			
			for(int num : numbers) {
				sum += num;
			}
			return sum;
			
			
		}
		
	}



	
