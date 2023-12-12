package day03;

import java.util.Scanner;

public class GcdEx1 {

	public static void main(String[] args) {
		/*
		 * 정수의 약수를 출력
		 */

		int num = 4;
		System.out.println("4의 약수 : ");
		for(int i = 1; i <= num; i++ ) {
			if(num % i == 0) {
				System.out.print(i + ( i == num? "\n":", "));
				
	     }
       }
      }
	}
