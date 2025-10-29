public class DigitalPayment {
    public static void main(String[] args) {

        Vehicle UPI = (Amount) -> {
            System.out.println("Balance is "+Amount);
        };

        Vehicle Credit_Card = (Amount) -> {
            System.out.println("Balance is "+Amount);

        };

        Vehicle Wallet = (Amount) -> {
            System.out.println("Balance is "+Amount);
        };

        Wallet.pay(500);
        UPI.pay(1000);
        Credit_Card.pay(2000);
    }

    public interface Vehicle {
        void pay(int Amount);
    }
}
