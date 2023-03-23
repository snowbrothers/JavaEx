package staticEx;

public class StaticEx {

	// 객체를 생성해야만 사용가능하다.
	// static 이 붙어야 name 을 사용 가능하다.
	public static String name; // 인스턴스 필드! 
	
	// static >> 정적 멤버.. 프로그램 시작과 동시에 메모리에 올라간다.
	// 정적 멤버에서 사용 할 수있는 요소는 정적 멤버요소만 사용가능하다.
	
	public static void main(String[] args) {
		//StaticEx ex = new StaticEx();
		//String name = ex.name;
		
		// 초기화
		//name = "민초단";
		
		System.out.println(name);
		
	}
}
