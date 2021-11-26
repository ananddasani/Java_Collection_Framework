package Basic_CF_Package;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CF17_count_occurrence_of_word {

    public static void main(String[] args) {

        String text = "Good Morning. Have a Good Class. Have a good Visit. Have Fun!";

        //Create TreeMap to hold the words
        TreeMap<String , Integer> treeMap = new TreeMap<>();

        //collect all the words form the string
        text = text.trim();
        String[] words = text.split(".,;:!?");

        for (int i = 0; i < words.length; i++){

            String key = words[i].toLowerCase();

            //add the new entry
            if (!(treeMap.containsKey(key))){
                treeMap.put(key, 1);
            }
            else {
                //update the entry's value
                int value = treeMap.get(key);
                value++;
                treeMap.put(key, value);
            }
        }

        //display the result
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet)
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}
