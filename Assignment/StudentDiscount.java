import java.util.Scanner;

public class StudentDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fee: ");
        int fee = input.nextInt();

        System.out.print("Enter discount percent: ");
        int discountPercent = input.nextInt();

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
