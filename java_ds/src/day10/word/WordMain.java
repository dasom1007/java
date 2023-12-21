package day10.word;
import java.util.Scanner;

public class WordMain {
	private static Scanner scan = new Scanner(System.in);
	private static Word [] list = new Word [10]; //단어 목록 배열
	private static int count = 0; //저장된 단어 개수
	private static int WordNum = 1; //추가될 게시글 번호

	
	/*영어 단어장 프로그램을 만드세요.
	 * 1. 기능 정리
	 * - 단어는 영어 단어와 한글 뜻으로 구성
	 * - 영어 단어는 영어이고, 공백이 없는 단어
	 * - 한글 뜻은 한글이고, 문장으로 되어 있다
	 * - 한 단어에 뜻이 한개만 있다고 가정
	 * - 기능
	 * 		-단어 등록
	 * 		-단어 검색
	 * 		-단어 수정
	 * 		-단어 삭제
	 * - Word클래스
	 * 		-word : 영단어
	 * 		-meaning : 뜻
	 * 		-단어 출력, 수정, 확인(주어진 문자열과 같은 단어인지) 기능
	 * 2. 틀작성
	 * 		
	 * 3. 필요한 메서드 구현
	 */
	
	//기능 정리
	//제한: 로그인X 
	//제목과 글을 쓸 수 있는 기능
	//썼던 단어장을 조회 할 수 있는 기능
	//썼던 단어장을 수정 할 수 있는 기능
	//썼던 단어장을 삭제 할 수 있는 기능
	
	//메뉴 1선택
	/* 단어장의 제목을 입력 :
	 * 단어장의 내용을 입력 :
	 * 엔터 누르면 내용이 저장. 메인메뉴가 다시 뜸
	 */
	
	//메뉴 2선택
	/* 1. 단어장 조회
	 * 2. 단어장 수정
	 * 3. 단어장 삭제
	 * 4. 돌아가기
	 */
	//서브메뉴 1선택
	//조회할 단어장의 제목 검색 혹은 번호 검색
	//서브메뉴 2선택
	//수정할 단어장의 제목 검색 혹은 번호 검색
	/*수정할 단어장의 제목을 입력 :
	 * 수정할 단어장의 내용을 입력 :
	 * 엔터 누르면 수정한 내용으로 저장. 서브메뉴가 다시 뜸
	 */
	//서브메뉴 3선택
	//삭제할 단어장의 제목 검색 혹은 번호 검색
	/* 삭제할 단어장의 제목 입력:
	 * 정말 삭제하시겠습니까?
	 * yes or no 
	 * 만약 yes면 삭제 no면 서브메뉴 3으로 돌아감
	 */
	//서브메뉴 4선택
	//선택시 메인메뉴로 돌아감.
	
	/*case 1:
				//단어장 작성
				break;
				
			case 2:
				printsubmenu();
				//단어장 관리 //서브메뉴 호출
				int submenu = scan.nextInt(); //서브메뉴 선택
				//서브메뉴 실행
				runsubmenu(submenu);
				break;
				
			case 3:
				// 프로그램 종료
				System.out.println("프로그램이 종료 됩니다.");
				break;
				
			default:
				System.out.println("선택하신 메뉴가 없습니다.");*/
	
	/*private static void printsubmenu() {

		System.out.println("=======서브메뉴======");
		System.out.println("=   1. 단어 검색   =");
		System.out.println("=   2. 단어 수정   =");
		System.out.println("=   3. 단어 삭제   =");
		System.out.println("=   4. 돌아가기    =");
		System.out.println("==================");
		System.out.println("메뉴 선택 : ");
		
	}//서브메뉴출력 */
	/*private static void runsubmenu(int submenu) {
		switch(submenu) {
		
		case 1:
			//단어장 조회
			submenuInfo();
			break;
			
		case 2:
			//단어장 수정
			submenuupdate();
			break;
			
		case 3:
			//단어장 삭제
			submenudelete();
			break;
			
		case 4:
			//메인메뉴로 돌아가기
			break;
		default:
			System.out.println("선택하신 메뉴가 없습니다.");
		}
	}//런서브메뉴*/
	
	public static void main(String[] args) {
		
	
		int menu ;
		do {
				printmenu(); //메뉴 출력	
				menu = scan.nextInt(); //메뉴선택
				
				//선택한 메뉴 실행
				runMenu(menu);
	
		}while( menu != 5);
		
		
	}
	
	/**
	 * 메인메뉴 실행 메서드
	 */
	private static void printmenu(){
		System.out.println("=======메인메뉴======");
		System.out.println("=   1. 단어 등록    =");
		System.out.println("=   2. 단어 검색    =");
		System.out.println("=   3. 단어 수정    =");
		System.out.println("=   4. 단어 삭제    =");
		System.out.println("=   5.   종료      =");
		System.out.println("===================");
		System.out.println("#메뉴 선택 : ");
	}//메인메뉴출력
	
	
	private static void runMenu(int menu) {
		switch(menu) {
		
		case 1:
			//단어 등록
			insertword();
			break;
			
		case 2:
			//단어 검색
			searchWord();
			break;
			
		case 3:
			//단어수정
			menuupdate();
			break;
		
		case 4:
			//단어 삭제
			menudelete();
			break;
			
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:System.out.println("잘못된 메뉴 선택 입니다.");
		
	
		
		}
	} //런메뉴
	
	
	
	public static void insertword() {
		
		//String word1;
		//word1 = scan.nextLine();
			//단어, 뜻 입력 받기
			System.out.print("등록할 단어(영어)를 입력하세요 : ");
			String word = scan.next();
			System.out.print("단어의 뜻을 입력하세요 : ");
			scan.nextLine();//엔터 처리
			String meaning = scan.nextLine();
			
			//단어와 뜻을 이용하여 Word의 인스턴스를 생성
			Word tmp = new Word(word, meaning);

			//위에서 생성한 인스턴스를 단어장에 저장
			list[count] = tmp;
			
			//저장된 단어의 개수를 1증가
			++count;
			
			//테스트용) 단어장 목록 출력
			for(int i = 0; i<count; i++) {
				list[i].print();
			}
			
			//단어장이 꽉 차면 단어장 크기를 늘림
			if(count == list.length) {
				expendWordList();
			}
			
			if(count<list.length) {
				return;
			}
	}//단어추가
	
	public static void expendWordList() {
		//기존 단어장보다 큰 단어장 생성
		Word[] tmpList = new Word[list.length + 10];
		
		//새 단어장에 기존 단어들을 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
		
		//새 단어장을 내 단어장이라고 선언
		list = tmpList;
	}//단어장 늘리기
	
	
	public static void searchWord() {
		System.out.println("검색할 단어를 입력하세요. :");
		//조회할 단어장 제목이나 번호 입력
		String word = scan.next();
			//반복문 for
			for(int i = 0; i<count; count++) {
				if(list[i].equals(word)) {
					list[i].print();
					return;
				}
			}
			System.out.println("일치하는 번호가 없습니다.");

	}//1 단어장 조회
	
	public static void menuupdate() {
		System.out.println("수정할 단어를 입력하세요. :");
		String word = scan.next();
		System.out.println("수정할 단어의 뜻을 입력하세요. :");
		scan.nextLine();
		String meaning = scan.nextLine();
		
		for(int i = 0; i<count; i++) {
			//반복문 for 배열 선언
				//단어장Word배열과 일치하는 번호가 있으면 
			if(list[i].equals(word)) {
				//수정된 내용으로 저장
				list[i].update(word, meaning);
				//출력
				return;
			}
		}
		System.out.println("해당하는 단어가 없습니다.");
		
	}//2 단어장 수정
	
	public static void menudelete() {
		System.out.println("삭제할 단어장의 번호를 입력하세요. :");
		//삭제할 단어장 제목이나 번호 입력
		int num = scan.nextInt();
		int index = -1;
		
		for(int i = 0; i<count ; i++ ) {
			
			//단어장Word배열(list)과 일치하는 번호가 있으면 저장
			if(num == list[i].getNum()) {
				index = i;
				break;
			}
		}
			
			if(index == -1) {//없으면 빠져나오고
				System.out.println("일치하는 게시글이 없습니다.");
				return;
			}
			count--;
			
			if(index == count) {
				return;
			}
		}//4단어 삭제
		
	}
	
	


