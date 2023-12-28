package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		//정수를 5개 입력받아 입력받은 정수를 리스트에 저장하고, 출력하는 코드를 작성하세요.

		Scanner scan = new Scanner(System.in);
		int count = 5;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("정수 5개를 입력하세요 :");
		for(int i = 0; i < count; i++) {
			int tmp = scan.nextInt();
			list.add(tmp);
		}
		for(int tmp : list) {
			System.out.print(tmp);
		}
		
		
	}

}
