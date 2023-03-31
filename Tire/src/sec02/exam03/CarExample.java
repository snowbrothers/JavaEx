package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 10; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {

			case 1:

				System.out.println("FL HankookTire로 교체");
				car.frontLeft = new HankookTire("FL", 15);
				break;

			case 2:

				System.out.println("FR KumhoTire로 교체");
				car.frontRight = new KumhoTire("FR", 13);
				break;

			case 3:

				System.out.println("BL HankookTire로 교체");
				car.backLeft = new HankookTire("BL", 14);
				break;

			case 4:

				System.out.println("BR KumhoTire로 교체");
				car.backRight = new KumhoTire("BR", 17);
				break;

			}

			System.out.println("==================================");
			;

		} // for문 중괄호

	}
}
