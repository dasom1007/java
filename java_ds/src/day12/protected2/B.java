package day12.protected2;

import day12.protected1.A;

public class B extends A {

		public void print() {
			//num1은 private 여서 자식 클래스에서도 접근X
			//System.out.println("num1"+num1);
			
			//num2는 default 여서 다른 패키지에 있는 클래스에서 접근X
			//System.out.println("num2"+num2);
			
			//num3는 protected 여서 다른 패키지와 상관 없이 자식 클래스에서 접근 O
			System.out.println("num3"+num3);
			
			//num4는 public여서 접근 가능
			System.out.println("num4"+num4);
		}
}
