package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45사이의 랜덤한 수 6개를 생성하여 출력하는 예제 작성
		 * 단, 정렬이 되도록
		 */
		
		
		int min = 1, max = 45;
		int lotto[] = new int[6];
		int count = 0;
		//랜덤으로 중복되지 않은 6개의 수를 생성
		
		
			while(count < lotto.length) {
				//lotto.lenght = 6
				//랜덤한 수 생성
				int r = (int)(Math.random() * (max-min+1) +min);
				
				//중복 확인
				int i;
				for(i = 0; i < count; i++) {
					if(lotto[i] == r) {
						break;
					}
				}
				//중복되지 않으면 저장 후 count증가
				if(i == count) {
					//break를 만나지 않고 정상적으로 종료될때는 i == count
					lotto[count++] = r;
				}
			}
				
		//정렬
			Arrays.sort(lotto);	
		//출력
			for(int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
		
		
		
		
		
		/*
		int [] arr = new int[6];
		int min = 1, max = 45;
		int count = 0;
		
		while( count < 6 ) {
		
		int r = (int)(Math.random() * (max-min+1)+min);
		
		boolean duplicated = false;
		
		for(int i = 0; i < count; i++) {
			if(arr[i] == r) {
				duplicated = true;
				break;
			}
		}
			
			if(!duplicated) {
				arr[count] = r;
				count++; 
			}

		}
		
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
	}
	
	*/

	}
}
