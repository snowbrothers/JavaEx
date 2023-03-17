package nasa;

public class GuGuDan {

	public static void main(String[] args) {

		// 바깥 쪽 for 문
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 *** ");
		
		// 중첩 for 문	
			for (int n =1; n<=9; n++) {
			 System.out.println(m + " x " + n + " = " + (m*n));	 
		 }
		 break;
		}
	}

}
