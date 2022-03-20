package SearchAndSort;
import java.util.Arrays;
import java.util.Scanner;
//45 78 12 49 11 6 = input
public class QuickSort {
	public static void quicksort(int[] arr, int low, int high) {
		if(low<high) {
			int pivotIndex = partition(arr, low, high);
			
			quicksort(arr, low, pivotIndex-1);
			quicksort(arr, pivotIndex+1, high);
		}
	}
	public static int partition(int[] arr, int i, int j) {
		int p = arr[i];
		int m = i;
		for(int k=i+1;k<=j;k++) {
			if(arr[k]<p) {
				m++;
				int temp = arr[k];
				arr[k]=arr[m];
				arr[m]=temp;
			}
		}
		int temp = arr[i];
		arr[i]=arr[m];
		arr[m]=temp;
		
		return m;
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
		quicksort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}
//INPUT: 27 38 12 39 27 16