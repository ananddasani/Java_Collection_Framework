package Basic_CF_Package;

import java.util.Collections;
import java.util.PriorityQueue;

public class CF9_priority_queue {

    public static void main(String[] args) {

        /*
        By default, the priority queue orders its elements according to their natural ordering using
        Comparable.

        The element with the least value is assigned the highest priority and thus is
        removed from the queue first. If there are several elements with the same highest priority, the
        tie is broken arbitrarily.

        You can also specify an ordering using Comparator in the constructor PriorityQueue(initialCapacity, comparator).
        create a priority queue using the comparator obtained from Collections.reverseOrder(),
        which orders the elements in reverse order,
         */

        PriorityQueue<Integer> PQ1 = new PriorityQueue<>();

        PQ1.offer(10);
        PQ1.offer(9);
        PQ1.offer(8);
        PQ1.offer(7);
        PQ1.offer(6);
        PQ1.offer(5);

        //display the PQ
        System.out.print("Default Priority (Comparable) ::  ");

        while(PQ1.size() > 0)
            System.out.print(PQ1.remove() + " ");

        //Reversing the Priority
        PriorityQueue<Integer> PQ2 = new PriorityQueue<>(Collections.reverseOrder());

        PQ2.offer(5);
        PQ2.offer(6);
        PQ2.offer(7);
        PQ2.offer(8);
        PQ2.offer(9);
        PQ2.offer(10);

        //display the PQ
        System.out.print("\nReversed Priority (Comparator) ::  ");

        while(PQ2.size() > 0)
            System.out.print(PQ2.remove() + " ");
    }
}

/*
Default Priority (Comparable) ::  5 6 7 8 9 10
Reversed Priority (Comparator) ::  10 9 8 7 6 5
 */