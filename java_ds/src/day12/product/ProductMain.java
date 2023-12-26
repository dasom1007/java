package day12.product;

import java.util.Scanner;

public class ProductMain {
	/*	제품을 추가하는 프로그램 작성
	 *  제품은 Tv, 에어컨, 노트북만 추가 가능
	 *  공통: 브랜드, 제품코드, 제품명
	 *  Tv: 화명크기
	 *  에어컨 : 냉방면적
	 *  노트북: CPU, 램
	 *  
	 *  Tv클래스, 에어컨 클래스, 컴퓨터 클래스
	 *  Product 클래스
	 *  
	 *  메뉴
	 *  1. 제품 추가
	 *  2. 제품 확인
	 *  3. 종료
	 *  메뉴 선택 : 1
	 *  ----
	 *  추가할 제품을 선택 하세요
	 *  1. Tv
	 *  2. 에어컨
	 *  3. 노트북
	 *  제품 선택 : Tv
	 *  ----
	 *  브랜드 : 삼성
	 *  제품코드 : 32412354
	 *  제품명 : 어쩌고~
	 *  화면크기(cm) : 189
	 *  등록이 완료 됐습니다.
	 *  ---- 	
	 *  메뉴
	 *  1. 제품 추가
	 *  2. 제품 확인
	 *  3. 종료
	 *  메뉴 선택 : 1
	 *  ----	
	 *  추가할 제품을 선택 하세요
	 *  1. Tv
	 *  2. 에어컨
	 *  3. 노트북
	 *  제품 선택 : 에어컨
	 *  ---- 
	 *  브랜드 : 삼성
	 *  제품코드 : 32412354
	 *  제품명 : 어쩌고~
	 *  냉방면적(m2) : 56.9
	 *  등록이 완료 됐습니다.
	 *  ---- 	*/
	
	private static Scanner scan = new Scanner(System.in);
	static Product [] list = new Product[30];
	static int count = 0;
	
	public static void main(String[] args) {

		
		int menu;
		do {
			 menuPrint();
			 
			 menu = scan.nextInt();
			
			 runmenu(menu);
			
		}while(menu != 3);
	}
	

	private static void runmenu(int menu) {
		switch(menu) {
		
		case 1:
			insertProduct();
			break;
		case 2:
			printProduct();
			break;
		case 3:
			System.out.println("프로그램 종료!");
			break;
		default :
			System.out.println("잘못된 메뉴입니다.");
		
		}
		
	}




	private static void insertProduct() {
		//제품 목록 출력
		printProductTitle();
		
		//공통 정보
		int select = scan.nextInt();
		System.out.println("브랜드 :");
		scan.nextLine();
		String brand = scan.nextLine();
		
		System.out.println("제품명 :");
		scan.nextLine();
		String title = scan.nextLine();
		
		System.out.println("제품코드 :");
		scan.nextLine();
		String code = scan.next();
		
		//제품마다 추가 정보 입력 후 인스턴스 생성 후 추가
		switch(select) {
		
		case 1://Tv
			System.out.print("화면크기 :");
			int size = scan.nextInt();
			list[count++] = new Tv(brand, code, title, size);
			break;
			
		case 2://에어컨
			System.out.println("냉방면적 :");
			double area = scan.nextDouble();
			list[count++] = new Aircon(brand, code, title, area);
			break;
			
		case 3://노트북
			System.out.println("CPU :");
			double cpu = scan.nextDouble();
			System.out.println("램 :");
			int ram = scan.nextInt();
			list[count++] = new notebook(brand, code, title, cpu, ram);
			break;
		default:
			System.out.println("잘못된 제품입니다.");
			return;
		}
		System.out.println("등록이 완료됐습니다.");
		}
		
	public static void printProductTitle() {
		System.out.println("제품 목록");
		System.out.println("1. Tv");
		System.out.println("2. 에어컨");
		System.out.println("3. 노트북");
		System.out.println("제품 선택 :");
		
	}
	
	
	
	public static void menuPrint() {
		System.out.println("--------------");
		System.out.println("1. 제품 추가");
		System.out.println("2. 제품 확인");
		System.out.println("3. 종료");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
	}
	

	private static void printProduct() {
		if(count == 0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i = 0; i < count; i++) {
			list[i].print();
		}
	}
}
	
	/*	
		System.out.println("--------------");
		System.out.println("추가할 제품 선택");
		System.out.println("1. Tv");
		System.out.println("2. 에어컨");
		System.out.println("3. 컴퓨터");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
		
		int menu2 = scan.nextInt();
		
		switch(menu2) {
		
		case 1:
			String brand;
			System.out.println("브랜드 : ");
			brand = scan.next();
			
			String name;
			System.out.println("제품명 : ");
			name = scan.next();
			
			String code;
			System.out.println("제품코드 : ");
			code = scan.next();
			
			int cm;
			System.out.println("화면크기 : ");
			cm = scan.nextInt();
			
			System.out.println("등록이 완료 됐습니다.");
			break;
			
		case 2:
			
			System.out.println("브랜드 : ");
			brand = scan.next();
			
			System.out.println("제품명 : ");
			name = scan.next();
			
			System.out.println("제품코드 : ");
			code = scan.next();
			
			int m2;
			System.out.println("냉방면적 : ");
			m2 = scan.nextInt();
			
			System.out.println("등록이 완료 됐습니다.");
			break;
		}
		
	}*/





