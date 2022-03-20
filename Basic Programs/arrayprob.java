package prgs;
import java.util.Scanner;
public class arrayprob {
	public static void main(String[] args) {
		//Take two char arrays.. Take unique elements and add their ascii values.
		//Add all the digits until single digit..
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements for array1");
		int n1 = in.nextInt();
		System.out.println("Enter the number of elements for array2");
		int n2 = in.nextInt();
		char a1[] = new char[n1];
		char a2[] = new char[n2];
		System.out.println("Enter the char elements for array1");
		for(int i=0;i<n1;i++) {
			a1[i]=in.next().charAt(0);
			//System.out.println(a1[i]);
		}
		System.out.println("Enter the char elements for array2");
		for(int i=0;i<n2;i++) {
			a2[i]=in.next().charAt(0);
			//System.out.println(a2[i]);
		}
		char fin[] = new char[n1+n2];
		int i=0, j=0, t=0;
		while(i<n1 && j<n2) {
			if(a1[i]<a2[j]) {
				//System.out.println(a1[i]);
				fin[t]=a1[i];
				t++;
				i++;
			}
			else if(a2[j]<a1[i]){
				//System.out.println(a2[j]);
				fin[t]=a2[j];
				t++;
				j++;
			}
			else {
				i++;
				j++;
			}
		}
		while(i<n1) {
			//System.out.println(a1[i]);
			fin[t]=a1[i];
			t++;
			i++;
		}
		while(j<n2) {
			//System.out.println(a2[j]);
			fin[t]=a2[j];
			t++;
			j++;
		}
		int ascii, sum=0, add=0;
		int asc_val[] = new int[t];
		for(i=0;i<t;i++) {
			//System.out.println(fin[i]);
			ascii = fin[i];
			add=add+ascii;
			asc_val[i]=ascii;
			//System.out.println(asc_val[i]);
		}
		/*System.out.println(add);
		String num = Integer.toString(add);
		int n = num.length();
		System.out.println(n);*/
		while(add>0||sum>9) {
			if(add==0) {
				add = sum;
				sum = 0;
			}
			sum = sum + add%10;
			//System.out.println(sum+" "+add);
			add = add/10;
		}
		System.out.println("Result:");
		System.out.println(sum);
		in.close();
	}
}
