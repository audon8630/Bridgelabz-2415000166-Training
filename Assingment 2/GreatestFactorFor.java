import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // initialize with 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // stop at the first (largest) factor found
            }
        }

        System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
    }
}
