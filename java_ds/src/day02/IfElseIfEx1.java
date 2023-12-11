package day02;


	
	public class IfElseIfEx1 {
		//if else if문 예제
		public static void main(String[] args) {

		int num = 3;
		//num이 0이면 0, 양수면 양수, 음수면 음수라 작성하는 코드
		
		if(num == 0) {
			System.out.println(num + "는(은) 0입니다.");
		}
		else if(num > 0) {
			System.out.println(num + "는(은) 양수입니다.");
		}
		else {
			System.out.println(num + "는(은) 음수입니다.");
		}
		
		}
	}
