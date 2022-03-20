package prgs;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Scanner in = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int i,j,sum=0,avg=0;
		int len = in.nextInt();
		int [] arr = new int[len];
		for(i=0;i<len;i++) {
			arr[i]= in.nextInt();
		}
		System.out.printf("%s",Arrays.toString(arr));
		System.out.println("Enter the inputs for str array");
		in.nextLine();
		String [] str = new String[len];
		for(j=0;j<len;j++) {
			str[j]= in.nextLine();
		}
		System.out.println();
		System.out.printf("%s",Arrays.toString(str));
		System.out.println();
		Arrays.sort(arr);
		Arrays.sort(str);
		System.out.println("Sorted integer array");
		System.out.printf("%s",Arrays.toString(arr));
		System.out.println();
		System.out.println("Sorted string array");
		System.out.printf("%s",Arrays.toString(str));
		System.out.println();
		System.out.println("Sum and Average of an array");
		for(i=0;i<len;i++) {
			sum=sum+arr[i];
		}
		avg=sum/len;
		System.out.println("Sum of arr is - "+sum+" and the average of arr is - "+avg);
		System.out.println("Enter the search element");
		int search = in.nextInt();
		for(i=0;i<len;i++) {
			if(search==arr[i]) {
				System.out.println("The given element"+search+" is found at the position: "+i);
			}
		}
		System.out.println("Enter the any element to print index");
		int index = in.nextInt();
		for(i=0;i<len;i++) {
			if(index==arr[i]) {
				System.out.println("The given element"+index+" is found at the position: "+i);
			}
		}
		System.out.printf("%s",Arrays.toString(arr));
		System.out.println();
		System.out.println("Remove specific element");
		System.out.println("Enter the removing element");
		int rem = in.nextInt();
		j=0;
		int c=0;
		int[] newarr = new int[len];
		for(i=0;i<len;i++) {
			if(rem!=arr[i]){
				newarr[j]=arr[i];
				j++;
			}
			else {
				c++;
			}
		}
		System.out.println("The new array be");
		for(i=0;i<len-c;i++) {
			System.out.print(newarr[i]+"  ");
		}
		System.out.println();
		System.out.println("Copying array using iterative method");
		int[] copy = new int[len];
		for(i=0;i<len;i++) {
			copy[i]=arr[i];
		}
		System.out.printf("%s",Arrays.toString(copy));
		System.out.println();
		System.out.println("The maximum element is: "+arr[len-1]);
		System.out.println("The miniimum element is: "+arr[0]);
		System.out.println("Reversal of array");
		for(i=len-1;i>=0;i--) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("Removal of duplicate elements");
		Arrays.sort(arr);
		System.out.printf("%s",Arrays.toString(arr));
		int[] duparr = new int[len];
		c=0;
		int k=0;
		for(i=0;i<len-1;i++) {
				if(arr[i]!=arr[i+1]){
					duparr[k++]=arr[i];
				}
		}
		duparr[k++]=arr[len-1];
		System.out.println();
		for(i=0;i<len-c;i++) {
			System.out.print(duparr[i]+"  ");
		}
		System.out.println();
		System.out.printf("%s",Arrays.toString(str));
		System.out.println();
		c=0;
		k=0;
		String s = "Dupliacates of reverse";
		char[] ch = s.toCharArray();
		char[] chdup = new char[ch.length];
		for(i = 0; i <ch.length; i++) {  
            int c = 1;  
            for(int j = i+1; j <ch.length; j++) {  
                if(ch[i] == ch[j] && ch[i] != ' ') {  
                    c++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    ch[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(c > 1 && ch[i] != '0') {  
                chdup[k]=ch[i];
            	k++;
            }
        }
		
		System.out.println();
		for(i=0;i<chdup.length;i++) {
			System.out.print(chdup[i]+"  ");
		}
		System.out.println();**/
		    final int MAX_CHAR = 256;
		    String str = "geeksforgeeks";
		    int count[] = new int[MAX_CHAR];
			 
	        int len = str.length();
	 
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	 
	        // Create an array of given String size
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j])
	                    find++;
	            }
	 
	            if (find == 1)
	                System.out.println("Number of Occurrence of "+ str.charAt(i) + " is:" + count[str.charAt(i)]);
	        }
	}

}
