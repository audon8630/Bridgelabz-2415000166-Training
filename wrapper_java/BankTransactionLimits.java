public class BankTransactionLimits {

    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - withdrawn;
    }

    public static void main(String[] args) {
        Double dailyLimit1 = 10000.0;
        double withdrawn1 = 2500.0;

        Double dailyLimit2 = null;
        double withdrawn2 = 1000.0;

        System.out.println("Remaining Limit (Account 1): " + getRemainingLimit(dailyLimit1, withdrawn1));
        System.out.println("Remaining Limit (Account 2): " + getRemainingLimit(dailyLimit2, withdrawn2));
    }
}
