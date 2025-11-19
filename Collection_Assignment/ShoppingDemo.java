import java.util.ArrayList;
import java.util.List;

class Product {
    protected String name;
    protected double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
}

class Cart<T> {
    private List<T> items;
    
    public Cart() {
        this.items = new ArrayList<>();
    }
    
    public void addItem(T item) {
        items.add(item);
    }
    
    public void removeItem(T item) {
        items.remove(item);
    }
    
    public void displayItems() {
        System.out.println("Cart items:");
        for (T item : items) {
            System.out.println("  - " + item);
        }
    }
}

public class ShoppingDemo {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop", 999.99));
        electronicsCart.addItem(new Electronics("Smartphone", 699.99));
        
        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt", 29.99));
        clothingCart.addItem(new Clothing("Jeans", 49.99));
        
        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();
        
        System.out.println("Clothing Cart:");
        clothingCart.displayItems();
    }
}