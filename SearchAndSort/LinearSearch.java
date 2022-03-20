package SearchAndSort;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements one by one : ");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the element to be searched : ");
		int search = in.nextInt();
		int flag=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				flag=i;
				break;
			}
		}
		if(flag==-1) {
			System.out.println("Not found");
		}else {
			System.out.println("Found at position : "+ (++flag));
		}
	}
}
