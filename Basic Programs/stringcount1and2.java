package prgs;
import java.util.*;
public class stringcount1and2 {
	public stringcount1and2(String s1) {
		String s=s1;
		String[] str1 = s.split(",");
		int count1=0,count2=0;
		for(int i=0;i<str1.length;i++) {
			if(str1[i].equals("1")) {
				count1++;
			}
			else if(str1[i].equals("2")) {
				count2++;
			}
		}
		System.out.println("No. of 1's: "+count1);
		System.out.println("No. of 2's: "+count2);	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		stringcount1and2 a = new stringcount1and2(str);
	}
}
