import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);

        HashMap<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);

        HashMap<String, Integer> result = new HashMap<>(m1);

        for (String key : m2.keySet()) {
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + m2.get(key));
            } else {
                result.put(key, m2.get(key));
            }
        }

        System.out.println(result);
    }
}
