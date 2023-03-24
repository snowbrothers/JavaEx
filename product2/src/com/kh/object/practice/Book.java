package com.kh.object.practice;

public class Book {

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명

	public Book() {
		this(null, 0, 0.0, null);
	}
	
	public Book(String title, int price, double discountRate, 
			String author) {
		
		this .title = title;
		this .price = price;
		this .discountRate = discountRate;
		this .author = author;
		
	}
	
	public String information() {
		return null;
	}

	public void info() {
		System.out.println(getTitle() +"\t"+ getPrice() 
				+"\t"+ getDiscountRate() +"\t"+ getAuthor());
	}
	
	public int disc() {
		System.out.println("도서명 = " + getTitle());
		
		int res = getPrice() - (int)((getPrice() * getDiscountRate()));
		
		
		return res;
	}
	
	// get / set
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
