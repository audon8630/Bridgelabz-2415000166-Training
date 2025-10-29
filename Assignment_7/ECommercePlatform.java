interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { if (price >= 0) this.price = price; }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; } 
    @Override public double calculateTax() { return getPrice() * 0.18; } 
    @Override public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.15; }
    @Override public double calculateTax() { return getPrice() * 0.05; }
    @Override public String getTaxDetails() { return "VAT 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.02; } 
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(101, "Smartphone", 30000),
                new Clothing(102, "Jeans", 2500),
                new Groceries(103, "Olive Oil", 800)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = p instanceof Taxable ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.printf("%s (ID:%d) - Price: %.2f, Tax: %.2f, Discount: %.2f, Final: %.2f%n",
                    p.getName(), p.getProductId(), p.getPrice(), tax, discount, finalPrice);

            if (p instanceof Taxable) {
                System.out.println("Tax Info: " + ((Taxable)p).getTaxDetails());
            }
            System.out.println("-----");
        }
    }
}
