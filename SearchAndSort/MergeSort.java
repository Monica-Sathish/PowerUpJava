package SearchAndSort;
import java.util.*;

public class MergeSort {
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
            System.out.println(m);
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            // Merges two subarrays of arr[].
            // First subarray is arr[l..m]
            // Second subarray is arr[m+1..r]
            //merge(arr, l, m, r);
            int n1 = m - l + 1;
            int n2 = r - m;
      
            /* Create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];
      
            /*Copy data to temp arrays*/
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];
      
            /* Merge the temp arrays */
      
            // Initial indexes of first and second subarrays
            int i = 0, j = 0;
      
            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
      
            /* Copy remaining elements of L[] if any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
      
            /* Copy remaining elements of R[] if any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
            System.out.println(Arrays.toString(arr));
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
		sort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}