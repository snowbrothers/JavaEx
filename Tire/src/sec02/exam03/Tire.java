package sec02.exam03;

public class Tire {

	// 필드
	public int maxRotation;
	public int rotation;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	// 메소드
	public boolean roll() {

		++rotation; // 누적 회전수 1 증가

		if (rotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - rotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
