package nasa;

public class _3Operator {

	public static void main(String[] args) {

		int score = 85;
		char grade = (score > 90)? 'A' : ((score) > 80) ? 'B' : 'C' ;
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		double bmi = 22.5;
		String str = (bmi < 18.5)? "저체중 입니다." : ((bmi) <= 22.9) ? "정상입니다." : " 과체중 입니다.";
		System.out.println("당신의 비만도는 " + str);
		
		int value = 356;
		System.out.println(value - 56);
		
		
		// float 타입 0.1 은 정확하게 0.1 로 값이 나오지 않기 때문에  false 값이 나온다.
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10% 입니다.");
		} else {
			System.out.println("10%가 아닙니다");
		}
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
	}

}
