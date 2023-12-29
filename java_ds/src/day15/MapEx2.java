package day15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class MapEx2 {

	static Scanner scan = new Scanner(System.in);
	static Map<String, String> map = new HashMap<String, String>();
	
	public static void main(String[] args) {
		/* 회원을 관리하는 프로그램 작성
		 * 메뉴
		 * 1. 회원가입
		 * - 아이디와 비번만 입력
		 * - 이미 가입된 회원인지 체크(ContainsKey)
		 * 2. 회원검색
		 * - 아이디를 입력해서 회원 정보를 조회
		 * - get조회 put, get, 반복문 이용
		 * 3. 종료
		 */
		
		
		int menu = 0;
		do {
			PrintMenu();
			try {
			
			menu = scan.nextInt();
			
			RunMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
			
		}while ( menu != 3);

	}

	private static void RunMenu(int menu) {
		switch(menu) {
		
		case 1:
			abc();
			break;
		case 2:
			Search();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
				throw new InputMismatchException();		
		}
		
	}

	private static void Search() {
		System.out.println("아이디 입력 :");
		String id = scan.next();
		
		//비번을 가져옴
		String pw = map.get(id);
		
		if(pw == null) {
			System.out.println("등록되지 않은 아이디 입니다.");
			return;
		}
		System.out.println("아이디 :"+ id +" " +"비밀번호 :"+ pw);

	}

	private static void abc() {
		
		System.out.print("아이디 입력 :");
		String id = scan.next();
		
		if(map.containsKey(id)) { //if(map.get(id) != null 도 가능
			System.out.println("이미 가입된 아이디 입니다.");
			return;
		}

		System.out.print("비밀번호 입력 :");
		String pw = scan.next();
		
		map.put(id, pw);
		
		System.out.println("회원가입이 완료 됐습니다.");
		
	}

	private static void PrintMenu() {
		System.out.println("메뉴");
		System.out.println("1.회원가입");
		System.out.println("2.회원검색");
		System.out.println("3.종료");
		System.out.println("---------");
		System.out.print("메뉴 선택:");
	}

}
