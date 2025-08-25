public class BooleanExpressionDemo {
    public static void main(String[] args) {
        int number = 25;

        
        boolean isPositive = number > 0;
        boolean isEven = (number % 2 == 0);

        System.out.println("Number is positive: " + isPositive);
        System.out.println("Number is even: " + isEven);
    }
}
