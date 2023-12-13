package day04;

public class StarEx3 {

	public static void main(String[] args) {
		/*		* i=1	' '=4	*=1
		 * 	   ** i=2	' '=3	*=2
		 *    *** i=3	' '=2	*=3
		 *   **** i=4	' '=1	*=4
		 *  ***** i=5	' '=0	*=5
		 *  			' '=5-i *=1개
		 */
		
	/*	
		for(int i = 1; i <= 5; i++) {
			//*을 i개 출력 후 엔터
			 	for(int j = 5; j > 0; j--) {
			 		
			 		if(i<j) {
			 			System.out.print(" ");
			 		}
			 		else {
			 			System.out.print("*");
			 		}			
			}
			 				System.out.println("");
		} 
		
		*/
		
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			for(int j=1; j <= rows-i; j++) {
				System.out.print(' ');
			}
			for(int j=1; j <=i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
	}
}
