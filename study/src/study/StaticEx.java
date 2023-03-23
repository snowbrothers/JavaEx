package study;

public class StaticEx {

	static String case1 = "변덕규";
		
	/* public StaticEx(String case1) {
		this.case1 = case1;
		case1 = "변덕규";
	}*/
	
	public static void main(String[] args) {
		
	 //정적 필드의 case1 을 선언했기 때문에 main 메소드에서 바로 실행이 가능	
	 //StaticEx staticEX = new StaticEx("변덕규");
	 
	 
	 //System.out.println(staticEX.case1);	
	 
	 
		System.out.println(case1);
	}
}
