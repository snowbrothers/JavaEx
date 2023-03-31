package promotion;



	// 부모 타입으로 자동타입변환(Promotion) 된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근이 가능하다.
	
	
	
	class A {}
	
	class B extends A {}
	class C extends A {}
	
	class D extends B {}
	class E	extends C {}
	
	public class Promotion {
		
		public static void main(String[] args) {
			
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;
			
			B b1 = d;
			C c1 = e;
		
		
			// B b3 = e; // 컴파일 에러 발생
			//C c2 = d;
		}
	}


