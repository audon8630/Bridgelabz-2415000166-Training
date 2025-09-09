import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double number;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
            total += number;
        } while (number != 0);

        System.out.println("Total sum: " + total);
    }
}
