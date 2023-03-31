package sec02.verify.exam02;

public class SnowTireExample {

	public static void main(String[] args) {

		// 객체생성
		SnowTire snowTire = new SnowTire();
		
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
	}

}
