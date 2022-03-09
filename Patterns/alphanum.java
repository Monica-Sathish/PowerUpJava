import java.util.*;

public class alphanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i,j;
		
		for(i=1;i<=num;i++) {
			int c=65;
			for(j=1;j<=i;j++) {
				if(i%2==1){
					System.out.print(j+" ");
				}else {
					System.out.print((char)c+" ");
					c++;
				}
			}
			System.out.println();
		}
		for(i=num;i>=1;i--) {
			int e=65;
			int n=1;
			for(j=i;j>=1;j--) {
				if(i%2==1){
					System.out.print(n+" ");
					n++;
				}else {
					System.out.print((char)e+" ");
					e++;
				}
			}
			System.out.println();
		}
		/**
1 
A B 
1 2 3 
A B C D 
1 2 3 4 5 
1 2 3 4 5 
A B C D 
1 2 3 
A B 
1 

		 */
	}

}
