class Item {
    int itemCode;
    String itemName;
    double price;
    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 101;
        i.itemName = "Pen";
        i.price = 10.5;
        i.displayItem(5);
    }
}