package collections_oops;

import java.util.*;

public class queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Queue <Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(23);
		ll.add(88);
		ll.add(46);
		ll.add(88);
		ll.offer(2);
		System.out.println(ll);
		Deque <Integer> ad = new ArrayDeque<Integer>(ll);
		ad.addFirst(90);//only in deque
		ad.addLast(66);//only in deque
		ad.add(44);
		ad.offer(64);
		System.out.println(ad);
		Queue <Integer> pq = new PriorityQueue<Integer>(ad);
		pq.add(18);
		pq.add(34);
		pq.add(3);
		System.out.println(pq);//no order
		ll.remove();
		ad.remove();
		pq.remove();
		System.out.println("After removal of first elements");
		System.out.println(ll);
		System.out.println(ad);
		System.out.println(pq);
		System.out.println("Prints the 1st element and deletes it");
		System.out.println(ll.poll());
		System.out.println(ad.pollFirst());//only in deque
		System.out.println(ad.pollLast());//only in deque
		System.out.println(ad.removeFirst());//only in deque
		System.out.println(ad.removeLast());//only in deque
		System.out.println(pq.poll());
		System.out.println("After removal");
		System.out.println(ll);
		System.out.println(ad);
		System.out.println(pq);
		System.out.println("Printing the top and 1st elements");
		System.out.println(ll.element());
		System.out.println(ll.peek());
		System.out.println(ad.getFirst());//only in deque
		System.out.println(ad.getLast());//only in deque
		System.out.println(ad.peekFirst());//only in deque
		System.out.println(ad.peekLast());//only in deque
		System.out.println(pq.element());
		System.out.println(pq.peek());
	}
}
