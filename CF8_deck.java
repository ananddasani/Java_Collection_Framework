package Basic_CF_Package;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class CF8_deck {

    public static void main(String[] args) {

        /*
        you can use LinkedList to create a queue.
        LinkedList is ideal for queue operations because it is efficient for inserting and removing
        elements from both ends of a list.

        Deque supports element insertion and removal at both ends. The name deque is short for
        “double-ended queue” and is usually pronounced “deck.”
         */
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(20);
        deque.addFirst(30);
        deque.addLast(10);
        deque.addLast(5);

        //display the dequeue
        Iterator<Integer> iterator = deque.iterator();

        System.out.print("Dequeue is :: ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        //getting first & last element
        System.out.println("\n\nFirst element of DeQueue is :: " + deque.getFirst());
        System.out.println("Last element of DeQueue is :: " + deque.getLast());

        //removing first & last element
        System.out.println("\nRemoving First element of DeQueue :: " + deque.removeFirst());
        System.out.println("Removing Last element of DeQueue :: " + deque.removeLast());


        System.out.print("\nNow DeQueue is :: ");
        //setting iterator to the first element
        iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}

/*
OUTPUT

Dequeue is :: 30 20 10 5

First element of DeQueue is :: 30
Last element of DeQueue is :: 5

Removing First element of DeQueue :: 30
Removing Last element of DeQueue :: 5

Now DeQueue is :: 20 10
 */