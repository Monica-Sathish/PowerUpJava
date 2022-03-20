package SearchAndSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void insertionsort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int next = arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]>next;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=next;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Result : "+Arrays.toString(arr));
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
		insertionsort(arr,n);
	}

}
