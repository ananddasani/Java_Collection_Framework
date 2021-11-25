package Basic_CF_Package;

import java.util.HashSet;
import java.util.Set;

public class CF10_hash_set {

    public static void main(String[] args) {

        /*
        Set Methods
            add(), addAll(), iterator(), remove(), removeAll(), retainAll(),
            clear(), size(), toArray(), contains(), containsAll(), hashCode()
         */

        /*
        By default,
        the initial capacity is 16 and the load factor is 0.75. If you know the size of your set, you can
        specify the initial capacity and load factor in the constructor. Otherwise, use the default setting.
        The load factor is a value between 0.0 and 1.0.
         */
        Set<String> set1 = new HashSet<>();

        //Add String to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("Beijing");
        set1.add("San Francisco");

        System.out.print("Set 1 is :: ");
        System.out.println(set1); // [Beijing, San Francisco, New York, London, Paris]
        System.out.println(set1.size() + " elements in set 1");

        System.out.println("\nRemoving London...");
        set1.remove("London");
        System.out.println("set1 " + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("Paris");
        set2.add("Shanghai");

        System.out.println("\nSet2 " + set2);
        System.out.println(set2.size() + " elements in set 2");

        System.out.println("\nIs Beijing in Set2 ? " + set2.contains("Beijing"));

        //INTERSECTION OPERATION
//        System.out.println("\nGetting Common elements form set1 & set2...");
//        set1.retainAll(set2); //retains the common elements in set1
//        System.out.println("INTERSECTION :: " + set1);

        //UNION OPERATION
        System.out.println("\nAdding set2 to set1...");
        set1.addAll(set2);
        System.out.println("UNION :: " + set1);

        //just display both the sets
        System.out.println("\nSet1 " + set1);
        System.out.println("Set2 " + set2);

        //DIFFERENCE
        System.out.println("\nRemoving set2 from set1...");
        set1.removeAll(set2);
        System.out.println("DIFFERENCE :: " + set1);
    }
}

/*
the strings are not stored in the order in which they are inserted
into the set. There is no particular order for the elements in a hash set. To impose an order
on them, you need to use the LinkedHashSet class,


OUTPUT
Set 1 is :: [Beijing, San Francisco, New York, London, Paris]
5 elements in set 1

Removing London...
set1 [Beijing, San Francisco, New York, Paris]

Set2 [Shanghai, London, Paris]
3 elements in set 2

Is Beijing in Set2 ? false

Adding set2 to set1...
UNION :: [Beijing, San Francisco, New York, Shanghai, London, Paris]

Set1 [Beijing, San Francisco, New York, Shanghai, London, Paris]
Set2 [Shanghai, London, Paris]

Removing set2 from set1...
DIFFERENCE :: [Beijing, San Francisco, New York]
 */