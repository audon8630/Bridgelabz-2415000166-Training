import java.util.*;
public class InvertMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        for (String key : map.keySet()) {
            int val = map.get(key);

            if (!inverted.containsKey(val)) {
                inverted.put(val, new ArrayList<>());
            }
            inverted.get(val).add(key);
        }

        System.out.println(inverted);
    }
}
