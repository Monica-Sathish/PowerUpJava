package SearchAndSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubblesort(int[] arr, int n) {
		for(int i=n-1;i>=0;i--) {
			int flag = 0;
			for(int j=1;j<=i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Result: "+Arrays.toString(arr));
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
		bubblesort(arr,n);
	}

}
