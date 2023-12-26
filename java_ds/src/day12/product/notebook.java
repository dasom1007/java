package day12.product;

public class notebook extends Product {
	
	double cpu;
	int ram;

	public notebook(String brand, String name, String code, double cpu, int ram) {
		super(brand, name, code);
		this.cpu = cpu;
		this.ram = ram;
	}

	public notebook(String brand, String name, String code, double cpu) {
		super(brand, name, code);
		this.cpu = cpu;
	}
	
	@Override
	public void print() {
		System.out.println("----------------");
		System.out.println("브랜드 :" + brand);
		System.out.println("제품명 :" + name);
		System.out.println("제품코드 :" + code);
		System.out.println("CPU :" + cpu + "GHz");
		System.out.println("RAM :" + ram + "G");
		System.out.println("----------------");
		
	}

}
