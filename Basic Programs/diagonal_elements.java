package prgs;
import java.util.*;
public class diagonal_elements {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("Enter the elements: ");
			int mat[][] = new int [n1][n2];
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n2;j++) {
					mat[i][j]=in.nextInt();
				}
			}
			System.out.println("Diagonal elements: ");
			for(int i=0;i<n1;i++){ 
				for(int j=0;j<n2;j++){ 
					if(i==j){
						System.out.println(mat[i][j]);
					}
				}
			}
	}

}
