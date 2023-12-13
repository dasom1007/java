package day04;

import java.util.Scanner;

public class InfiniteLoopEx2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		for(int i = 10; i>0 ; ) {
		   	System.out.println("정수 입력 :");
			num = scan.nextInt();
			System.out.println("정수 출력 :" + num);
	}
			System.out.println("프로그램 종료");
}
}
