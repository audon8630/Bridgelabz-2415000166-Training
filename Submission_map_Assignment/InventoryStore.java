import java.util.*;

public class InventoryStore {
    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Milk", 10);
        stock.put("Bread", 5);

        stock.put("Milk", stock.get("Milk") - 3);

        if (stock.get("Bread") <= 1) {
            stock.put("Bread", 0);
        }

        stock.put("Milk", stock.get("Milk") + 20);

        String product = "Bread";

        if (stock.containsKey(product)) {
            System.out.println(product + " left: " + stock.get(product));
        } else {
            System.out.println("Not stocked.");
        }

        System.out.println("Out of stock items:");
        for (String key : stock.keySet()) {
            if (stock.get(key) == 0) {
                System.out.println(key);
            }
        }
    }
}
