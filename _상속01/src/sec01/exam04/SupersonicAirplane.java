package sec01.exam04;

// 상속받음을 명시 << extends + 부모클래스
public class SupersonicAirplane extends Airplane {

	// 비행 상태를 저장 할 수 있는 필드
	public int flyMode;

	// 상수
	// 한번 정의 후 값을 변경할수 없다.
	// 대문자로 작성하고 단어를 연결할 경우 _를 붙여준다.
	// 가독성을 높이기 위한 상수 사용 / 비행모드를 숫자타입으로 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	
	// 매개변수를 받아서 flyMode 를 세팅
	public SupersonicAirplane(int flyMode) {
		
		//
		System.out.println("===== SuperSonic");
		
		if(flyMode == NORMAL 
				|| flyMode == SUPERSONIC ) {
			
			this.flyMode = flyMode;
		
		} else {
			
			flyMode = NORMAL;
		}
		
		
		
	}
	
	
	@Override
	public void fly() {
		// 부모가 가지고 있는 메서드를 자식클래스에서 재정의
		// 메서드를 재정의해도 기존에 부모가 가진 메서드를 호출 할 수 있다.
		// super.메서드명();
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행 입니다.");
		
		} else {
			// fly( ) 를 재작성 했지만 
			// 부모가 가지고 있는 메서드를 호출할 수 있다. 
			// super를 이용해서 접근
			super.fly();
		}
		
	}
	
	// 자식 객체만 가지고 있는 메서드
	public void booster() {
		System.out.println("부스터 작동 !!!!!");
	}
}
