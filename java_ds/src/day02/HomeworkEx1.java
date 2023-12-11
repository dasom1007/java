package day02;
import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*
		 * 성적을 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드 작성.
		 * 90이상 ~ 100이하 : A
		 * 80이상 ~ 90미만 : B
		 * 70이상 ~ 80미만 : C
		 * 60이상 ~ 70미만 : D
		 * 60미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘 못 된 점수
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("점수를 입력하세요.: ");
		
		int score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A학점 입니다.");
		}
		else if(score >= 80 && score <= 90) {
			System.out.println("B학점 입니다.");
		}
		else if(score >= 70 && score <= 80) {
			System.out.println("C학점 입니다.");
		}
		else if(score >= 60 && score <= 70) {
			System.out.println("D학점 입니다.");
		}
		else if(score < 60) {
			System.out.println("F학점 입니다.");
		}
		else if(score < 0 && score > 100){
			System.out.println("잘 못 된 점수 입니다.");
		}
		
		scan.close();
		
	}

}
