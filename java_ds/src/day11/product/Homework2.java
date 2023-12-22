package day11.product;

import java.util.Scanner;

public class Homework2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 결과를 출력하는 코드를 작성
		 * 메서드를 생성
		 */
		
		//반복문
		
		//정수를 입력
		System.out.print("숫자(정수)를 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자(+, -, %, /)를 입력 : ");
		int op = scan.nextInt();
		
		System.out.print("숫자(정수)를 입력 : ");
		int num2 = scan.nextInt();

		int answer = 0;
		switch(op) {
		
		case '+':
				answer = num1 + num2;
			break;
			
		case '-':
				answer = num1 - num2;
			break;
			
		case '*':
				answer = num1 * num2;
			break;
			
		case '/':
				answer = num1 / num2;
			break;
		
		}
		
		System.out.println(num1 + op + num2 + "=" + answer );
			
		}

	}
	
	
	
	
	
	

