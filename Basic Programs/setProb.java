package prgs;
import java.util.*;
public class setProb {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter size of TreeSet");
				int n = in.nextInt();
				TreeSet <Integer> s1 = new TreeSet<Integer>();
				for(int i=0;i<n;i++) {
					System.out.println("Enter element: "+ i);
					s1.add(in.nextInt());
				}
				System.out.println("Printing s1");
				System.out.println(s1);
				System.out.println("Printing Reverse of s1");
				System.out.println(s1.descendingSet());
				/*ListIterator<Integer> iterator = s1.listIterator();
				while(iterator.hasNext()) {
					System.out.print(iterator.next()+" ");
				}
				System.out.println();
				System.out.println("Printing a1 in reverse order");
				while(iterator.hasPrevious()) {
					System.out.print(iterator.previous()+" ");
				}*/
				System.out.println();
				System.out.println("Enter element for search");
				int find = in.nextInt();
				System.out.println(s1.contains(find));
				TreeSet <Integer> s2 = (TreeSet<Integer>)s1.clone();
				
				System.out.println(s2);
				System.out.println("Size of s2: "+s2.size());
				s1.add(40);
				s1.add(50);
				Iterator<Integer> iterator = s1.iterator();
				while(iterator.hasNext()) {
					int v = iterator.next();
					if(v%3==0) {
						s2.add(v);
					}
				}
				System.out.println();
				while(iterator.hasNext()) {
					int v1 = iterator.next();
					if(s2.contains(v1)) {
						continue;
					}
					else {
						s1.remove(v1);
					}
				}	
				System.out.println(s1);
				System.out.println(s2);
				s2.clear();
				System.out.println("Size of a2: "+s2.size());
	}

}
