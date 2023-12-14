package day05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		/* 로또 당첨 번호를 랜덤으로 생성한 후
		 * (당점번호 6자리 + 보너스 번호)
		 * 사용자가 로또번호를 입력하면
		 * (로또번호 6자리)
		 * 당첨 등수를 출력하는 코드 작성
		 */
		
		
		int min = 1, max = 45;
		int tmp[] = new int[7];
	
		int count = 0;
		
		//7개짜리 배열을 만들어 로또 당첨 번호를 램덤으로 생성 - 1번 배열
		
		while(count < tmp.length) {
			
			int r = (int)(Math.random() * (max-min+1) +min);

			int i;
			for(i = 0; i < count; i++) {
				if(tmp[i] == r) {
					break;
				}
			}
			if(i == count) {
				tmp[count++] = r;
			}
		}

				//위에서 생성한 배열 중 0번지부터 6개를 새로운 배열에 복사 - 2번 배열
				int [] lotto = new int[7];
				System.arraycopy(tmp, 0, lotto, 0, 6);
		
				//1번 배열 6번지에 있는 값을 보너스로 지정 - 보너스 번호
				int bonus = tmp[6];
		
				
				//2번 배열 정렬 후 출력
				Arrays.sort(lotto);
					System.out.print("이번 주 당첨 번호 : " );
						for(int i = 1; i < lotto.length; i++) {
							System.out.print(lotto[i] + " ");
						}
						
					System.out.println(" [" + bonus + "]");
			
				//사용자 번호를 입력(6개)해서 배열에 저장 = 3번 배열
				Scanner scan = new Scanner(System.in);
				int []user = new int[6];
				
				System.out.println("본인의 로또번호를 적으세요 :");
					for(int i = 0; i<6; i++) {
						user[i] = scan.nextInt();  }

				//당첨 개수 확인
				int sameCount = 0;
					for(int i = 0; i<lotto.length; i++) {
						for(int j = 0; j<user.length; j++) {
							if(lotto[i] == user[j]) {
									sameCount++;
									break;
									}
								}
							}
						
		
				//당첨 개수에 따른 등수를 출력
					switch(sameCount) {
					case 6:
						System.out.println("1등!");
						break;
					case 5:
						int i;
						//사용자가 입력한 번호에 보너스와 일치하는 번호가 있는지 확인
						for(i=0; i<user.length; i++) {
							if(bonus == user[i]) {
								break; //중복체크
							}
						}
						//보너스번호와 일치하는 번호가 없으면
						if( i == user.length) {
							System.out.println("3등!");
						}
						else {
							System.out.println("2등!");
						}
						break;
					case 4:
						System.out.println("4등!");
						break;
					case 3:
						System.out.println("5등!");
						break;
					default:
						System.out.println("꽝!");
					}
		
	}
}
	

		

		
		/*
		int min = 1, max = 45;
		int lotto[] = new int[6];
		int lottobonus[] = new int[1];
		int count = 0;
		int count2 = 0;
		//랜덤으로 중복되지 않은 6개의 수를 생성
		
		
			while(count < lotto.length) {
				int r = (int)(Math.random() * (max-min+1) +min);

				int i;
				for(i = 0; i < count; i++) {
					if(lotto[i] == r) {
						break;
					}
				}
				if(i == count) {
					lotto[count++] = r;
				}
			}
			
			//랜덤으로 보너스 번호 하나 출력
			
			while(count2 < lottobonus.length) {
				int r2 = (int)(Math.random() * (max-min+1) +min);

				int i;
				for(i = 0; i < count2; i++) {
					if(lottobonus[i] == r2) {
						break;
					}
				}
				if(i == count2) {
					lottobonus[count2++] = r2;
				}
			}

		//정렬
			Arrays.sort(lotto);	
		//출력
			for(int i = 0; i < lotto.length && i < lottobonus.length; i++) {
				System.out.print((lotto[i] + " ") + "+" + lottobonus[i]);//+보너스번호
			}
			
			//사용자가 로또번호 6자리를 입력
			//만약 당첨번호와 1개 중복되면 6등 2개 중복되면 5등 ... 전부 중복 1등
			//중복되지 않으면 당첨되지 않았습니다. 출력
			*/
			


