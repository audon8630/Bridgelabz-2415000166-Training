public class UserInputValidation {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            if (age >= 18) {
                return true;
            } else {
                System.out.println("User is under 18.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input: " + input);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("20"));   // true
        System.out.println(isValidAge("abc"));  // false
        System.out.println(isValidAge("15"));   // false
    }
}
