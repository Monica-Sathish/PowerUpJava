import java.util.*;
public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int num = in.nextInt();
		Set <Integer> s1 = new HashSet<Integer>();
		for(int i=0;i<num;i++) {
			s1.add(in.nextInt());
		}
		//NO duplicates.
		for(int a : s1) {
			System.out.print(a+" ");
		}
		/**Note
		 * Hashset - no order
		 * Linked hashset - Insertion order
		 * Tree hashset - Ascending order
		 **/
		System.out.println();
		System.out.println("Enter an element to be removed");
		int rem = in.nextInt();
		s1.remove(rem);
		System.out.println(s1);
		TreeSet <Integer> ts = new TreeSet <Integer>(s1);
		//following methods can be used only in treeset.
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("Using descending set:  "+ts.descendingSet());
		System.out.println("Using descending iterator");
		Iterator it  =ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		System.out.println("Enter an element to be searched");
		int find = in.nextInt();
		boolean search = ts.contains(find);
		if(search) {
			System.out.println("The element is present");
		}else {
			System.out.println("The element is not present");
		}
		System.out.println("The FIRST element or SMALLEST element is "+ts.first());
		System.out.println("The LAST element or LARGEST element is "+ts.last());
		System.out.println("***********************************************************************************");
		System.out.println("Conversion of list to set or viceversa");
		ArrayList <Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(4);
		a1.add(6);
		a1.add(11);
		a1.add(24);
		a1.add(63);
		a1.add(43);
		a1.add(90);
		a1.add(11);
		System.out.println("The arraylist is "+a1);
		Set <Integer> s2 = new HashSet <Integer>(a1);
		System.out.println("The HashSet is "+s2);
		Set <Integer> ls = new LinkedHashSet <Integer>(a1);
		System.out.println("The LinkedHashSet is "+ls);
		Set <Integer> ts1 = new TreeSet <Integer>(a1);
		System.out.println("The TreeSet is "+ts1);
		ArrayList <Integer> a2 = new ArrayList<Integer>(s2);
		System.out.println("HashSet to ArrayList: "+a2);
	}
}
