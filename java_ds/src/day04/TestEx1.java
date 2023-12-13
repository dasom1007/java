package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/*
		 * Scanner을 이용하여 국어, 영어, 수학 성적을 입력받고
		 * 총점과 평균을 구하는 코드 작성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("국어를 입력 하세요: " );
		int kor = scan.nextInt();
		
		System.out.print("수학을 입력 하세요: " );
		int math = scan.nextInt();
		
		System.out.print("영어를 입력 하세요: " );
		int eng = scan.nextInt();
		
		int p= kor + eng + math;
		double i= (double)p / 3;

		System.out.println("총점 : " + p);
		System.out.println("평균 : " + i);
		


	}

}
