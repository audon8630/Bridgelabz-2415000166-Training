import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    public void processTransaction() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random rand = new Random();
        int status = rand.nextInt(3); // 0,1,2

        if (status == 0) {
            throw new NegativeAmountException("Transaction failed: Negative amount not allowed!");
        } else if (status == 1) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
        } else if (status == 2) {
            throw new NetworkFailureException("Transaction failed: Network issue occurred!");
        } else {
            System.out.println("Transaction successful!");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.processTransaction();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
