package day04;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/*UpDown 게임을 구현하세요.
		 *  - 다음과 같은 메뉴를 가져야 합니다.
		 *  1. 새게임
		 *  2. 최고기록 확인
		 *  3. 프로그램 종료
		 *  
		 *  - 새게임은 업다운 게임을 시작
		 *   - 랜덤으로 생선된 수를 맞추는 게임
		 *   - 맞췄을 때 맞춘 횟수를 출력하고 메뉴로 돌아감
		 *  - 최고기록 확인 업다운 게임을 하면서 맞춘 횟수 중 가장 적은 
		 *  횟수를 알려줌
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int menu; //메뉴
		int count= -1, bestcount = -1; //게임 플레이 횟수, 최고기록
		int r; //랜덤한 수
		int min = 1, max =100; //랜덤 수 범위
		
		//반복문
		do {
			System.out.println("----------------------");
			 System.out.println("메뉴");
			 System.out.println("1. 새게임");
			 System.out.println("2. 최고기록 확인");
			 System.out.println("3. 프로그램 종료");
			 System.out.println("----------------------");
			 System.out.print("메뉴 선택 :");
			 
			 //메뉴출력
			 
			 menu= scan.nextInt(); //메뉴선택
			 
			 switch(menu) {
			 //선택한 메뉴에 따라 기능실행
		 
			 case 1: //1번 메뉴 선택
				 	//업다운 게임을 실행
				   //랜덤한 수 생성
				 
				 int r1 = (int)(Math.random() * (max-min+1) + min);
				 int num = min - 1;
				 count = 0;
	
				 do { //반복문
					 for( ; num != r1; ) {
							System.out.print("1~100까지의 숫자를 입력하세요. :");
							num= scan.nextInt(); //정수 입력
			
							if(num == r1) {
								System.out.println("정답");
							}
							else if(num > r1) {
								count++; //입력횟수 1증
								System.out.println("DOWN!");
							}
							else if(num < r1){
								count++;
								System.out.println("UP");
							}
					   }	System.out.println("기록 :" + count);
					 
				 }while(num != r1);
					 
				 	if(bestcount == -1 || count < bestcount) {
				 		//게임이 끝났으면 현재 횟수가 최고기록 횟수보다 좋으면
				 		 bestcount = count;
				 		 //최고 기록횟수를 현재 횟수로 수정
				 			}   break;
			
			 		case 2:
			 			
			 		if(bestcount == -1) {
			 			System.out.println("플레이한 기록이 없습니다.");
			 			break;
			 		}
			 			System.out.println("최고 기록 :" + bestcount);
			 			break;
			 			
			 		case 3:
			 			System.out.println("프로그램을 종료합니다.");
			 			
			 			break;
			 }
	    	} while(menu != 3);
	  }
}

