package day12.product;

public abstract class Product {
	String brand, name, code;
	
	public Product(String brand, String name, String code) {
		this.brand = brand;
		this.name = name;
		this.code = code;
	}
	
	public abstract void print(); {
	
}
}

