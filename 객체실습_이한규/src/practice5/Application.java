package practice5;

public class Application {

	
	public static void main(String[] args) {
	
		
		
		Product phone1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product phone2 = new Product("lgnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product phone3 = new Product("ktnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println("사용 데이터 출력 ==========================");
		System.out.println(phone1.information());
		System.out.println(phone2.information());
		System.out.println(phone3.information());
		
		
		// 객체의 가격을 모두 120 만원으로 변경 / 부가세율 0.05 로 변경
		
		phone1.change(1200000, 0.05);
		phone2.change(1200000, 0.05);
		phone3.change(1200000, 0.05);

		System.out.println();
		System.out.println("변경 후 출력 ===============================");
		System.out.println(phone1.information());
		System.out.println(phone2.information());
		System.out.println(phone3.information());

		System.out.println();
		System.out.println("변경 후 출력 ===============================");

		phone1.totalPrice();
		phone2.totalPrice();
		phone3.totalPrice();
		
		
		
		

		
		
	}
}
