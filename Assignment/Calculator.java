import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + num1 + " and " + num2 + " is " 
                           + sum + ", " + diff + ", " + product + ", " + quotient);
    }
}
