package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	// 메서드 오버라이딩
	@Override
	public boolean roll() {

		++rotation; // 누적 회전수 1 증가

		if (rotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: " + +(maxRotation - rotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}