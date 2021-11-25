package Basic_CF_Package;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class CF7_queues {

    public static void main(String[] args) {

        /*
        you can use LinkedList to create a queue.
        LinkedList is ideal for queue operations because it is efficient for inserting and removing
        elements from both ends of a list.
         */
        Queue<Integer> queue = new LinkedList<>();

        //adding element to the queue by using offer()
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        //trying iterator to print the queue (not deleting the queue while displaying like remove method of display)
        Iterator<Integer> iterator = queue.iterator();

        System.out.println("Display Queue using Iterator");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        //display the queue
        System.out.println("\nDisplay Queue using Remove Method");
        while (queue.size() > 0)
            System.out.print(queue.remove() + " ");

        if (queue.isEmpty())
            System.out.println("\n\nQueue is empty now :(");

        //Retrieve & Remove the head of Q (Return null if q is empty)
        System.out.println("\nPoll :: " + queue.poll());

        //Retrieve & Remove the head of Q (Throws exception if q is empty)
        try {
            System.out.println("Remove :: " + queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("\nQueue Under Flow by Remove :(");
        }

        //Retrieve ONLY the head of Q (Throws exception if q is empty)
        try {
            System.out.println("Peek :: " + queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Queue Under Flow by Peek :(");
        }

        //Retrieve ONLY the head of Q (Throws exception if q is empty)
        try {
            System.out.println("Element :: " + queue.element());
        } catch (NoSuchElementException e) {
            System.out.println("Queue Under Flow by Element :(");
        }
    }
}

/*
OUTPUT

Display Queue using Iterator
10 20 30 40 50

Display Queue using Remove Method
10 20 30 40 50

Queue is empty now :(

Poll :: null

Queue Under Flow by Remove :(
Queue Under Flow by Peek :(
Queue Under Flow by Element :(
 */