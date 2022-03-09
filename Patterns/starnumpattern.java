import java.util.*;
public class starnumpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i, j;
		int num = in.nextInt();
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(j=1;j<=num-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=num-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
/**
*                  1
* *              1 2
* * *          1 2 3
* * * *      1 2 3 4
* * * * *  1 2 3 4 5**/
	}

}
