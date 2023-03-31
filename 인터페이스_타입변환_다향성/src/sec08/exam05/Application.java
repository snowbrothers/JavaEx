package sec08.exam05;

public class Application {

	public static void main(String[] args) {

		Driver driver = new Driver();
		

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		bus.checkFare();
		driver.drive(new Bus());
		
		System.out.println("=========================");
		
		taxi.sound();
		driver.drive(new Taxi());
	}

}
