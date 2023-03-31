package object;

import prcatice3.Book;

public class Application {

	public static void main(String[] args) {

		
		Book book1 = new Book();
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println("book1.information : " + book1.information());
		System.out.println("book2.information : " + book2.information());
		
		
		System.out.println();
		System.out.println("book1 수정 ==============================");
		
		System.out.print("book1.information : ");
		book1.setTitle("난중일기");
		book1.setPrice(16000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("이순신");
		
		System.out.println(book1.information());
		
		System.out.println();
		System.out.println("할인된 가격으로 출력! ========================");
		
		book1.discountInfo();
		book2.discountInfo();
		
	}

}
