import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class OnlineOrder {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int status = rand.nextInt(3); // 0, 1, 2

        if (status == 0) {
            throw new OutOfStockException("Product is out of stock!");
        } else if (status == 1) {
            throw new PaymentFailedException("Payment failed! Please try again.");
        } else {
            System.out.println("Order placed successfully!");
        }
    }
}

public class OrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();

        try {
            order.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
