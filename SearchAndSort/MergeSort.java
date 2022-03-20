package SearchAndSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void mergesort(int[] arr, int n) {
		
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
		mergesort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
