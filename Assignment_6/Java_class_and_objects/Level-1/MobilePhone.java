class MobilePhone {
    String brand;
    String model;
    double price;
    public void displayPhone() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S21";
        phone.price = 70000;
        phone.displayPhone();
    }
}