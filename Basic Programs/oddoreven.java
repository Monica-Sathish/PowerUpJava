package prgs;
import java.util.*;
public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%2==0) {
			System.out.println("It's Even Number");
		}else {
			System.out.println("It's Odd Number");
		}
	}

}
