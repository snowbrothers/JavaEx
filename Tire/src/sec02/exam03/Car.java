package sec02.exam03;

public class Car {

	// 필드
	Tire frontLeft = new Tire("FL", 6);
	Tire frontRight = new Tire("FR", 2);
	Tire backLeft = new Tire("BL", 3);
	Tire backRight = new Tire("BR", 4);

	// 생성자
	// 메소드

	int run() {

		System.out.println("[자동차가 달립니다]");

		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}

		return 0;

	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
