package com.kh.object.practice;

public class Product {

	private String id; // 상품 아이디
	private String name; // 상품명
	private String site; // 생산지
	private int price;  //가격 
	private double tax; // 부가세비율
	
	
	public Product() {
	
	}
	
	public Product(String id, String name, String site,
			int price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.site = site;
		this.tax = tax;
		
	}
	
	/**
	 * 
	 * 모든 필드의 정보를 출력합니다.
	 * @return
	 */
	
	public String information() {
		return getId() +" "+ getName()  +" "+ getSite() +" "+ getPrice() +" "+ getTax();
		
		// String information = getName() + " "+ getId() + " "
		//		+ getSite() + " " + getPrice() + " " + getTax();
		
		//return information;
	}
	/**
	 * 
	 * 가격을 계산하고 출력합니다.
	 * 
	 */
	public void calc() {
		System.out.println("상품명: " + getName());
		
		int res = (int)(getPrice() + (getPrice()*getTax()));
		System.out.println("부가세 포함 가격: " + res + "원");
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
}

