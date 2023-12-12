package day03;

public class WhileSumEx1 {

	public static void main(String[] args) {
		// 1부터 5까지 합을 구하는 코드
		int i = 1;
		int sum = 0;
		int num = 100;
		
		while(i<=num) {
			System.out.println(""+sum+" + "+i + " = " +
		(sum+i));
			sum += i;
			i++;
		}
		System.out.println("총합은: " + sum);

	}

}
