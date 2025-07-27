import java.util.HashMap;
import java.util.TreeMap;

public class Map_exercise {

    String yana;

    public static void main(String[] args) {

        HashMap<String, String> druzya = new HashMap<String, String>(); // create a hashmap
        druzya.put("vanya", "ariel");
        druzya.put("tomer", "ariel");
        druzya.put("yana", "krasnolesye"); // add keys and values
        System.out.println(druzya); // print the hashmap

        int size = druzya.size();
        System.out.println(size); // print the size of the hashmap

        for (String i : druzya.keySet()) {
            System.out.println(i);
        } // print all of the keys separately

        for (String i : druzya.values()) {
            System.out.println(i);
        } // print all of the values separately

        for (String i : druzya.keySet()) {
            System.out.println("key: " + i + " value: " + druzya.get(i));
        } // print the keys separately with their values

        String yana = druzya.get("yana");
        System.out.println(yana); // print the value of the key 'yana'

        druzya.remove("tomer");
        System.out.println(druzya); // remove the key 'tomer' with its value and print the map

        druzya.clear();
        System.out.println(druzya); // clear all of the map and print it

        TreeMap<String, Integer> treemap = new TreeMap<>(); // create treemap
        treemap.put("b", 2);
        treemap.put("C", 3);
        treemap.put("A", 1); // add keys and values
        System.out.println(treemap); // print the map

        int b = treemap.get("b");
        System.out.println(b); // print the value of the key 'b'

        // all of the other things that u can do with the treemap are basically almost
        // the same as the hashmap
        // so theres no need to write them again

        // the LinkedHashMap is completely the same as the hashmap
        // BUT it quote on quote 'supports multiple values but only one null key'
        // as opposed to the hashmap it only 'supports multiple values but only one null
        // key'
        // so theres again no need to write the things that it can do again
    }
}
