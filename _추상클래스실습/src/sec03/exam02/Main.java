package sec03.exam02;

public class Main {

	public static void main(String[] args) {

		Animal cat = new Cat(); 
		Animal dog = new Dog();
		
		System.out.println("고양이 " + cat.kind);
		System.out.println("강아지 " + dog.kind);
		
		System.out.println("===================================== ");
		cat.sound();
		dog.sound();
		
		cat.print(cat);
		
	}

}
