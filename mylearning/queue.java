import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.*;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		PriorityQueue pqr = new PriorityQueue(2, Comparator.reverseOrder());
		pq.add(1234);
		pq.add(1);
		pq.add(45);
		pq.remove();
		pqr.add(1);
		pqr.add(2);
		pqr.add(3);
		System.out.println(pqr);
		System.out.println(pq);
		
		ConcurrentLinkedQueue<Integer> c1 = new ConcurrentLinkedQueue<Integer>();
		c1.add(100);
		c1.add(123);
		c1.add(34);
		System.out.println(c1.poll()); //remove and print top element
		System.out.println(c1);
		
		Deque<Integer> d1 = new ArrayDeque<>();
		d1.addFirst(12);
		d1.addFirst(1);
		d1.addLast(40);
		d1.pollFirst();
		d1.pollLast();
		System.out.println(d1);
	}

}
