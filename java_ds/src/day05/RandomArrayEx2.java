package day05;

public class RandomArrayEx2 {

	public static void main(String[] args) {
		/* 1~9사이의 중복되지 않은 랜덤한 수 3개를 저장하는 예제
		 * 
		 */
		
		int [] arr = new int[3];
		int min = 1, max = 9;
		int count = 0; //배열에 저장된 중복되지 않은 수의 개수
		
		//배열에 중복되지 않은 수가 3보다 작으면 반복
		while( count < 3 ) {//증감식 필요없으니 기본 반복문 while
			
			//랜덤수 생성
			int r = (int)(Math.random() * (max-min+1)+min);
			
			//중복 확인
			boolean duplicated = false; 
			//중복 여부를 알려주는 변수로, true면 중복, false면 중복아님
			
			for(int i = 0; i < count; i++) {
				if(arr[i] == r) {
					duplicated = true;
					break;
				}
			}
			
			//중복되지 않으면 저장 후 count 증가
			if(!duplicated) { //duplicated가 거짓일때
				arr[count] = r; //arr를 count번지에 저장 
				count++; //count를 증가
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
