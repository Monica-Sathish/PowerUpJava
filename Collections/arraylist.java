package collections_oops;
import java.util.*;
public class arraylist {
	public static void main(String[] args) {
		//ARRAYLIST IS FASTER THAN LINKEDLIST
		ArrayList <Integer> a1 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int len = in.nextInt();
		for(int i=1;i<=len;i++) {
			a1.add(in.nextInt());
		}
		System.out.println(a1.remove(2));
		ListIterator <Integer> iterator = a1.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
		System.out.println("Enter search element: ");
		int search = in.nextInt();
		if(a1.contains(search)) {
			System.out.println("Its present FIRST ocurrance at - "+a1.indexOf(search)+" LAST occurance at - "+a1.lastIndexOf(search));
		}else {
			System.out.println("Not present");
		}
		System.out.println("Sort the arraylist");
		Collections.sort(a1);
		for(Integer a:a1) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Reverse the arraylist");
		Collections.reverse(a1);
		for(Integer b:a1) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("Add elements and remove elements");
		a1.add(3,45);//add element at index 3
		System.out.println(a1);
		a1.add(3,60);//add element at index 3
		System.out.println(a1);
		a1.remove(3);//index value
		System.out.println(a1);
		System.out.println("The value in index 3 is "+a1.get(3));
		ArrayList<Integer> a2clone = (ArrayList<Integer>) a1.clone();
		System.out.println("The a1 arraylist: "+a1);
		System.out.println("The a2clone arraylist: "+a2clone);
		System.out.println(a2clone.isEmpty());
		a1.clear();
		System.out.println(a1.size()+"   "+a2clone.size());
		System.out.println(a1.isEmpty());
	}
}
