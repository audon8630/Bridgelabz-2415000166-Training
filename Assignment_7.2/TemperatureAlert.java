import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature threshold: ");
        double threshold = input.nextDouble();

        System.out.print("Enter current temperature: ");
        double current = input.nextDouble();

        Predicate<Double> alert = temp -> temp > threshold;

        if (alert.test(current)) {
            System.out.println("Alert! Temperature crossed the threshold.");
        } else {
            System.out.println("Temperature is within safe limits.");
        }

        input.close();
    }
}
