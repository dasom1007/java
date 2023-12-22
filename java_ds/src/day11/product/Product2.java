package day11.product;

/* 중복된 제품명X
 * 
 */
public class Product2 {
	
	//제품명, 수량, 가격(구매가격, 기본판매가격,할인가격)
	private String name;
	private int amount, buyPrice, price, salePrice;
	
	//getter, setter, 제품정보 출력, 제품 할인금액 수정
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public void print() {
		System.out.println("제품명 : " + name + ", 수량 : "
							+ amount + ", 가격 : " + salePrice);
	}
	
	public void updateSalePrice(int price) {
		salePrice = price;
	}
	
	//생성자: 제품명, 수량, 판매금액, 구매금액이 주어진 생성자
	public Product2 (String name, int amount, int buyPrice, int price) {
	this.name = name;
	this.amount = amount;
	this.buyPrice = buyPrice;
	this.price = price;
	this.salePrice = salePrice;
	}
	
	public void updateAmount(int amount) {
		//기존 수량에 새 수량을 누적
		this.amount += amount;//this.amount = this.amount + amount;
	}
	
	public boolean equals(String name) {
		return this.name.equals(name);
	}

}
