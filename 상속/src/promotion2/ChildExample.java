package promotion2;

public class ChildExample {

	public static void main(String[] args) {


		// 자식 클래스가 부모 클래스로 자동 형변환 된 경우에
		// 자식 클래스에 있는 메서드를 사용 할 수 없다.
		
		Parent parent = new Child();
		//Child  = new Child();
		
		parent.method1();
		parent.method2();
		
		
		System.out.println(parent instanceof Child);
		
		
		
		// 강제형변환 // 변수이름(object) intstanceof 타입 // 
		if(parent instanceof Child) {
			
			Child child = (Child)parent;
		
			child.method3();
		}
			
		
			
		
	}

}
