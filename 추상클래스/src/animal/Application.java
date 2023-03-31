package animal;

public class Application {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		
		System.out.println("=====================");
		
		
		animalSound(new Cat());
		animalSound(new Dog());
		
		
		
		
	}

	public static void animalSound(Animal ani) {
		
		ani.sound();
	}

}
