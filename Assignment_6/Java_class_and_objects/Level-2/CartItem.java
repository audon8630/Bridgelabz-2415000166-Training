class CartItem {
    String itemName;
    double price;
    int quantity;
    public void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
    }
    public void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
    }
    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.addItem("Laptop", 50000, 2);
        item.displayTotalCost();
        item.removeItem();
        item.displayTotalCost();
    }
}