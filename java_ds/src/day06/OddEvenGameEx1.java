package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {
	
	public static void main(String[] args) {
		
		//정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		Scanner scan = new Scanner(System.in);
		//int num = 10;
		int min = 1, max = 100;
		int TotalMoney = 10000; //게임시작 자금
		
		//아래 코드를 현재 금액이 0이 될 때까지 반복하도록 수정
		while(TotalMoney > 0) { //0이 되는 순간에 멈추도록
			
			//num가 1~100사이의 랜덤한 수를 생성하는 코드를 작성
			int num = (int)(Math.random() * (max-min+1)+min);
			
			//사용자가 게임에 투입할 금액을 입력하는 코드를 작성(최소 1 ~ 현재금액)
			System.out.print("게임에 투입할 금액을 입력하세요(1~"+TotalMoney+"):");
			int Money = scan.nextInt();//투입할 금액
			
			//입력받은 money가 TotalMoney보다 크면 TotalMoney로 수정
			//Money = Money > TotalMoney ? TotalMoney : Money;
			
			if(Money > TotalMoney) {
				Money = TotalMoney;
			}
			
			//사용자가 0또는 1을 입력받은 코드를 작성
			System.out.print("홀(1)/짝(0)? ");
			int user = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println(num+"은 짝수입니다.");
			}
			else {
				System.out.println(num+"은 홀수입니다.");
			}
				
			//사용자가 입력한 값이 맞았는지 틀렸는지를 출력하는 코드
			//사용자가 입력한 값이 num의 홀짝과 맞는지를 출력하는 코드
			//승이면 배팅 금액을 주고, 패이면 배팅 금액을 차감
			
			//int LostMoney = TotalMoney - Money;
			if(num % 2 == user) {
				System.out.println("사용자 승");
				TotalMoney += Money; //TotalMoney = total
				//System.out.println("현재 금액 :" + TotalMoney);
			}
			else {
				System.out.println("사용자 패배");
				TotalMoney -= Money;
				//System.out.println("현재 금액 :" + LostMoney);
			}
	
			System.out.println("현재 금액 : " + TotalMoney);
		}
		System.out.println("배팅금액이 없음으로 게임을 종료합니다.");
		scan.close();
	}
}
