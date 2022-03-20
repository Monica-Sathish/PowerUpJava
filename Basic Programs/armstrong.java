package prgs;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp=num, t2=num, sum=0, dig=0, count=0,pow=1;
		while(temp>0) {
			dig=temp%10;
			count++;
			temp/=10;
		}
		while(t2>0) {
			dig=t2%10;
			pow = (int) Math.pow(dig, count);
			sum=sum+pow;
			t2/=10;
		}
		if(sum==num) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
