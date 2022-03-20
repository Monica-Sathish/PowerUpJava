package prgs;
import java.util.*;
public class swap_method {
	int n1;
	int n2;
	public swap_method(int num1, int num2) {
		n1=num1;
		n2=num2;
	}
	void work() {
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+" "+n2);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2=in.nextInt();
		swap_method a = new swap_method(n1,n2);
		a.work();
	}
}
