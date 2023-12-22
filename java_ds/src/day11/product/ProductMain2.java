package day11.product;

import java.util.Scanner;

import day10.word.Word;

public class ProductMain2 {
	
	private static Scanner scan = new Scanner(System.in);
	private static Product2[] list = new Product2[10];
	private static Product2[] saleList = new Product2[10];
	private static int count = 0;
	private static int salecount = 0;
	
	public static void main(String[] args) {
		
		int menu;
		//반복문 : 프로그램 종료 선택 전까지
		do {
			//메뉴 출력
			printmenu(menu);
			//메뉴 선택
			menu = scan.nextInt();
			//선택 메뉴에 맞는 기능 실행
			runmenu();
		}while(menu != 5);
		//프로그램 종료 안내 문구
		System.out.println("프로그램을 종료합니다.");
	}

	private static void printmenu(int menu) {
		System.out.println("------제품관리------");
		System.out.println("-   1. 제품 입고   -");
		System.out.println("-   2. 제품 판매   -");
		System.out.println("-   3. 제품 수정   -");
		System.out.println("-  4. 매출 내역 조회 -");
		System.out.println("-  5. 프로그램 종료  -");
		System.out.println("------------------");
		System.out.print("#메뉴 선택 : ");
		
	}

	private static void runmenu() {
	
		
		switch(menu) {
		
		case 1:
			//제품 입고
			storeProduct();
			break;
		case 2:
			//제품 판매
			saleProduct();
			break;
		case 3:
			//제품 수정
			updateProduct();
			break;
		case 4:
			//매출 내역 조회
			printSaleList();
			break;
		case 5:
			//프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
				System.out.println("해당하는 메뉴가 없습니다.");
		
		}
		
	}

	private static void printSaleList() {
		//매출 내역 조회
		//반복문 : 전체 매출 내역 조회
		for(int i = 0; i < salecount; i++) {
			//판매 제품 정보 출력
			saleList[i].print();
		}
	}

	private static void updateProduct() {
		//제품명 입력
		System.out.println("제품명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		//제품 할인 금액 입력
		System.out.println("금액 : ");
		int salePrice = scan.nextInt();
		
		//일치하는 제품의 할인 금액을 수정
		//반복문 : 등록된 제품 전체
		for(int i = 0; i<count; i++) {
		
			//제품의 이름과 제품명이 같으면
			if(list[i].equals(name)) {
				//제품의 할인 금액을 수정 후 종료
				list[i].updateSalePrice(salePrice);
				return;
			}
		}
				//일치하는 제품이 없다고 출력
		System.out.println("일치하는 제품이 없다고 출력");
	}

	private static void saleProduct() {
		
		//등록 제품 목록을 출력
		
		//반복문 : 등록된 제품 전체
		for(int i = 0; i < count; i++) {
			//제품 정보를 출력
			list[i].print();
		}
		
		//제품명 입력
		System.out.println("제품명 : ");
		scan.nextLine();//엔터처리
		String name = scan.nextLine();
		
		//판매 개수를 입력
		System.out.println("판매 수량 : ");
		int amount = scan.nextInt();
		
		//기존 제품 수량을 변경
		//반복문 : 등록된 제품 전체
		int index = -1;
		for(int i = 0; i < count; i++) {
			//제품의 제품명과 판매한 제품명이 같으면 
				if(list[i].equals(name)) {
				//번지를 index에 저장
				index = i;
				}
			}
		
			//일치하는 제품이 없으면
		if(index == -1) {//index가 안 바뀌었으니 일치하는 제품이 없음
				//메서드 종료
			System.out.println("일치하는 제품이 없습니다.");
			return;
		}
		
			//제품 수량이 입력한 제품 수량보다 작으면
		if(list[index].getAmount() < amount) {
				//수량이 잘못됐다고 출력
			System.out.println("수량을 확인하세요.");
				//메서드 종료
			return;
		}
		
			//제품 수량을 변경
		list[index].updateAmount(-amount);//판매니 -
		
			//매출 내역을 위해 판매 제품 리스트에 추가
			//제품 명과 입력된 제품 수량을 이용하여 인스턴스를 생성
			Product2 tmp = new Product2(name, amount,
						list[index].getBuyPrice(), 
						list[index].getSalePrice());
			//생성된 인스턴스를 판매 제품 리스트에 추가
			saleList[salecount] = tmp; //list[count]로 하면 동일하게 바뀜
			//핀매 횟수를 1증가
			salecount++;
			System.out.println("판매가 등록되었습니다.");
		}
		//매출 내역을 위해 판매 제품 리스트에 추가
		
	

	private static void storeProduct() {
		//제품 정보를 입력
		System.out.println("제품명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.println("수량 : ");
		int amount = scan.nextInt();
		
		System.out.println("구매 가격");
		int buyPrice = scan.nextInt();
		
		System.out.println("판매 가격");
		int price = scan.nextInt();
		
		//일치하는 제품 정보가 있으면 수량을 누적
		for(int i = 0; i < count; i++) {
			if(list[i].equals(name)) {
				list[i].updateAmount(amount);
				return;
			}
		}
			//없으면 추가
			list[count] = new Product2(name, amount, buyPrice, price);
			count++;
		
			//배열이 다차면 확장
			if(count == list.length) {
				list = expandList(list);
			}
	}
	
		/** 주어진 list를 확장하는 메서드
		 * @param list 확장할 메서드
		 * @return 주어진 list에 크기 10만큼 늘어난 리스트를 반환 */
		public static Product2[] expandList(Product2[] list) {
			
			Product2[] tmpList = new Product2[list.length + 10];
			System.arraycopy(list, 0, tmpList, 0, list.length);
			return tmpList;
		}


}

