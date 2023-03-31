package execeptionEx;

public class NullPointerException {

	public static void main(String[] args) {
	
		// String 은 참조타입  << null 값 가질 수 있다. 참조하고있는 객체가 없다.
		String str = null;

		// 코드상에서는 오류가 발생하지 않지만 실행하면 오류발생 ! 
		str.toString();
	
	}
}
