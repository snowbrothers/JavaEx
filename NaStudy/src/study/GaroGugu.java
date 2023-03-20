package study;

public class GaroGugu {

	public static void main(String[] args) {
		
		for(int i = 1; i <=9; i++) {
			for(int j = 2; j <=9; j++) {
				System.out.print(j + " * " + i + " = " + String.format("%2d", i * j));
				System.out.print("      ");
			}
			System.out.println();
		}

	}

}
