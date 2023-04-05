package vo;

public class App {

	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		
		lib.insert(6, "책6", "작가6", false);
		
		System.out.println("출력  ==========================");
		System.out.println(lib.toString());
	}

}
