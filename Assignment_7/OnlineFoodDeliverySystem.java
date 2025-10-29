import java.util.*;

interface Discountable {
    void applyDiscount(double percent);
    void getDiscountDetails();
}

abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    @Override
    public void applyDiscount(double percent) {
        price -= (price * percent / 100);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied! New price per item: " + price);
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; 
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
            item.applyDiscount(10);
            item.getDiscountDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}
