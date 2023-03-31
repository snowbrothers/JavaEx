package sec08.exam05;

public class Taxi implements Vehicle {

	@Override
	public void run() {

		System.out.println("택시가 달립니다.");
	}

	public void sound() {
	
		System.out.println("어디까지 가시는겨?");
	}
	}
