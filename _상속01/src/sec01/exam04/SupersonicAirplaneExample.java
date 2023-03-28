package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane superSonic = new SupersonicAirplane(SupersonicAirplane.NORMAL);

		// 이륙합니다 슈웅
		superSonic.takeOff();

		superSonic.fly();

		// 재정의된 자식클래스의 메소드
		superSonic.flyMode = SupersonicAirplane.SUPERSONIC; // 상수필드의 사용
		superSonic.fly();

		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();

		// 착륙
		superSonic.land();

	}

}
