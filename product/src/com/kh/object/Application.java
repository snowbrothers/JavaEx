package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {

		// 매개변수 생성자를 이용하여 3개의 객체 생성
		// 객체가 가진 필드 값 출력 확인
		
		Product pro = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 96000, 10.0);
		Product pro1 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 78000, 0.7);
		Product pro2 = new Product("ktnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(pro.information());
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		
		System.out.println(" =================================== ");
		
		
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		// 객체가 가진 필드 값 출력 확인
		pro.setPrice(1200000);
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		
		pro.setTax(0.05);
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		
		System.out.println(pro.information());
		System.out.println(pro1.information());
		System.out.println(pro2.information());		
		
		System.out.println(" =================================== ");
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격 = 가격 + (가격 * 부가세율)
		
		pro.result();
		pro1.result();
		pro2.result();
		
		
		
		
	}

}
