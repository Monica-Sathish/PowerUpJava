package SearchAndSort;
import java.util.*;
public class SelectionSort {
	public static void selectionsort1(int[] arr, int n) {
		for(int i=n-1;i>=0;i--) {
			int maxIndex = i; // assign maximum Index
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[maxIndex]) {
					maxIndex=j;  //get maximum value in index
				}
				//swapping
				int temp = arr[i];
				arr[i]=arr[maxIndex];
				arr[maxIndex]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("result : "+Arrays.toString(arr));
	}
	// another method
	public static void selectionsort2(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			int minIndex = i; // assign maximum Index
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;  //get maximum value in index
				}
				//swapping
				int temp = arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("result : "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		System.out.println("Enter the elements one by one : ");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			arr2[i]=arr[i];
		}
		System.out.println("First method");
		selectionsort1(arr,n);
		System.out.println("Second method - Another method");
		selectionsort2(arr2,n);
	}
}