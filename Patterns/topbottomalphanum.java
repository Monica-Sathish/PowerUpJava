import java.util.*;
public class topbottomalphanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i,j;
		int a=65;
		int n=1;
		for(i=1;i<=num;i++) {
			int k=i-1;
			for(j=2*k;j>=i;j--) {
				System.out.print("  ");
			}
			for(j=1;j<=num-i;j++) {
				if(i%2==1) {
					char val = (char)a;
					System.out.print(val+" ");
					a++;
				}else {
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}

}
