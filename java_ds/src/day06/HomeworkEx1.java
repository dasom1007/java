package day06;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요.
		 *  - 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 *  - S : 숫자가 있고, 위치가 같은 경우
		 *  - B : 숫자가 있지만 위치가 다른 경우
		 *  - O : 일치하는 숫자가 하나도 없는 경우
		 *  -3S가 되면 게임이 종료
		 *  
		 *  예시
		 *  랜덤으로 생성 된 숫자 : 3 9 1
		 *  입력 : 1 2 3
		 *  결과 : 2B
		 *  입력 : 4 5 6
		 *  결과 : O
		 *  입력 : 7 9 8
		 *  결과 : 1S
		 *  입력 : 3 1 9
		 *  결과 : 1S2B
		 *  입력 : 3 9 1
		 *  결과 : 3S
		 *  정답입니다. 
		 *  프로그램 종료
		 */
		
		int menu; //메뉴
		int count1= -1, bestcount = -1; //게임플레이 횟수, 최고기록
		
		
		//1~9까지 랜덤한 수 3개 생성
		int min = 1, max = 9;
		int r = (int)(Math.random() * (max-min+1)+min);
		
		int com[] = new int[3];//컴퓨터가 생성한 랜덤 수 3개
		int count = 0; //중복 선언
		
		int S = 0; //숫자가 있고, 위치가 같은 경우
		int B = 0; //숫자가 있지만 위치가 다른 경우
		int O; //일차하는 숫자가 하나도 없는 경우
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		
			//반복문(맞출때까지 = 내가 입력한 숫자가 3S일때까지 반복)

			
			do {
					
					menu= scan.nextInt(); //메뉴선택
					 
					 switch(menu) {
					 //선택한 메뉴에 따라 기능실행
				 
					 case 1: //1번 메뉴 선택
						 	//업다운 게임을 실행
						   //랜덤한 수 생성

				System.out.println("=================");
				System.out.println("1. 새게임");
				System.out.println("2. 기록확인");
				System.out.println("3. 프로그램 종료");
				System.out.println("=================");
				System.out.print("메뉴 선택 :");
				
				while(count < com.length); {
					
					for(i = 0; i < count; i++) {
						//중복확인
						if(com[i] == r) {
							break;
						}
					}
					if(count == i) {
						count++; //중복되지 않으면 저장 후 count 증가
					}
					
				}
				
				System.out.println("입력 : ");
					int []user = new int [3];
					//사용자가 입력한 숫자 3개를 배열에 저장
					for(i = 0; i < 3; i++) {
						user[i] = scan.nextInt(); //입력한 숫자 3개를 저장
					}
					
					for(i = 0; i < 3; i++) {
						if(user[i] == com[i]) {//사용자가 입력한 숫자와 컴퓨터가 출력한 숫자가 같은경우
							//S증가 
							S++;
						}
						
						for(i = 0; i < 3; i++) {
							for(int j = 0; j < 3; i++) {
								if(user[i] == com[j]) {
									B++;
								}
								
							}
						}
						
						 /* else if(숫자가 있지만 위치가 다른 경우) {
							//B증가
							B++; */
						}

							for(i = 0; i < user.length; i++) {
								//결과 출력
								System.out.println("결과 : "+S+"S"+B+"B");
								
								//만약 3S이면 3S출력 후 프로그램 종료
								if (S==3) {
									System.out.println("3S");
									System.out.println("정답입니다.");
									break;
									}
								}

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
					 
			}while(S==3);	

		}
}



