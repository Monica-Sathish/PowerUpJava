import java.util.*;

public class alphabetpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int j;
		int c = 65, d= 65;
		for(int i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char)c+" ");
				c++;
			}
			for(j=1;j<=num-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=num-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" "+(char)d);
				d++;
			}
			System.out.println();
		}
/**
A                  A
B C              B C
D E F          D E F
G H I J      G H I J
K L M N O  K L M N O
 */
	}

}
