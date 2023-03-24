package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	
	public static void main(String[] args) {

		Product product 	= 	new Product("ssgnote", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product product1	=  new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product product2	=  new Product("ktnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
	//	System.out.println(product.getName() + " "+ product.getId() + " "
	//			+ product.getSite() + " " + product.getPrice() + " " + product.getTax());
		
		System.out.println(product.information());
		System.out.println(product1.information());
		System.out.println(product2.information());
		
		// 가격 수정
		product.setPrice(120000);
		product1.setPrice(120000);
		product2.setPrice(120000);

		// 부가세율 변경
		product.setTax(0.05);
		product2.setTax(0.05);
		product2.setTax(0.05);
		
		System.out.println(" ============================= ");
		
		System.out.println(product.information());
		System.out.println(product1.information());
		System.out.println(product2.information());
		
		System.out.println("============================== ");
		
		/* System.out.println("상품명: " + product.getName());
		System.out.println("부가세 포함 가격: "+ (int)(product.getPrice() 
				+ product.getPrice() * product.getTax())+ "원");

		System.out.println("상품명: " + product1.getName());
		System.out.println("부가세 포함 가격: "+ (int)(product1.getPrice() 
				+ product1.getPrice() * product2.getTax())+ "원");
		
		System.out.println("상품명: " + product2.getName());
		System.out.println("부가세 포함 가격: "+ (int)(product2.getPrice() 
				+ product2.getPrice() * product2.getTax())+ "원");*/ 
		
		
		
		product.calc();
		product1.calc();
		product2.calc();
		
		
		
		
		
		/* Product[] proArr = new Product[3];
		proArr[0] = new Product("ssgnote", "갤럭시노트9", "경기도수원", 96000, 10.0);
		proArr[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		proArr[2] = new Product("ktnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		for( Product prr : proArr) {
			
			System.out.println(" ============================== ");
			System.out.println(prr.getId());
			System.out.println(prr.getName());
			System.out.println(prr.getSite());
			System.out.println(prr.getPrice());
			System.out.println(prr.getTax());
			System.out.println(" ============================== ");
		}
		
		System.out.println(product.information());

		
		System.out.println(); */
		
		// 매개변수 생성자를 이용하여 개의 객체 생성
		// 객체가 가진 필드 값 출력 확인
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05 로 변경
		// 객체가 가진 필드 값 출력 확인
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격 = 가격 + (가격 * 부가세율)

		
		
		
		
		
		//System.out.println(product.setId(""));
		
	
	
	}

}
