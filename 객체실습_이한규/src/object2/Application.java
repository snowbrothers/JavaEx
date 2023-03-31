package object2;

import practice2.Product2;

public class Application {

	public static void main(String[] args) {
		
		Product2 pro = new Product2("ssg", "갤럭시노트9", "경기도수원", 960000, 10.0);
		Product2 pro1 = new Product2("lg", "LG스마트폰5", "경기도평택", 780000, 0.7);
		Product2 pro2 = new Product2("kt", "KT스마트폰3", "서울시강남", 250000, 0.3);
		
		System.out.println(pro.information()); 
		System.out.println(pro1.information());		
		System.out.println(pro2.information());
		
		
		System.out.println("=======================================");
		
		pro.setPrice(1200000);
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);


		pro.setTax(0.05);
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		
		
		System.out.println(pro.information()); 
		System.out.println(pro1.information());		
		System.out.println(pro2.information());

		
		System.out.println("=======================================");
		
	
		pro.infoPrice();
		pro1.infoPrice();
		pro2.infoPrice();
		
		
		
		
	}
	

}
