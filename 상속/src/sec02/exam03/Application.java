package sec02.exam03;

public class Application {

	public static void main(String[] args) {

		Car car = new Car(); // 객체 생성

		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			
			switch (problemLocation) {
			
			case 1:
				
				System.out.println("FL 한국타이어로 교체");
				car.fl = new HankookTire("fl", 15);
				
				break;

			case 2:
				System.out.println("FR 한국타이어로 교체");
				car.fr = new KumhoTire("fr", 13);
				break;

			case 3:
				System.out.println("BL 한국타이어로 교체");
				car.bl = new HankookTire("bl", 14);
				break;

			case 4:
				System.out.println("BR 금호타이어로 교체");
				car.br = new KumhoTire("br", 17);
				break;
				
				

			}
			
			System.out.println("============================================ ");
		}

	}

}
