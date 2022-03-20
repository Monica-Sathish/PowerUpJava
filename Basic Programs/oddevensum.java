package prgs;
import java.util.*;
public class oddevensum {

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
		for(i=0;i<count;i++) {
			if(dig[i]==9) {
				dig[i]=9;
			}else if(dig[i]%2==1){
				dig[i]=dig[i]+2;
			}else if(dig[i]%2==0) {
				dig[i]=dig[i]+1;
			}
			System.out.print(dig[i]);
		}
	}
}
