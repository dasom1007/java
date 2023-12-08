package day01;

public class VariableEx5 {

	// String 선언 예제
	public static void main(String[] args) {
		String str1 = null;
		System.out.println(str1);
		
		//int num1 = null; //기본형 변수에는 null 저장 불가.
		
		String str2 = "Hello"; //문자열이라 ""사용
		System.out.println(str2);
		
		//String str3 = 'A'; //String은 클래스에 문자를 저장할 수 없다.
		
		String str4 = "A";
		System.out.println(str4);
		
		String str5 = "";
		System.out.println(str5); //String 클래스에 빈 문자열을 저장할 수 있다.
		
		String str6 = "" + 'A'; //문자열에 정수 또는 실수 또는 문자 또는 논리값을 더하면 문자열이 된다.
		System.out.println(str6); //빈문자열 + 'A'는 "A"가 되어서 저장이 가능하다.
		
	}

}
