import java.util.function.Function;
import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = input.nextLine();

        Function<String, Integer> lengthChecker = str -> str.length();
        int length = lengthChecker.apply(message);

        System.out.println("Message length: " + length);

        if (length > 100)
            System.out.println("Message exceeds character limit!");
        else
            System.out.println("Message within limit.");

        input.close();
    }
}
