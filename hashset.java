import java.io.*;
import java.util.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
class hashset {
    public static void main(String[] args) {

        // Instantiate an object of HashSet
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);
        HashSet<String> hss = new HashSet<>();
        hss.add("Geeks");
        hss.add("A");
        hss.add("B");
        hss.add("Z");

        System.out.print("Using iterator : ");
        Iterator<String> iterator = hss.iterator();

        // Traversing HashSet
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();

        // Using enhanced for loop to iterate
        // Over the HashSet
        System.out.print("Using enhanced for loop : ");
        for (String element : hss)
            System.out.print(element + " , ");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        // Print size and content of the Map
        System.out.println("Size of map is:" + map.size());
        System.out.println(map);
        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is: " + a);
        }

        // Printing the Size and Element of HashSet
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        System.out.println("Elements in HashSet2: " + hss);

        System.out.println("Remove element:" + hss.remove("Geeks"));
        System.out.println("After removing element:" + hss);
    }
}

//        The Hashtable class implements a hash table, which maps keys to values.
//        Any non-null object can be used as a key or as a value.
//        To successfully store and retrieve objects from a hashtable,
//        the objects used as keys must implement the hashCode method and the equals method.

// Main class






