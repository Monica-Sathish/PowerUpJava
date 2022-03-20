package prgs;
import java.util.Scanner;
public class problem2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input 1: ");
		int num1 = in.nextInt();
		System.out.println("Input 2: ");
		int num2 = in.nextInt();
		System.out.println("Input 3: ");
		int num3 = in.nextInt();
		int dig1 = num1/1000%10;
		int dig2 = num2/100%10;
		int dig3 = num3/10%10;
		int key = (dig1*dig2)-dig3;
		System.out.println("Output"+key);
	}
}