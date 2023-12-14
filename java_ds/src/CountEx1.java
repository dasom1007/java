import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/*
		 * 1에서 9사이의 정수를 5개 입력받아 
		 * 각 숫자가 몇개씩 입력 됐는지 출력하는 코드 작성
		 * 1 2 3 1 2
		 * 1 : 2
		 * 2 : 2
		 * 3 : 1
		 * 4 : 0
		 * 5 : 0
		 * 6 : 0
		 * 7 : 0
		 * 8 : 0
		 * 9 : 0
		 */
		
		//5개짜리(입력한 수를 저장하는 배열 - user)와
		//10개짜리(각 숫자가 몇개 입력됐는지 저장하는 배열 - count) 선언
		Scanner scan = new Scanner(System.in);

		int user[] = new int[5];
		int count[] = new int[10];
		
		
		//반복문으로 5개의 정수를 입력 받아 user에 저장하고,
		System.out.print("정수 5개를 입력하세요(1~9) : ");
		for(int i = 0; i < user.length; i++)
				{		
			user[i] = scan.nextInt();
			count[user[i]]++;
				}
			//count배열에 입력받은 정수번지에 해당하는 숫자를 1 증가
	
		//count배열에 있는 값을 1번지부터 9번지까지 출력
			for(int i = 1; i<count.length; i++) {
				System.out.println(i + " : " + count[i]);
			
			}
			
		}
}
		
		

	 