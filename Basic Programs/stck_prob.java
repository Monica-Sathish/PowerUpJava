package prgs;
import java.util.*;
public class stck_prob {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack <String> s1 = new Stack <String>();
		int n = in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++) {
			s1.push(in.nextLine());
		}
		System.out.println("Top most element is "+s1.peek());
		System.out.println("Enter fruit name to search:");
		String str = in.nextLine();
		System.out.println("The position is "+ s1.search(str));

	}

}
