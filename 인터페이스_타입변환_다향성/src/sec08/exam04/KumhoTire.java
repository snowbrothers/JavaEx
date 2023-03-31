package sec08.exam04;

// 인터페이스의 구현체는 인터페이스를 타입으로 사용 할 수 있다요!
public class KumhoTire implements Tire {

	//implements Tire  구현체
	
	@Override
	public void roll() {

		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
