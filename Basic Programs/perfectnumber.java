package prgs;
import java.util.*;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("It's a Perfect number");
		}else {
			System.out.println("It's not a Perfect Number");
		}
	}

}
