package singleton;

public class SingletonMain {

	public static void main(String[] args) {

		SingletonEx obj1 = SingletonEx.getInstance();
		SingletonEx obj2 = SingletonEx.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}

	}

}
