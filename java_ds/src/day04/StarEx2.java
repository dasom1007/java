package day04;

public class StarEx2 {
	
	public static void main(String[] args) {
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 반복횟수	: i는 1부터 5까지 1씩 증가
		 * 규칙성		: *을 1개 출력 후 엔터
		 * 				반복횟수 	: j는 1부터 i까지
		 * 				규칙성  	: *을 출력
		 * 				반복문종료후: 엔터
		 */
		
			for(int i = 1; i <= 5; i++) {
				//*을 i개 출력 후 엔터
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
					//println시 오류
				}
				    	System.out.println("");
			} 
	}

}
