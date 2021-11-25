package Basic_CF_Package;

import java.util.TreeSet;

public class CF12_tree_hash_set {

    public static void main(String[] args) {

        //SortedSet is a subInterface of Set, which guarantees that the elements in the set are sorted.
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("London");
        treeSet.add("Paris");
        treeSet.add("New York");
        treeSet.add("San Francisco");
        treeSet.add("Beijing");

        System.out.println("Sorted Tree Set is :: " + treeSet);

        //using some common method of set
        System.out.println("\nFirst() :: " + treeSet.first());
        System.out.println("Last() :: " + treeSet.last());

        System.out.println("\nHeadSet(New York) :: " + treeSet.headSet("Ney York"));
        System.out.println("TailSet(New York) :: " + treeSet.tailSet("Ney York"));

        System.out.println("\nLower(P) :: " + treeSet.lower("P")); //returns the largest element less than P in treeSet
        System.out.println("Higher(P) :: " + treeSet.higher("P")); // returns the smallest element greater than P in treeSet

        System.out.println("\nfloor(P) :: " + treeSet.floor("P")); //returns the largest element less than or equal to P in treeSet
        System.out.println("ceiling(P) :: " + treeSet.ceiling("P")); //returns the smallest element greater than or equal to P in treeSet

        System.out.println("\npollFirst(P) :: " + treeSet.pollFirst()); //removes the first element in treeSet and returns the removed element
        System.out.println("pollLast(P) :: " + treeSet.pollLast()); //removes the last element in treeSet and returns the removed element

        System.out.println("\nNew TreeSet :: " + treeSet);
    }
}

/*
If you don’t need to maintain a sorted set when updating a set, you should use a hash
set, because it takes less time to insert and remove elements in a hash set. When you
need a sorted set, you can create a tree set from the hash set.

OUTPUT

Sorted Tree Set is :: [Beijing, London, New York, Paris, San Francisco]

First() :: Beijing
Last() :: San Francisco

HeadSet(New York) :: [Beijing, London, New York]
TailSet(New York) :: [Paris, San Francisco]

Lower(P) :: New York
Higher(P) :: Paris

floor(P) :: New York
ceiling(P) :: Paris

pollFirst(P) :: Beijing
pollLast(P) :: San Francisco

New TreeSet :: [London, New York, Paris]

 */