package collections_oops;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack <Integer> s1 = new Stack<Integer>();
		System.out.println("Enter the length: ");
		int len = in.nextInt();
		for(int i=1;i<=len;i++) {
			s1.push(in.nextInt());
		}
		System.out.println(s1);
		System.out.println("Remove element "+s1.pop());
		System.out.println(s1);
		System.out.println("Top element "+s1.peek());
		System.out.println("Enter search element: ");
		int sear = in.nextInt();
		System.out.println(s1.search(sear));
		System.out.println(s1.isEmpty());
		
	}

}
