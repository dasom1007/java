package day14;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드를 작성하세요.
		//단, 0으로 나눌 때 예외처리를 적용
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
		
			int num1, num2;
			char op;
			double res = 0;
			
			System.out.print("정수를 입력하세요:");
			num1 = scan.nextInt();
			
			System.out.print("연산자(+, -, *, /)를 입력하세요:");
			op = scan.next().charAt(0);
			
			System.out.print("정수를 입력하세요:");
			num2 = scan.nextInt();
			
			
			switch(op) {
			
			case '+':
				res = num1+num2;
				break;
			case '-':
				res = num1-num2;
				break;
			case '*':
				res = num1*num2;
				break;
			case '/':
				res = num1/num2;
				break;
			case '%':
				res = num1%num2;
				break;
				default :
					System.out.println("잘못된 연산자 입니다.");
				
			}
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, num1,op,num2,res));
			
		} catch(ArithmeticException e){
			System.out.println("0으로 나누면 안 됩니다.");
		} catch(InputMismatchException e) {
			System.out.println("입력을 잘 못 했습니다.");
		}
	}

}
