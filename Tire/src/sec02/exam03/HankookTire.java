package sec02.exam03;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	// 메서드 오버라이딩
	@Override
	public boolean roll() {

		++rotation; // 누적 회전수 1 증가

		if (rotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: " + +(maxRotation - rotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
