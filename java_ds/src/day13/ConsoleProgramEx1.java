package day13;

import javax.print.attribute.standard.JobStateReasons;

public class ConsoleProgramEx1 {

		public static void main(String[] args) {
			/*ConsoleProgram cp = new ConsoleProgram();
			cp.run();
			*/
			//형변환 : 인터페이스와 구형 클래스 사이에서 형변환이 가능
			Program p = new ConsoleProgram();
			p.run();
		}
}

	
