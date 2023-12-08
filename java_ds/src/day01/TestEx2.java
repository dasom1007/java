package day01;

public class TestEx2 {
	//문제 2. 국어, 영어, 수학 성적을 입력하여 평균을 구하려 한다.
	// 이 때 필요한 변수들을 선언하세요.
	// 국어, 영어, 수학 점수를 어떤 값을 이용할 것인가?
	
	public static void main(String[] args) {

	int lan = 80, eng = 80, mat = 80, sum = lan + eng + mat;
	double avg = sum / 3;
	
	System.out.println("평균 값:" + avg );
	
	
}
}