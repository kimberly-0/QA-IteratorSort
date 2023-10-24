import java.util.*;

public class MainCities {

    public static void printByKey(String key, HashMap<String, String> map) {
        System.out.printf("%-20s %s %n", key, map.get(key));
    }

    public static void main(String[] args) {

        HashMap<String, String> citiesUK = new HashMap<>();

        citiesUK.put("Newcastle upon Tyne", "Tyne and Wear");
        citiesUK.put("Southampton", "Hampshire");
        citiesUK.put("Aberdeen", "Aberdeen City");
        citiesUK.put("Beaumaris", "Anglesey");
        citiesUK.put("Amlwch", "Anglesey");
        citiesUK.put("Holyhead", "Anglesey");

        // --- BEFORE SORTING ---

        System.out.println("Before Sorting");

        Iterator<String> it = citiesUK.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            printByKey(key, citiesUK);
        }

        System.out.println("\n");

        // --- SORTING ---

        System.out.println("After Sorting");

        TreeMap<String,String> tm = new TreeMap<String,String>(citiesUK);

        Iterator<String> itr = tm.keySet().iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            printByKey(key, citiesUK);
        }
    }
}
