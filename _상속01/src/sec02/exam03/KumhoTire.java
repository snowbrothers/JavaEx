package sec02.exam03;

public class KumhoTire extends Tire {

	
		// 자식클래스
	
		public KumhoTire(String location, int maxRotation) {
			// 부모가 가진 생성자를 호출
			// 생성자를 만들면 기본생성자가 생성되지 않습니다.
			
			super(location ,maxRotation + 2);
			
		}
	
		@Override
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
