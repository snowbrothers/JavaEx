package animal;

public class Cat extends Animal {

	public Cat() {
		
		this.kinds = "포유류";
	}

	
	@Override
	public void sound() {

		System.out.println("야옹");
		
	}
	
	
}
