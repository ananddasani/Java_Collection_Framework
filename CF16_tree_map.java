package Basic_CF_Package;

import java.util.Map;
import java.util.Set;
import java.util.SplittableRandom;
import java.util.TreeMap;

public class CF16_tree_map {

    public static void main(String[] args) {

        //The TreeMap class is efficient for traversing the keys in a sorted order.
        TreeMap<Integer, String> treeMap = new TreeMap<>() ;

        treeMap.put(1, "Anand");
        treeMap.put(2, "Om");
        treeMap.put(3, "Meet");
        treeMap.put(4, "Jay");

        //prevent overriding the existing value key
        treeMap.putIfAbsent(3, "Meet");

        //display the tree
        System.out.println("Display entry in ascending order of the key...");
        System.out.println(treeMap);

        //some of common methods provided by the sortedMap class
        System.out.println("\nfirstKey() :: " + treeMap.firstKey());
        System.out.println("lastKey() :: " + treeMap.lastKey());

        System.out.println("\nheadMap(toKey) :: " + treeMap.headMap(3));
        System.out.println("tailMap(fromKey) :: " + treeMap.tailMap(3));

        System.out.println("\nlowerKey(3) " + treeMap.lowerKey(3));
        System.out.println("floor(3) " + treeMap.floorKey(3));
        System.out.println("ceilingKey(3) " + treeMap.ceilingKey(3));
        System.out.println("higherKey(3) " + treeMap.higherKey(3));

        System.out.println("\nlowerEntry(3) " + treeMap.lowerEntry(3));
        System.out.println("floor(3) " + treeMap.floorEntry(3));
        System.out.println("ceilingEntry(3) " + treeMap.ceilingEntry(3));
        System.out.println("higherEntry(3) " + treeMap.higherEntry(3));

        System.out.println("\npollFirstEntry() " + treeMap.pollFirstEntry());
        System.out.println("pollLastEntry() " + treeMap.pollLastEntry());

        //display tree map using for each loop
        System.out.println("\nDisplaying TeeMap using for each loop...");

        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet)
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}

/*
OUTPUT

Display entry in ascending order of the key...
{1=Anand, 2=Om, 3=Meet, 4=Jay}

firstKey() :: 1
lastKey() :: 4

headMap(toKey) :: {1=Anand, 2=Om}
tailMap(fromKey) :: {3=Meet, 4=Jay}

lowerKey(3) 2
floor(3) 3
ceilingKey(3) 3
higherKey(3) 4

lowerEntry(3) 2=Om
floor(3) 3=Meet
ceilingEntry(3) 3=Meet
higherEntry(3) 4=Jay

pollFirstEntry() 1=Anand
pollLastEntry() 4=Jay

Displaying TeeMap using for each loop...
2	Om
3	Meet
 */
