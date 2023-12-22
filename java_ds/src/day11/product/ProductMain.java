package day11.product;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ProductMain {
	
	private static Scanner scan = new Scanner(System.in);

	private static Product[] objectlist = new Product[20]; 
	
	private static int count = 0;

	
	/*	제품을 관리하는 프로그램 구현
	 * 	메뉴
	 * 	1. 제품 입고(제품을 판매하기 위해 다른 곳에서 제품을 구매. 추가+수정)
	 * 	2. 제품 판매(입고된 제품)
	 * 	3. 제품 수정[가격]
	 * 	4. 매출 내역 조회 - 일자별로 조회
	 * 	5. 종료
	 */
	
	/*제한: 로그인X
	 * 1. 제품 입고
	 * 	//제품을 구매(제품이름, 가격, 입고일자, 구매처)
	 * 2. 제품 판매
	 * 	//입고된 제품을 판매(제품이름, 가격)
	 * 3. 제품 수정
	 * 	//제품의 가격을 수정
	 * 4. 매출 내역 조회
	 * 
	 * 	//판매된 제품 내역 조회 */
	public static void main(String[] args) {
		
		int menu;
		do {
				//메뉴 호출
				menu();
				//메뉴 입력받기
				menu = scan.nextInt();
				//선택한 메뉴 실행
				runmenu(menu);
				
		}while(menu != 5);
		

	}

	public static void menu() {
		System.out.println("------제품관리------");
		System.out.println("-   1. 제품 입고   -");
		System.out.println("-   2. 제품 판매   -");
		System.out.println("-   3. 제품 수정   -");
		System.out.println("-  4. 매출 내역 조회 -");
		System.out.println("-  5. 프로그램 종료  -");
		System.out.println("------------------");
		System.out.print("#메뉴 선택 : ");
	}
	
	public static void runmenu(int menu) {
		
		switch(menu){
		
		case 1:
			//제품 입고
			productstorage();
			break;
		case 2:
			//제품 판매
			productsales();
			break;
		case 3:
			//제품 수정
			productupdate();
			break;
		case 4:
			//매출 내역 조회
			productsearch();
			break;
		case 5:
			//프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
				System.out.println("해당하는 메뉴가 없습니다.");
		
		}
		
		
	}
	
	private static void productsearch() {
		//매출 내역 조회
		String day = scan.next();
		for(int i = 0; i<count; i++) {
			if(objectlist[i].equals(day)) {
				objectlist[i].print();
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
		//판매됐던 제품들 정렬
		//매출 합산 출력
		
	}

	private static void productupdate() {
		//입고 된 제품의 가격 변경
		System.out.print("수정할 제품의 이름을 입력 해주세요.: ");
		String name = scan.next();
		System.out.print("수정할 가격을 입력 해주세요. : ");
		int object = scan.nextInt();
		
			for(int i = 0; i<count; i++) {
				if(objectlist[i].equals(name)) {
					objectlist[i].update(object);
					System.out.println("가격이 수정되었습니다.");
					return;
				}
			}
	}//가격 변경

	private static void productsales() {
		
		System.out.print("판매하실 제품을 입력 해주세요. : ");
		String name = scan.next();
		//입고 된 제품들의 목록 출력
		//제품 판매 시 해당 제품 삭제
		int index = -1;//음수로 초기화. 배열의 번지는 0이상
		for(int i = 0; i<count; i++) {
			if(objectlist[i].equals(name)) {
				index = i;
				//삭제된 내역을 따로 저장?
				break;
			}
		}
		//일치하는 제품이 없으면
			if(index == -1) {
				System.out.println("일치하는 제품이 없습니다.");
				return;
			}
			//저장된 제품의 개수를 1 줄임
			count--;
			
			//매출증가
			
			System.out.println("제품이 판매되었습니다.");
			if(index == count) {
				return;
				//종료
			}		
		//매출 증가	
	}

	public static void productstorage() {
		
		System.out.print("입고할 제품의 이름을 입력 해주세요. : ");
		String name = scan.next();
		
		System.out.print("입고할 제품의 가격을 입력 해주세요. : ");
		int object = scan.nextInt();
		
		System.out.print("제품의 입고 날짜를 입력 해주세요. : ");
		String day = scan.next();
		
		System.out.print("제품의 입고처를 입력 해주세요. : ");
		String sales = scan.next();
		
		Product product = new Product(name, sales, day, object);
		objectlist[count] = product;
		count++;
	}
	
}
