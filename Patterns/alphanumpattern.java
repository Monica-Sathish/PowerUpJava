import java.util.*;
public class alphanumpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int nu=in.nextInt();
		int num=nu+1;
		int i,j,f;
		int s=0;
		int c=65;
		int t=2;
		
		for(i=num;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print("  ");
			}
			f = c+t-1;
			for(j=num-i;j>=1;j--){
				if(i%2==1){
					System.out.print(" "+(s+j));
				}
				else if(i%2==0){
					System.out.print(" "+(char)f);
					f--;
					t=t+2;
				}
			}
			if(i%2==1) {
				s+=num-i;
			}
			System.out.print(" ");
			j=num-i;
			for(int a=1; a<=j;a++) {
				System.out.print(a+" ");
			}
			
			for(j=i;j>=1;j--) {
				System.out.print("  ");
			}
			System.out.println();
		}
		int n=2;
		int m=65;
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(j=1;j<=num-i;j++){
				System.out.print(" "+n);
			}
			n=n+2;
			System.out.print(" ");
			for(j=1;j<=num-i;j++){
				System.out.print((char)m+" ");
			}
			m++;
			for(j=1;j<=i;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
/**
           1 1           
         B A 1 2         
       4 3 2 1 2 3       
     F E D C 1 2 3 4     
   9 8 7 6 5 1 2 3 4 5   
   2 2 2 2 2 A A A A A   
     4 4 4 4 B B B B     
       6 6 6 C C C       
         8 8 D D         
           10 E           
 */
	}

}
