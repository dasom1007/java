package day06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+, -, *) 문제를 생성하여 맞추는 게임
		 * 단, 숫자 범위는 1~99, 연산자는 +, -, *
		 * 1 + 2 = 3(입력된 값)
		 * 정답입니다
		 * 
		 * 2 * 3 = 5
		 * 틀렸습니다.
		 */
		
		Scanner scan = new Scanner(System.in);

		//정수1을 랜덤으로 생성 - 1~99
		//정수2를 랜덤으로 생성 - 1~99
		//정수3(연산자)를 랜덤으로 생성 - 1~3
		
		int min = 1, max = 99;
		int a = (int)(Math.random() * (max-min+1)+min);
		int b = (int)(Math.random() * (max-min+1)+min);
		int op = (int)(Math.random() * 3 + 1);
		
		switch(op) {
			//연산자가 1이면
		case 1:
				//정수1 + 정수2 = 을 콘솔에 출력
				System.out.print(a + "+" + b + " = " );
				//정답을 입력
				int num = scan.nextInt();
				//입력받은 정답과 정수1+정수2가 같으면 정답이라고 출력
					if(num == a + b) {
						System.out.println("정답입니다.");
					}
				//아니면 틀렸다고 출력
					else {
						System.out.println("오답입니다.");
					}
					break;
				
			//연산자가 2이면
		case 2:	
				//정수1 - 정수2 = 을 콘솔에 출력
				System.out.print(a + "-" + b + " = ");
				//정답을 입력
				num = scan.nextInt();
				//입력받은 정답과 정수1-정수2가 같으면 정답이라고 출력
					if(num == a - b) {
						System.out.println("정답입니다.");
					}
				//아니면 틀렸다고 출력
					else {
						System.out.println("오답입니다.");
					}
					break;
		
			//연산자가 3이면
		case 3:
				//정수1 * 정수2 = 을 콘솔에 출력
				System.out.print(a + "*" + b + " = ");
				//정답을 입력
				num = scan.nextInt();
				//입력받은 정답과 정수1*정수2가 같으면 정답이라고 출력
					if(num == a * b) {
						System.out.println("정답입니다.");
					}
				//아니면 틀렸다고 출력
					else {
						System.out.println("오답입니다.");
					}				
					break;
		default:
			System.out.println("잘못된 연산자입니다.");
			/*
		//a (+, -, *) b 식이면 랜덤 정수 a, b / 랜덤 문자 연산자 선언
		//a, b 의 숫자 범위 정수로 선언
		
	
		//랜덤생성 코드
		int r = (int)(Math.random() * (max-min+1)+min);
		//char r1 = 연산자 문자를 랜덤으로 생성하는 코드;
		a = r; b = r;
		
		System.out.print(a + c + b + "=");
		
		System.out.println("정답을 입력하세요. :");
		//유저가 숫자를 입력, 입력한 숫자를 next.Int()로 선언
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
			//반복문 for사용
		
			/*for(int i = 0; i <= num; i++) {*/
				//만약 입력한 숫자가 a, 랜덤연산자, b를 계산한 값과 같을때 정답입니다.
				//아니면 틀렸습니다.
		
				//*if(num == /*a, 랜덤연산자, b를 계산한 값*/) {
				//	System.out.println("정답입니다.");
				//}
				//else {
				//	System.out.println("오답입니다.");
				//*/
				
	}

}
}
