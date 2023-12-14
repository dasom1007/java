package day05;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/*
		 * 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드를 작성
		 */
		
		int [] arr = new int[3];
		int num1 = 1, num2 = 9;

		
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = (int)(Math.random() * (num2-num1+1)+num1);
			}
			for(int i = 0; i < arr.length; i++) {

				System.out.println(arr[i] + " ");
			}
				
			
			
		

	}

}
