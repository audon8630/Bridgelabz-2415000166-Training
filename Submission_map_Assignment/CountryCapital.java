import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Italy", "Rome");
        map.put("Canada", "Ottawa");

        String country = "Japan";

        if (map.containsKey(country)) {
            System.out.println("Capital: " + map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        for (String c : map.keySet()) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}
