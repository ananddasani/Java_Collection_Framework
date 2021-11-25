package Basic_CF_Package;

import java.util.LinkedHashSet;
import java.util.Set;

public class CF11_linked_hash_set {

    public static void main(String[] args) {

        /*
        Set Methods
            add(), addAll(), iterator(), remove(), removeAll(), retainAll(),
            clear(), size(), toArray(), contains(), containsAll(), hashCode()
         */

        /*
            LinkedHashSet extends HashSet with a linked-list implementation that supports an ordering of the elements in the set.
            The elements in a HashSet are not ordered, but the elements
            in a LinkedHashSet can be retrieved in the order in which they were inserted into the set. A
            LinkedHashSet can be created by using one of its four constructors
         */

        /*
        The LinkedHashSet maintains the order in which the elements are inserted. To impose a
        different order (e.g., increasing or decreasing order), you can use the TreeSet class
         */
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //Add String to linkedHashSet
        linkedHashSet.add("London");
        linkedHashSet.add("Paris");
        linkedHashSet.add("New York");
        linkedHashSet.add("Beijing");
        linkedHashSet.add("San Francisco");

        System.out.print("LinkedHashSet is :: ");
        System.out.println(linkedHashSet); // [London, Paris, New York, Beijing, San Francisco]
        System.out.println(linkedHashSet.size() + " elements in set 1");

        System.out.println("\nRemoving London...");
        linkedHashSet.remove("London");

        System.out.print("Now the LinkedHashSet is [");

        //Display using for each loop
        for (Object ele : linkedHashSet)
            System.out.print(ele + " ");

        System.out.println("\b]");
    }
}

/*
OUTPUT

LinkedHashSet is :: [London, Paris, New York, Beijing, San Francisco]
5 elements in set 1

Removing London...
Now the LinkedHashSet is [Paris New York Beijing San Francisco]
 */