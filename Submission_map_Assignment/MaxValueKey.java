import java.util.*;
public class MaxValueKey {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = "";
        int maxVal = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxVal = map.get(key);
                maxKey = key;
            }
        }

        System.out.println("Key with highest value: " + maxKey);
    }
}
