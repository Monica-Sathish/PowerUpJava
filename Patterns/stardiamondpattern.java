import java.util.*;
public class stardiamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i,j;
		for(i=num;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print("  ");
			}
			for(j=num-i;j>=1;j--) {
				System.out.print(" *");
			}
			for(j=num-i;j>=1;j--) {
				System.out.print("* ");
			}
			for(j=i;j>=1;j--) {
				System.out.print("  ");
			}
			System.out.println();
		}
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=num-i;j++) {
				System.out.print(" *");
			}
			for(j=1;j<=num-i;j++) {
				System.out.print("* ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		/**
                    
         **         
       * ** *       
     * * ** * *     
   * * * ** * * *   
   * * * ** * * *   
     * * ** * *     
       * ** *       
         **         
                    
		 */
		
	}

}
