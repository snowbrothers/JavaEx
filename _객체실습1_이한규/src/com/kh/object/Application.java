package com.kh.object;

import com.kh.object.parctice.Product;

public class Application {

	public static void main(String[] args) {
		
		// 매개변수 생성자를 이용하여 3 개의 객체 생성 후 출력
	Product pro	= new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
	Product pro1	= new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
	Product pro2 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
	
	System.out.println(pro.information());
	System.out.println(pro1.information());
	System.out.println(pro2.information());
	
	System.out.println("========================================= ");
	
	
	
	
	
		// setter 메소드를 이용하여 값 수정 후 출력
	pro.setPrice(1200000);		
	pro1.setPrice(1200000);		
	pro2.setPrice(1200000);
	
	pro.setTax(0.05);
	pro1.setTax(0.05);
	pro2.setTax(0.05);
	
	pro.dataprint();
	pro1.dataprint();
	pro2.dataprint();
	
	
	System.out.println("========================================= ");
	
	// getter 메소드를 이용하여 부가세 포함 상품 가격 출력

	pro.data();
	pro1.data();
	pro2.data();
	
		
	}

}
