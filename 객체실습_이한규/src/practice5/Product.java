package practice5;

public class Product {

	
	private String id;   // 상품 아이디
	private String name; // 상품명
	private String site; // 생산지
	private int price; // 가격
	private double tax; // 부가세 비율 
	
	
	
	
	public Product() {
		
	}

	public Product(String id, String name, String site, 
										int price, double tax) {
		
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
		
	}

	/**
	 * Product 클래스의 필드의 값을 반환 할 수 있도록
	 * getter 메서드를 사용해 반환 하는 메소드.
	 * @return
	 */
	public String information() {
		
		
		return getId() +" "+ getName() 
					+" "+ getSite() +" "+ getPrice() +" "+ getTax();
	}

	
	public String change(int price , double tax) {
	
		setPrice(price);
		setTax(tax);
		
		
		return null;
	}
	
	public int totalPrice() {
		
		int total = (int)(getPrice() + ( getPrice() * getTax()));
		
		System.out.println("상품명 = " + getName() );
		System.out.println("부가세 포함 가격 = " + total + "원");
		
		return 0;
	}
	
	
	// get, set // 
	
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
