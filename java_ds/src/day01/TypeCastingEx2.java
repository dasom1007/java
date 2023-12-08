package day01;

public class TypeCastingEx2 {

	// 강제(명시적) 자료형 변환 예제
	public static void main(String[] args) {
		
		int num1 = (int)3.14; 
		//실수값인 3.14를 정수형 변수에 저장하면 소수점이 사라진다.
		//자동으로 변환이 안되니 강제 형변환을 해야한다.
		System.out.println(num1);
		
		byte num2 = (byte)num1;
		//num1에 3이 저장되어 있어서 byte에 바로 저장할 수 있는 것처럼 보이지만
		//num1은 값이 중요하지 않고 타입이 중요하니 자동으로 저장이 안 된다.
		//강제 형변환을 해야한다.
		System.out.println(num2);
		//byte num3 = 3;
		
		byte num4 = (byte)128;
		System.out.println(num4);
		//오버플로우가 일어나 -128로 뜬다.
		
		//에러가 발생하지 않지만 필요에 의해 형변환 하는 경우
		System.out.println(1/2);
		System.out.println((double)1/2);
		//정수 % 정수 = 정수이기에 원하는 표기를 위해 강제형변환을 한다.
		
		//같은 타입의 변수를 여러개 선언하는 경우
		int num5 = 1, num6 = 2, num7 = 3;
		
		
	
	}

}
