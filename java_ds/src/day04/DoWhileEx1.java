package day04;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		//q를 입력하기 전까지 문자를 입력하면 입력받은 문자를 출력하는 예제
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		do{
			System.out.println("입력 :");
			ch = scan.next().charAt(0);
			//스캐너를 통해 입력받고 비교하기 때문에 초기화 안해도 됨
			System.out.println("문자 :" + ch);
			
		} while( ch != 'q' );
		
		
	}
}
