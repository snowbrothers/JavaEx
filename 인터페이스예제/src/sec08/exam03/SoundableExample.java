package sec08.exam03;

public class SoundableExample  {

	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	
	public static void main(String[] args) {
		
		
		// 정적멤버 바로 호출 가능
		// 글씨가 기울어진 것은 Static 이기때문에!
		printSound(new Cat());
		printSound(new Dog());
	}

}
