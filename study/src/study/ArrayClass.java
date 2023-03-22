package study;

public class ArrayClass {

	public static void main(String[] args) {
		// 배열선언
		int[] array = {1, 5, 3, 8, 2};
		// max // 1
		int max = array[0]; // 1
		
		// 반복문   // i = 1 length = 5 
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
				System.out.println("max: " + max);
	}

}
