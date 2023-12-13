package day04;

import java.util.Scanner;

public class RockPaperScissorsEx {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 *   - 컴퓨터가 랜덤으로 내는 가위, 바위, 보와 내가 입력한 
		 *     가위, 바위, 보를 비교하여 이기면 승, 지면 패, 비기면 무로 기록
		 *   - 바위 : R, 보 : P, 가위 : S
		 * - 기록
		 *   - 승 무 패를 순서대로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		int random;
		char user, com; //사용자와 컴퓨터가 낸 가위, 바위, 보
		
		int R = 0, P = 0, S = 0;
		char 주먹 = (char)R, 보 = (char) P, 가위 = (char)S ;
		R = 1; P = 2; S = 3;
		int wincount = 0, drawcount = 0, losecount = 0;
		
		do {
			 System.out.println("----------------------");
			 System.out.println("메뉴");
			 System.out.println("1. 새게임");
			 System.out.println("2. 기록 확인");
			 System.out.println("3. 프로그램 종료");
			 System.out.println("----------------------");
			 System.out.print("메뉴 선택 :");
			 //메뉴 출력
			 
			 menu= scan.nextInt(); //메뉴 선택
			 
		switch (menu) { //메뉴에 맞는 기능 실행
		
		
			 case 1:
				 
				 random = (int)(int)(Math.random() * 3 + 1); 
				 //랜덤으로 1~3사이의 숫자를 생성
				 
				 com = random == 1 ? 'R' : (random == 2 ? 'P' : 'S');
				 //1이면 R, 2면 P, 3이면 S
				 
				 System.out.println("가위(S), 바위(R), 보(P) 입력: ");
				 user = scan.next().charAt(0);
				 
				 if( user == com) {
					    System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
						System.out.println("무승부");
						drawcount++;
				 }
				 
				 else if(   (user == 'R' && com == 'S')  
						 || (user == 'S' && com == 'P') 
						 || (user == 'P' && com == 'R')) {
					    System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
						System.out.println("유저 승");
						wincount++;
				 }
				 
				 else{
					    System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
						System.out.println("유저 패배");
						losecount++;
				 }
				 
				break;
			 
				 		
				 		
			 case 2:
				 
				 System.out.println("승리 :" + wincount + "| 패배 :" + losecount + "| 무 :" + drawcount);
				 
			 			break;
 
			 case 3:
				 System.out.println("프로그램을 종료합니다.");
				 break;
		
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
				 
		}

	}while(menu != 3);
		}
}

