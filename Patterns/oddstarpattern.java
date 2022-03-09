import java.util.*;

public class oddstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i, j;
		int n=1;
		int num = in.nextInt();
		for(i=1;i<=num;i++) {
			if(i==1) {
				System.out.print("* ");
			}
			else {
				for(j=1;j<=i+n;j++) {
					System.out.print("* ");
				}
				n=n+1;
			}
		
			System.out.println();
		}
/**
* 
* * * 
* * * * * 
* * * * * * * 		
 */
	}

}
