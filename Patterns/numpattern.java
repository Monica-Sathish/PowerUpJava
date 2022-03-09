import java.util.Scanner;

public class numpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i, j, n=0;
		int num = in.nextInt();
		for(i=1;i<=num+1;i++) {
			n=i;
			for(j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
		
			System.out.println();
		}
/**
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
6 7 8 9 10 11 
 */
	}

}
