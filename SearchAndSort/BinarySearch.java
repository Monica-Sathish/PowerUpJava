package SearchAndSort;
import java.util.*;
public class BinarySearch {
	public static void recursiveSearch(int[] arr,int left,int right, int search) {
		int mid = left+(right-left)/2;
		if(arr[mid]==search) {
			System.out.println("Found at position : "+ (++mid));
			return;
		}
		if(arr[mid]<search) {
			left = mid+1;
		}else {
			right = mid-1;
		}
		recursiveSearch(arr, left, right, search);
	}
	public static void iterativeSearch(int[] arr, int left, int right, int search) {
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==search) {
				System.out.println("Found at position : "+ (++mid));
				return;//break;
			}
			if(arr[mid]<search) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
	}
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
		Arrays.sort(arr);
		System.out.println("Enter the element to be searched : ");
		int search = in.nextInt();
		recursiveSearch(arr,0,n-1,search);
		iterativeSearch(arr,0,n-1,search);
	}

}