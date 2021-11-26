package Basic_CF_Package;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CF15_linked_hash_map {

    public static void main(String[] args) {

        /*
        LinkedHashMap extends HashMap with a linked-list implementation that supports an
        ordering of the entries in the map. The entries in a HashMap are not ordered, but the entries
        in a LinkedHashMap can be retrieved either in the order in which they were inserted into the
        map (known as the insertion order) or in the order in which they were last accessed, from
        least recently to most recently accessed (access order). The no-arg constructor constructs a
        LinkedHashMap with the insertion order. To construct a LinkedHashMap with the access
        order, use LinkedHashMap(initialCapacity, loadFactor, true).
         */
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75F, true) ;

        linkedHashMap.put(1, "Anand");
        linkedHashMap.put(2, "Om");
        linkedHashMap.put(3, "Meet");
        linkedHashMap.put(4, "Jay");

        //prevent overriding the existing value key
        linkedHashMap.putIfAbsent(3, "Meet");

        //accessing to change the order
        linkedHashMap.get(4);
        linkedHashMap.get(4);
        linkedHashMap.get(3);
        linkedHashMap.get(1);
        linkedHashMap.get(1);
        linkedHashMap.get(1);

        System.out.println("AccessOrder True last recently to most recently.. ");
        System.out.println(linkedHashMap);

        System.out.println("\nDisplaying the linkedHashMap using for loop...");

        Set<Map.Entry<Integer, String>> entrySet = linkedHashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet)
            System.out.println(entry);
    }
}

/*
OUTPUT

AccessOrder True last recently to most recently..
{2=Om, 4=Jay, 3=Meet, 1=Anand}

Displaying the linkedHashMap using for loop...
2=Om
4=Jay
3=Meet
1=Anand
 */