interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of RS " + amount + " processed successfully (default).");
    }
}

class UPI implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of RS " + amount + " via GPay.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor Gpay = new UPI();
        Gpay.processPayment(250.00);
        Gpay.refund(50.00);
    }
}
