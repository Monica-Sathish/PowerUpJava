import java.util.*;
public class odddiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		int i,j;
		int half = num/2; 
		for(i=1;i<=half+1;i++) {
			for(j=1;j<=half-i+1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=half;i>=1;i--){
			for(j=i;j<=half;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
/**
  *
 ***
  *
**/
	}

}
