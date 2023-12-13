package day04;

public class GCDEx2 {

	public static void main(String[] args) {
		/*
		 * 두 정수의 공약수를 출력하는 코드 작성
		 * 약수: 나누어서 떨어지는 수
		 * 공약수: 공통으로 있는 약수
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * 8의 약수 : 1, 2, 4, 8
		 * 8과 12의 공약 수 : 1, 2, 4
		 */
		
		int num = 8;
		int num1 = 12;
		
		
		System.out.print("12의 약수 : ");
			for (int i =1; i <= num1; i++) {
				if(num1 % i == 0) {
					System.out.print( i + ( i==num1? "\n" : " ,"));
			}
		}
		
		System.out.print("8의 약수 : ");
			for (int i =1; i <= num; i++) {
				if(num % i == 0) {
					System.out.print( i + ( i==num? "\n" : " ,"));
			}
		}
		
		System.out.print("8과 12의 공약수 : ");
			for (int i = 1; i <= num1; i++  ) {
				if (num % i == 0 && num1 % i == 0) {
					System.out.print( (i == 1 ? "" : ", ") + i);
			}
		}
		
			
			
			
		}

	}


