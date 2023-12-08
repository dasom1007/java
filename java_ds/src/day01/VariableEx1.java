package day01;

public class VariableEx1 {

	//문자형 변수 선언 예제
	public static void main(String[] args) {
		/* 변수 선언 방법
		 * 1. 변수를 선언만 한다.
		 * 변수타입 변수명;
		 * 2. 변수를 선언하고 초기화 한다.
		 * 변수타입 변수명 = 값;
		 */
		
		char ch1; //문자형 변수 ch1을 선언.
		
		char ch2 = 'A'; //문자형 변수 ch2를 선언하고, 문자 A로 초기화.
		
		//System.out.println(ch1); //변수는 초기화 후 사용해야 한다.
		//초기화 되지 않은 ch1을 사용하려고 하면 에러 발생.
		
		ch1 = '+';
		System.out.println(ch1);
		System.out.println(ch2);
		
		//char ch3 = "A"; //""는 문자열을 의미.
		//""안에 한글자가 들어간다해서 문자가 되는게 아님.
		
		//char ch4 = '12'; //''안에는 한 글자가 들어가야 한다.
		
		char ch5 = '\u0061'; //유니코드 65에 해당하는 문자를 저장.
		System.out.println(ch5);
		
		char ch6 = 65; //아스키코드 65에 해당하는 문자를 저장.
		System.out.println(ch6);
		
		char ch7 = '\n'; // \가 들어간 문자들이 있다. \n : 엔터
		// \t: 탭키만큼의 공백
		// \\ " \문자 등
		System.out.println(ch7);
	}

}
