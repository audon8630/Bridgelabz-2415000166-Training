import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    public void convert(double value, char unit) throws InvalidTemperatureException {
        if (unit == 'C' || unit == 'c') {
            if (value < -273.15) {
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            }
            double fahrenheit = (value * 9 / 5) + 32;
            System.out.println(value + "°C = " + fahrenheit + "°F");
        } else if (unit == 'F' || unit == 'f') {
            if (value < -459.67) {
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            }
            double celsius = (value - 32) * 5 / 9;
            System.out.println(value + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
    }
}

public class TemperatureMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter tc = new TemperatureConverter();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Enter unit (C/F): ");
        char unit = sc.next().charAt(0);

        try {
            tc.convert(value, unit);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
