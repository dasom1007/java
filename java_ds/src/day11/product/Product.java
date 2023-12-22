package day11.product;

public class Product {

	String name, day, sales; //제품 이름, 입고 날짜, 구매처
	int object; //제품의 가격
	private int num;
	public static int count = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public int getObject() {
		return object;
	}
	public void setObject(int object) {
		this.object = object;
	}
	public void update(int object2) {
		// TODO Auto-generated method stub
		
	}
	
	public void print() {
		System.out.println("판매 내역 : "+"총 매출 :");
		
	}
	
	/** 생성자 
	 * @param wordNum */
	//주어진 단어와 뜻으로 단어와 뜻을 초기화 하는 생성자
    public Product (String name, int amount, int buyPrice, int object) {
    	this.num = ++count;
    	this.name = name;
    	this.day = amount;
    	this.sales = buyPrice;
    	this.object = object;
    }

}
