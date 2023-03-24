package package2;

public class C {
	
		
		// Calender 
	private C(){
		
		// B b	= new B();
	}
	
	public C(int i){
		this();
	}
	
	public void method1() {
		C c = new C();
		System.out.println("method1");
		method2();
		
		
	}
	
	// 경고 발생
	
// private <<  외부에서 접근 불가.
	public void method2() {
		System.out.println("method2");
	}
	
}
