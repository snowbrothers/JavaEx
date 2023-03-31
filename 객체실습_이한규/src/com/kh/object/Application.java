package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	
	public static void main(String[] args) {
		
	Product phone = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
	Product phone2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
	Product phone3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
	
	System.out.println(phone.information());
	System.out.println(phone2.information());
	System.out.println(phone3.information());
	
	System.out.println(" =========================================== ");
	
	
	phone.setPrice(1200000);
	phone2.setPrice(1200000);
	phone3.setPrice(1200000);
	
	phone.setTax(0.05);
	phone2.setTax(0.05);
	phone3.setTax(0.05);
	
	System.out.println(phone.information());
	System.out.println(phone2.information());
	System.out.println(phone3.information());
	
	System.out.println(" ============================================ ");
	
	phone.result();
	phone2.result();
	phone3.result();
	
	}
	
	
}
