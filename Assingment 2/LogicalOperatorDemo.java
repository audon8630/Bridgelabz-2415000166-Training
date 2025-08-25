public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int marks = 85;

       boolean isPass = marks >= 40;
        boolean isDistinction = (marks >= 75 && marks <= 100);

        System.out.println("Passed: " + isPass);
        System.out.println("Distinction: " + isDistinction);
        System.out.println("Failed: " + !isPass);
    }
}
