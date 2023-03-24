package getter.setter;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingletonEx ex = SingletonEx.getInstance();
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		SingletonEx ex4 = SingletonEx.getInstance();
		
		
		// 참조변수의 비교는 주소값을 비교하게 됨.
		if(ex == ex1) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}

}
