import java.util.Scanner;
import java.util.*;
public class multiplestringpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i,j;
		
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(j=1;j<=num-i;j++)
			System.out.println();
		}
		for(i=num;i>=1;i--) {
			int c=65;
			for(j=i;j>=1;j--) {
				System.out.print((char)c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
