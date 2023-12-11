package day02;
import java.util.Scanner;


public class TestEx4 {

	public static void main(String[] args) {
		// 성인 판별 예제
		/*
		 * 나이를 입력받아 나이가 20세 이상이면 성인, 미만일 시 미성년자로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		
		else {
			System.out.println("미성년자 입니다.");
		}
	
		scan.close();

	}
}
