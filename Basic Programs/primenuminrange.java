package prgs;
import java.util.*;
public class primenuminrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int count;
		for(int i=num1; i<=num2; i++){
			count=0;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i%j==0)
					count=count+1;
			}
			if(count==0)
				System.out.println(i);
		}
	}

}
