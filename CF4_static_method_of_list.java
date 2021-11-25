package Basic_CF_Package;

import java.util.*;

public class CF4_static_method_of_list {

    public static void main(String[] args) {

        //sorting a list
        List<String> list = Arrays.asList("red", "green", "blue");
        System.out.print("List is :: ");
        System.out.println(list);

        System.out.print("Sorted list is :: ");
        Collections.sort(list);
        System.out.println(list);

        //sorting in reverse order
        List<Integer> list1 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.print("\nReverseSorted list is :: ");
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        //reverse the list
        System.out.print("Reversing ReverseSorted List :: ");
        Collections.reverse(list1);
        System.out.println(list1);

        //shuffle the list
        Collections.shuffle(list1);
        System.out.print("\nShuffled List is :: ");
        System.out.println(list1);

        System.out.println();
        /*
        You can also use the shuffle(List, Random) method to randomly reorder the elements in
        a list with a specified Random object. Using a specified Random object is useful to generate a
        list with identical sequences of elements for the same original list.
         */
        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list3 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list1, new Random(20));
        Collections.shuffle(list2, new Random(20));
        System.out.println(list2);
        System.out.println(list3);

        System.out.println();

        //copying list5 into list4
        List<Integer> list4 = Arrays.asList(1,2,3,4,5); // 1 2 3 will be replaced by 6 7 8
        List<Integer> list5 = Arrays.asList(6,7,8);

        Collections.copy(list4,list5);
        System.out.print("list4 is :: ");
        System.out.println(list4); //6 7 8 4 5

        System.out.println();

        /*
        You can use the nCopies(int n, Object o) method to create an --immutable-- list that
        consists of n copies of the specified object. For example, the following code creates a list with
        five Calendar objects

        The list created from the nCopies method is immutable, so you cannot add, remove, or
        update elements in the list. All the elements have the same references.
         */

        /*
        You can use the fill(List list, Object o) method to replace all the elements in the
        list with the specified element. For example, the following code displays [black, black,
        black].
         */

        //min & max
        System.out.println("Maximum element from list1 is :: " + Collections.max(list1)); //(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println("Minimum element from list1 is :: " + Collections.min(list1)); //(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        System.out.println();

        //disJoint (Return True if there is no element of c1 in c2)
        Collection<String> collection1 = Arrays.asList("Anand" , "Jay");
        Collection<String> collection2 = Arrays.asList("Meet" , "Om");
        Collection<String> collection3 = Arrays.asList("Anand" , "Ajay");

        System.out.println(Collections.disjoint(collection1, collection2)); //true (No one is matching)
        System.out.println(Collections.disjoint(collection1, collection3)); // false (Anand is matching)

        System.out.println();

        //count the frequency
        Collection<Integer> collection4 = Arrays.asList(10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println("Frequency of 10 in collection4 is :: " + Collections.frequency(collection4, 10));
    }
}

/*
OUTPUT

List is :: [red, green, blue]
Sorted list is :: [blue, green, red]

ReverseSorted list is :: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Reversing ReverseSorted List :: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Shuffled List is :: [5, 8, 3, 4, 6, 7, 9, 1, 10, 2]

[blue, yellow, red, green]
[yellow, red, green, blue]

list4 is :: [6, 7, 8, 4, 5]

Maximum element from list1 is :: 10
Minimum element from list1 is :: 1

true
false

Frequency of 10 in collection4 is :: 5
 */