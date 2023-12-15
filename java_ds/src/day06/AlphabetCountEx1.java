package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		/* 단어를 입력받아 단어 각 알파벳이 몇번 나왔는지 출력하는 코드 작성
		 * 입력 : apple
		 * a: 1
		 * e: 1
		 * l: 1
		 * p: 2
		 */
		//String str = "Hello";
		//System.out.println(str.length());
		//System.out.println(str.charAt(0));
		
		
		
		//단어를 입력 = > 문자열을 입력
		
		System.out.print("영어 단어를 입력하세요. :");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int [] arr = new int[26];
		//반복문으로 문자열의 길이만큼 반복
		
			for(int i = 0; i < str.length(); i++) {
		
			//문자열의 각 문자를 가져옴
				char ch = str.charAt(i);

			//가져온 문자의 배열 번지에 숫자를 증가
			//가져온 문자가 a이면 0번지에 있는 숫자를 1증가, b이면 1번지 1증가 ...
			//z는 25번지
	
				arr[ch-'a']++; //System.out.println('a'-'a'); 특성 활용

			}
			/*for(int count : arr) {
				System.out.println(count);
			}*/
			
			//반복문으로 배열의 크기만큼(26개) 반복
				//개수가 0이 아닌 알파벳들을 출력
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != 0) {
					char ch = (char)('a' + i);
					System.out.println(ch + " : " + arr[i]);
				}
				
			}
			System.out.println("==========");
			System.out.println("[향상된 for문]");
			char ch = 'a';
			for(int count : arr) {
				if(count != 0) {
				System.out.println(ch + " : " +count);
				}
				ch++;
			}
		
		
			scan.close();
		/*
		//배열alp[22]선언
		//입력받은 단어 eng변수 저장 //스캐너
		//알파벳이 몇번 나왔는지 저장하는 count변수
		Scanner scan = new Scanner(System.in);
		
		int alp[] = new int[22];
		char eng = scan.next().charAt(0); //문자니까 char
		int count = 0;
		
		//반복문 for? do while? 사용
			//단어를 입력하세요:
			//입력받은단어 출력
			
		System.out.print("영어 단어를 입력하세요. :");
		
			for(int i = 0; i<alp.length; i++) {
				System.out.println(eng); 
		
		}
			//입력받은 알파벳마다 카운트증가
		*/
		

	}

}
