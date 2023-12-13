package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/*      *		i=1		' '=4	*=1
		 *     ***		i=2		' '=3	*=3
		 *    *****		i=3		' '=2	*=5
		 *   *******	i=4		' '=1	*=7
		 *  *********	i=5		' '=0	*=9
		 * 						5-i		2*i-1
		 */
		
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			
			for(int j=1; j <= rows-i; j++) {
				System.out.print(' ');
			}
			for(int j=1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		/*      *		i=1		' '=4		*=1	 	*=0
		 *     ** *		i=2		' '=3		*=2  	*=1
		 *    *** **	i=3		' '=2		*=3   	*=2
		 *   **** ***	i=4		' '=1		*=4   	*=3
		 *  ***** ****	i=5		' '=0		*=5   	*=4
		 * 						5-i		    i       i-1
		 */
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j=1; j <= rows-i; j++) {
				System.out.print(' ');
			}
			for(int j=1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			
			for(int j=1; j <= i-1; j++) {
				System.out.print("*");
			}
			
			
				System.out.println();
		}
		
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 * 
		 * 
		 * 
		 */
		
		
		

	}

}
