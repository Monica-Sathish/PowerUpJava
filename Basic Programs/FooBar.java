package prgs;
import java.util.*;
public class FooBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.print("FooBar");
		}
		else if(num%3==0) {
			System.out.print("Foo");
		}
		else if (num%5==0){
			System.out.print("Bar");
		}
		else {
			System.out.println("None");
		}
	}

}
