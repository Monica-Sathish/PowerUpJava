package prgs;
import java.util.*;
public class swapofdigits {
	void work(int n1, int n2) {
		int swap=0;
		swap=n1;
		n1=n2;
		n2=swap;
		System.out.print(n1+""+n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp=num;
		int digit=0, i=0, count=0, j=0;
		while(num>0) {
			digit=num%10;
			num=num/10;
			count++;
		}
		int dig[] = new int[count+1];
		int rev=0;
		while(temp>0) {
			digit=temp%10;
			rev= rev*10+digit;
			temp=temp/10;
		}
		while(rev>0) {
			digit=rev%10;
			dig[i]=digit;
			rev=rev/10;
			//System.out.println(dig[i]);
			i++;
		}
		for(j=0;j<count;j++) {
			swapofdigits a = new swapofdigits();
			int num1 =dig[j];
			int num2 = dig[j+1];
			a.work(num1, num2);
			j++;
		}
	}
}
