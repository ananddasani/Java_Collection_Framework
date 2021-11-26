package Basic_CF_Package;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CF14_hash_map {

    public static void main(String[] args) {

        //The HashMap class is efficient for locating a value, inserting an entry, and deleting an entry.
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Anand");
        hashMap.put(2, "Om");
        hashMap.put(3, "Meet");
        hashMap.put(4, "Jay");
        hashMap.put(5, "Ria");
        hashMap.put(6, "Jia");

        //prevent overriding the existing value key
        hashMap.putIfAbsent(3, "Meet");

        //display the map
        System.out.println("Display entry on basis of Hash Code...");
        System.out.println(hashMap);

        //remove one basis of key
        System.out.println("\nRemoving key 4...");
        hashMap.remove(4);
        System.out.println("Now the map is :: " + hashMap);

        //contains
        System.out.println("\nDoes Map contain Anand ? " + hashMap.containsValue("Anand"));

        //fetch data by using key
        System.out.println("Display the key value of 1 :: " + hashMap.get(1));


        //get keys and values from each entry
        System.out.println("\nDisplaying the HashMap using for loop....");

        //get all the entries into a set
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet)
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}

/*
If you don’t need to maintain an order in a map when updating it, use a HashMap.
When you need to maintain the insertion order or access order in the map, use a
LinkedHashMap. When you need the map to be sorted on keys, use a TreeMap

OUTPUT

Display entry on basis of Hash Code...
{1=Anand, 2=Om, 3=Meet, 4=Jay, 5=Ria, 6=Jia}

Removing key 4...
Now the map is :: {1=Anand, 2=Om, 3=Meet, 5=Ria, 6=Jia}

Does Map contain Anand ? true
Display the key value of 1 :: Anand

Displaying the HashMap using for loop....
1	Anand
2	Om
3	Meet
5	Ria
6	Jia

 */