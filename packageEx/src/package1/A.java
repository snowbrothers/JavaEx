package package1;

import package2.C;

public class A {


		C c	= new C(1);
		B b = new B();
		
		// 기능 정의 
		public void method1() {
		
		// . << 메서드, 필드 호출 
			c.method1();
			c.method2();
			
			
		}
	
	
}

class B {
	// default 일 경우 같은 패키지에서 호출 가능
	public B() {
		
		
			
		}
	
}
	
	


