package exam06;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calculator	= new Calculator();
		
		// 출력하기 위해서는 변수에 담아야함
		//정사각형 의넓이
		double rectangle =calculator.areaRectangle(4);
		System.out.println("정사각형의 넓이: " 
						+ rectangle);
		
		// 직사각형의 넓이
		// 혹은 직접 출력. 
		System.out.println("직사각형의 넓이 : " 
						+  calculator.areaRectangle(3, 4));
	}

}
